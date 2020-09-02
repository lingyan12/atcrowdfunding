package t;

import com.atguigu.atcrowdfunding.service.TAdminService;

import org.springframework.beans.factory.annotation.Autowired;

public class test {
    @Autowired
    TAdminService adminService;
    {
        System.out.println(222222);
    }




}

class t2{
    public static void main(String[] args) {
        test test = new test();
    }
}
