<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>无标题文档</title>
    <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>

<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">首页</a></li>
        <li><a href="#">表单</a></li>
    </ul>
</div>

<div class="formbody">

    <div class="formtitle"><span>基本信息</span></div>

    <ul class="forminfo">
        <form action="updateUser.action" method="post">
            <li><label>姓名</label><input name="User_Name" value="${UserRole.USER_NAME}" type="text" class="dfinput" /><i>此信息不能修改</i></li>
            <li><label>账号/工号</label><input name="User_Num" value="${UserRole.USER_NUM}" type="text" class="dfinput" /><i>此信息不能修改</i></li>
            <li><label>密码</label><input name="User_PWD" type="text" value="${UserRole.User_PWD}" /></li>
            <li><label>手机号</label><input name="User_Phone" value="${UserRole.USER_PHONE}" type="text" class="dfinput" /><i>此信息不能修改</i></li>
            <li><label>身份证号</label><input name="User_IdCard" value="${UserRole.USER_IDCARD}" type="text" class="dfinput" /><i>此信息不能修改</i></li>
            <li><label>打卡状态</label><input name="User_Clock" value="${UserRole.USER_CLOCK}" type="text" class="dfinput" /><i>此信息不能修改</i></li>
            <li><label>&nbsp;</label><input name="" type="submit" class="btn" value="确认保存"/></li>
        </form>
    </ul>


</div>
</body>
</html>
