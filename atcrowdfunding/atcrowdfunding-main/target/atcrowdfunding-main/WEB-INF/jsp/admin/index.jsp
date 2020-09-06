<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="zh_CN">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">


    <%@include file="/WEB-INF/jsp/css.jsp" %>
    <style>
        .tree li {
            list-style-type: none;
            cursor: pointer;
        }

        table tbody tr:nth-child(odd) {
            background: #F4F4F4;
        }

        table tbody td:nth-child(even) {
            color: #C00;
        }
    </style>
</head>

<body>

<jsp:include page="/WEB-INF/jsp/top.jsp"></jsp:include>
<%--<jsp:include page="/WEB-INF/jsp/sidebar.jsp"></jsp:include>--%>

<div class="container-fluid">
    <div class="row">

        <jsp:include page="/WEB-INF/jsp/sidebar.jsp"></jsp:include>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title"><i class="glyphicon glyphicon-th"></i> 数据列表</h3>
                </div>
                <div class="panel-body">
                    <form id="queryForm" class="form-inline" role="form" style="float:left;"
                          action="${PATH}/admin/index" method="post">
                        <div class="form-group has-feedback">
                            <div class="input-group">
                                <div class="input-group-addon">查询条件</div>
                                <input class="form-control has-success" name="condition" value="${param.condition}"
                                       type="text" placeholder="请输入查询条件">
                            </div>
                        </div>
                        <button type="button" class="btn btn-warning" onclick="$('#queryForm').submit()"><i
                                class="glyphicon glyphicon-search"></i> 查询
                        </button>
                    </form>
                    <button id="deleteBatchBtn" type="button" class="btn btn-danger"
                            style="float:right;margin-left:10px;"><i
                            class=" glyphicon glyphicon-remove"></i> 删除
                    </button>
                    <button type="button" class="btn btn-primary" style="float:right;"
                            onclick="window.location.href='${PATH}/admin/toAdd'"><i
                            class="glyphicon glyphicon-plus"></i> 新增
                    </button>
                    <br>
                    <hr style="clear:both;">
                    <div class="table-responsive">
                        <table class="table  table-bordered">
                            <thead>
                            <tr>
                                <th width="30">#</th>
                                <th width="30"><input id="selectAll" type="checkbox"></th>
                                <th>账号</th>
                                <th>名称</th>
                                <th>邮箱地址</th>
                                <th width="100">操作</th>
                            </tr>
                            </thead>

                            <tbody>
                            <c:forEach items="${page.list}" var="admin" varStatus="status">
                                <tr>
                                    <td>${status.count}</td>
                                    <td><input type="checkbox" adminID="${admin.id}"></td>
                                    <td>${admin.loginacct}</td>
                                    <td>${admin.username}</td>
                                    <td>${admin.email}</td>
                                    <td>
                                        <button type="button" class="btn btn-success btn-xs"><i
                                                class=" glyphicon glyphicon-check"></i></button>
                                        <button type="button" class="btn btn-primary btn-xs"><i
                                                class=" glyphicon glyphicon-pencil"
                                                onclick="window.location.href='${PATH}/admin/toUpdate?id=${admin.id}&pageNum=${page.pageNum}'"></i>
                                        </button>
                                        <button userid="${admin.id}" type="button"
                                                class="btn btn-danger btn-xs DeleteBtn"><i
                                                class=" glyphicon glyphicon-remove"></i></button>
                                            <%--onclick="window.location.href='${PATH}/admin/toDelete?id=${admin.id}&pageNum=${page.pageNum}'"--%>

                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                            <tfoot>
                            <tr>
                                <td colspan="6" align="center">
                                    <ul class="pagination">
                                        <c:if test="${page.isFirstPage}">
                                            <li class="disabled"><a href="#">上一页</a></li>
                                        </c:if>
                                        <c:if test="${!page.isFirstPage}">
                                            <li>
                                                <a href="${PATH}/admin/index?pageNum=${page.pageNum-1}&condition=${param.condition}">上一页</a>
                                            </li>
                                        </c:if>
                                        <c:forEach items="${page.navigatepageNums}" var="nums">
                                            <c:if test="${nums == page.pageNum}">
                                                <li class="active"><a href="#">${nums} <span
                                                        class="sr-only">(current)</span></a></li>

                                            </c:if>
                                            <c:if test="${nums != page.pageNum}">
                                                <li><a href="${PATH}/admin/index?pageNum=${nums}">${nums}</a></li>
                                            </c:if>
                                        </c:forEach>
                                        <c:if test="${page.isLastPage}">
                                            <li class="disabled"><a href="#">下一页</a></li>
                                        </c:if>
                                        <c:if test="${!page.isLastPage}">
                                            <li>
                                                <a href="${PATH}/admin/index?pageNum=${page.pageNum+1}&condition=${param.condition}">下一页</a>
                                            </li>
                                        </c:if>
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

<%@include file="/WEB-INF/jsp/js.jsp" %>
<script type="text/javascript">
    $(function () {
        $(".list-group-item").click(function () {
            if ($(this).find("ul")) {
                $(this).toggleClass("tree-closed");
                if ($(this).hasClass("tree-closed")) {
                    $("ul", this).hide("fast");
                } else {
                    $("ul", this).show("fast");
                }
            }
        });
    });
    // $("tbody .btn-success").click(function () {
    //     window.location.href = "assignRole.html";
    // });
    // $("tbody .btn-primary").click(function () {
    //     window.location.href = "edit.html";
    // });

    $(".DeleteBtn").click(function () {
        let userid = $(this).attr("userid")
        // alert("user html :"+$(this).html())
        // alert("user text :"+$(this).text())
        // alert("attr: "+ $(this).attr("userid"))
        // alert("prop: "+ $(this).prop("userid"))
        // alert("val: "+ $(this).val("userid"))
        // alert("data: "+ $(this).data("userid"))
        layer.confirm('是否确定删除数据?', {btn: ['确定', '取消']},
            function (index) {
                // alert(userid)
                window.location.href = "${PATH}/admin/toDelete?id=" + userid + "&pageNum=1"
                layer.close()
            },
            function (index) {
                layer.close()
            }
        )
    })


    $("#selectAll").click(function () {
        let select = $("#selectAll").prop("checked")
        $("tbody input[type='checkbox']").prop("checked", select);
    })


    $("#deleteBatchBtn").click(function () {
        let checkedBoxList = $("tbody input[type='checkbox']:checked")
        console.log(checkedBoxList)

        if (checkedBoxList.length == 0) {
            layer.msg("请选中要删除的目标", {icon: 5})
            return false;
        }
        let array = new Array();
        $.each(checkedBoxList, function (index, obj) {
            let id = $(obj).attr("adminID")
            array.push(id)
        })

        let ids = array.join(',');

        console.log(ids)

        layer.confirm('是否确定删除多条数据?', {btn: ['确定', '取消']},
            function (index) {
                // alert(userid)
                console.log("${PATH}/admin/doDeleteBatch?pageNum=${page.pageNum}"+"&ids=" + ids)
                window.location.href = "${PATH}/admin/doDeleteBatch?pageNum=${page.pageNum}"+"&ids=" + ids
                layer.close()
            },
            function (index) {
                layer.close()
            }
        )


    })


</script>
</body>
</html>
