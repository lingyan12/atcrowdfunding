package com.atguigu.scw.user.service.impl;



import com.atguigu.scw.user.bean.TMember;
import com.atguigu.scw.user.bean.TMemberAddress;
import com.atguigu.scw.user.bean.TMemberAddressExample;
import com.atguigu.scw.user.bean.TMemberExample;
import com.atguigu.scw.user.enums.UserExceptionEnums;
import com.atguigu.scw.user.exception.UserException;
import com.atguigu.scw.user.mapper.TMemberAddressMapper;
import com.atguigu.scw.user.mapper.TMemberMapper;
import com.atguigu.scw.user.service.TMemberService;
import com.atguigu.scw.user.vo.req.UserRegistVo;
import com.atguigu.scw.user.vo.resp.UserRepVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.UUID;


@Slf4j
@Transactional(readOnly = true)
@Service
public class TMemberServiceImpl implements TMemberService {

    @Autowired
    TMemberMapper memberMapper;


    @Autowired
    StringRedisTemplate redis;

    @Autowired
    TMemberAddressMapper memberAddressMapper;


    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();


    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
    @Override
    public Integer saveTMember(UserRegistVo vo) {
        try {
            //将vo 对拷到TMember  do数据
            TMember member = new TMember();

            BeanUtils.copyProperties(vo, member);

            member.setUsername(vo.getLoginacct());

            BCryptPasswordEncoder code = new BCryptPasswordEncoder();

            String pwd = code.encode(vo.getUserpswd());

            member.setUserpswd(pwd);

            int i = memberMapper.insert(member);

            log.debug("注册会员成功--{}", member);

            return i;
        } catch (Exception e) {
            e.printStackTrace();

            log.error("注册失败--{}", e.getMessage());
            throw new UserException(UserExceptionEnums.USER_SAVE_ERROR);
        }
    }

    @Override
    public UserRepVo getUserByLogin(String loginacct, String pwd) {

        UserRepVo vo = new UserRepVo();

        TMemberExample memberExample = new TMemberExample();
        memberExample.createCriteria().andLoginacctEqualTo(loginacct);

        List<TMember> members = memberMapper.selectByExample(memberExample);

        if (members.size() == 0 || members == null) {

            throw new UserException(UserExceptionEnums.EMAIL_UNEXISTS);


        } else {
            TMember user = members.get(0);
            if (! encoder.matches(pwd , user.getUserpswd())) {

                throw new UserException(UserExceptionEnums.USER_PWD_ERR);

            } else {

                BeanUtils.copyProperties(user, vo);

                String Token = UUID.randomUUID().toString().replace("-", "");

                vo.setAcessToken(Token);

                redis.opsForValue().set(Token , user.getId().toString());


                return vo;
            }


        }


    }

    @Override
    public TMember getMemberById(Integer id) {

        TMember member = memberMapper.selectByPrimaryKey(id);
        System.err.println("member==========="+member + "id "+ id);
        member.setUserpswd(null);

        return member ;
    }

    @Override
    public List<TMemberAddress> listAddress(Integer id) {

        TMemberAddressExample example = new TMemberAddressExample();
        example.createCriteria().andMemberidEqualTo(id);

        List<TMemberAddress> list = memberAddressMapper.selectByExample(example);



        return list;
    }


}
