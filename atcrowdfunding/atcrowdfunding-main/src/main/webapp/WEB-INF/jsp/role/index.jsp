<%--
  Created by IntelliJ IDEA.
  User: XXIAO
  Date: 2020/9/5
  Time: 21:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh_CN">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

<%--    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">--%>
<%--    <link rel="stylesheet" href="css/font-awesome.min.css">--%>
<%--    <link rel="stylesheet" href="css/main.css">--%>
    
    <%@include file="/WEB-INF/jsp/css.jsp"%>
    <style>
        .tree li {
            list-style-type: none;
            cursor:pointer;
        }
        table tbody tr:nth-child(odd){background:#F4F4F4;}
        table tbody td:nth-child(even){color:#C00;}
    </style>
</head>

<body>

<jsp:include page="/WEB-INF/jsp/top.jsp"></jsp:include>

<div class="container-fluid">
    <div class="row">

        <jsp:include page="/WEB-INF/jsp/sidebar.jsp"></jsp:include>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title"><i class="glyphicon glyphicon-th"></i> 数据列表</h3>
                </div>
                <div class="panel-body">
                    <form class="form-inline" role="form" style="float:left;">
                        <div class="form-group has-feedback">
                            <div class="input-group">
                                <div class="input-group-addon">查询条件</div>
                                <input id="condition" class="form-control has-success" type="text" placeholder="请输入查询条件">
                            </div>
                        </div>
                        <button id="queryBtn" type="button" class="btn btn-warning"><i class="glyphicon glyphicon-search"></i> 查询</button>
                    </form>
                    <button type="button" class="btn btn-danger" style="float:right;margin-left:10px;"><i class=" glyphicon glyphicon-remove"></i> 删除</button>
                    <button type="button" class="btn btn-primary" style="float:right;" onclick="window.location.href='form.html'"><i class="glyphicon glyphicon-plus"></i> 新增</button>
                    <br>
                    <hr style="clear:both;">
                    <div class="table-responsive">
                        <table class="table  table-bordered">
                            <thead>
                            <tr >
                                <th width="30">#</th>
                                <th width="30"><input type="checkbox"></th>
                                <th>名称</th>
                                <th width="100">操作</th>
                            </tr>
                            </thead>
                            <tbody>

                            </tbody>
                            <h3>数据正在加载中</h3>
                            <tfoot>
                            <tr >
                                <td colspan="6" align="center">
                                    <ul class="pagination">

                                    </ul>
                                </td>
                            </tr>

                            </tfoot>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<%@include file="/WEB-INF/jsp/js.jsp"%>
<script type="text/javascript">
    $(function () {
        $(".list-group-item").click(function(){
            if ( $(this).find("ul") ) {
                $(this).toggleClass("tree-closed");
                if ( $(this).hasClass("tree-closed") ) {
                    $("ul", this).hide("fast");
                } else {
                    $("ul", this).show("fast");
                }
            }
        });

        initDate(1)

    });

    let json = {pageNum:1,pageSize:3}

   function initDate (pageNum){
    //1 发起 ajax请求

       json.pageNum = pageNum
       let index = -1;
       $.ajax({
           type: "post",
           url: "${PATH}/role/loadData" ,
           data:json,
           beforeSend:function (){
               index = layer.load(1,{time:10000});
               return true ;
           },
           success:function (result){
               console.log(result)
               layer.close(index)
               initShow(result)
               initNavg(result)
           }
       })

       //2、展示数据




    }


       function  initShow(result){

           $("tbody").empty()
           console.log(result)

           let content = '';

           list = result.list;

           $.each(list , function (index , obj){
content+= '<tr>';
content+= '  <td>'+(index+1)+'</td>';
content+= '  <td><input type="checkbox"></td>';
content+= '  <td>'+obj.name +'</td>';
content+= '  <td>';
content+= '	  <button type="button" class="btn btn-success btn-xs"><i class=" glyphicon glyphicon-check"></i></button>';
content+= '	  <button type="button" class="btn btn-primary btn-xs"><i class=" glyphicon glyphicon-pencil"></i></button>';
content+= '	  <button type="button" class="btn btn-danger btn-xs"><i class=" glyphicon glyphicon-remove"></i></button>';
content+= '  </td>';
content+= '</tr>';
           })

           $("tbody").html(content)

       };

       function  initNavg(result){

           $(".pagination").empty()

           console.log(result)
           let navigatepageNums = result.navigatepageNums;

           if (result.isFirstPage){
               $(".pagination").append('<li class="disabled"><a href="#">上一页</a></li>')
           }else {
               $(".pagination").append('<li><a onclick="initDate('+(result.pageNum-1)+')">上一页</a></li>')
           }


           $.each(navigatepageNums , function (index , obj){

               if (obj == result.pageNum){

                   $(".pagination").append('<li class="active"><a href="#">'+obj+'<span class="sr-only">(current)</span></a></li>')

               }else{
                   $(".pagination").append('<li><a onclick="initDate('+obj+')">'+ obj+'</a></li>')
               }

           })

           if (result.isLastPage){
               $(".pagination").append('<li class="disabled"><a href="#">下一页</a></li>')
           }else {
               $(".pagination").append('<li><a onclick="initDate('+(result.pageNum+1)+')">下一页</a></li>')
           }

       };


       $("#queryBtn").click(function (){
           let condition = $("#condition").val();
           json.condition = condition
           initDate(1,)


       })


    $("tbody .btn-success").click(function(){
        window.location.href = "assignPermission.html";
    });
</script>
</body>
</html>
<%--<li class="disabled"><a href="#">上一页</a></li>--%>
<%--<li class="active"><a href="#">1 <span class="sr-only">(current)</span></a></li>--%>
<%--<li><a href="#">2</a></li>--%>
<%--<li><a href="#">3</a></li>--%>
<%--<li><a href="#">4</a></li>--%>
<%--<li><a href="#">5</a></li>--%>
<%--<li><a href="#">下一页</a></li>--%>