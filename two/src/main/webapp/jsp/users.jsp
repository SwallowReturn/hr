<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>无标题文档</title>
    <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script language="javascript">
        $(function(){
            //导航切换
            $(".imglist li").click(function(){
                $(".imglist li.selected").removeClass("selected")
                $(this).addClass("selected");
            })
        })
    </script>
    <script type="text/javascript">
        $(document).ready(function(){
            $(".click").click(function(){
                $(".tip").fadeIn(200);
            });

            $(".tiptop a").click(function(){
                $(".tip").fadeOut(200);
            });

            $(".sure").click(function(){
                $(".tip").fadeOut(100);
            });

            $(".cancel").click(function(){
                $(".tip").fadeOut(100);
            });



        });


    </script>
</head>


<body>

<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">首页</a></li>
        <li><a href="#">员工列表</a></li>
    </ul>
</div>

<div class="rightinfo">

    <div class="tools">

        <ul class="toolbar">

        </ul>


        <ul class="toolbar1">
            <li><span><img src="${pageContext.request.contextPath}/images/t05.png" /></span>设置</li>
        </ul>

    </div>


    <table class="imgtable">

        <thead>
        <tr>
            <th>员工编号</th>
            <th>员工姓名</th>
            <th>手机号</th>
            <th>身份证号</th>
            <th>操作</th>
        </tr>
        </thead>

        <tbody>


        <c:forEach items="" var="">
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td>删除/添加</td>
            </tr>
        </c:forEach>

        </tbody>

    </table>






    <div class="pagin">
    <div class="message">共<i class="blue">1256</i>条记录，当前显示第&nbsp;<i class="blue">2&nbsp;</i>页</div>
    <ul class="paginList">
        <li class="paginItem"><a href="javascript:;"><span class="pagepre"></span></a></li>
        <li class="paginItem"><a href="javascript:;">1</a></li>
        <li class="paginItem current"><a href="javascript:;">2</a></li>
        <li class="paginItem"><a href="javascript:;">3</a></li>
        <li class="paginItem"><a href="javascript:;">4</a></li>
        <li class="paginItem"><a href="javascript:;">5</a></li>
        <li class="paginItem more"><a href="javascript:;">...</a></li>
        <li class="paginItem"><a href="javascript:;">10</a></li>
        <li class="paginItem"><a href="javascript:;"><span class="pagenxt"></span></a></li>
    </ul>
</div>


    <div class="tip">
        <div class="tiptop"><span>提示信息</span><a></a></div>

        <div class="tipinfo">
            <span><img src="images/ticon.png" /></span>
            <div class="tipright">
                <p>是否确认对信息的修改 ？</p>
                <cite>如果是请点击确定按钮 ，否则请点取消。</cite>
            </div>
        </div>

        <div class="tipbtn">
            <input name="" type="button"  class="sure" value="确定" />&nbsp;
            <input name="" type="button"  class="cancel" value="取消" />
        </div>

    </div>




</div>

<%--  <div class="tip">
     <div class="tiptop"><span>提示信息</span><a></a></div>

   <div class="tipinfo">
     <span><img src="images/ticon.png" /></span>
     <div class="tipright">
     <p>是否确认对信息的修改 ？</p>
     <cite>如果是请点击确定按钮 ，否则请点取消。</cite>
     </div>
     </div>

     <div class="tipbtn">
     <input name="" type="button"  class="sure" value="确定" />&nbsp;
     <input name="" type="button"  class="cancel" value="取消" />
     </div>

 </div> --%>
<h2 style="visibility:hidden" id="tanchuang">${message==""?"空":message}</h2>
<script type="text/javascript">
    $('.imgtable tbody tr:odd').addClass('odd');
</script>

</body>

</html>
