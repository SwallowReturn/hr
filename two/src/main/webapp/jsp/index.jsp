<%@ page import="java.util.Date" %>
<%@ page import="freemarker.template.utility.DateUtil" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>无标题文档</title>
    <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
</head>

<body>
<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">首页</a></li>
    </ul>
</div>
<div class="mainindex">
    <div class="welinfo">
        <span><img src="${pageContext.request.contextPath}/images/sun.png" alt="天气" /></span>
        <b>${UserRole.USER_NAME},欢迎登录爱生信息管理系统</b>(${UserRole.USER_PHONE})
    </div>
    <div class="xline"></div>
    <ul class="iconlist">
        <li><img src="${pageContext.request.contextPath}/images/ico01.png" /><p><a href="#">管理设置</a></p></li>
        <c:if test="${UserRole.USER_CLOCK==0}">
            <li><img src="${pageContext.request.contextPath}/images/ico02.png" /><p id="clock" style="width:50px"><a href="/clockUpdate?UserNum=${UserRole.USER_NUM}">打卡</a></p></li>
            <li><p id="showTimes" style="font-size: 35px;padding-left: 36px;padding-top: 10px"></p></li>
        </c:if>
    </ul>
    <div class="ibox"><a class="ibtn"><img src="${pageContext.request.contextPath}/images/iadd.png" />添加新的快捷功能</a></div>
    <div class="xline"></div>
    <div class="box"></div>
    <div class="welinfo">
        <span><img src="${pageContext.request.contextPath}/images/dp.png" alt="提醒" /></span>
        <b>Uimaker信息管理系统使用指南</b>
    </div>
    <ul class="infolist">
        <li><span>您可以快速进行文章发布管理操作</span><a class="ibtn">发布或管理文章</a></li>
        <li><span>您可以快速发布产品</span><a class="ibtn">发布或管理产品</a></li>
        <li><span>您可以进行密码修改、账户设置等操作</span><a class="ibtn">账户管理</a></li>
    </ul>
    <div class="xline"></div>
</div>
</body>
<script>
    window.onload=function () {
        setInterval(FreeTime,1000);
    }
    function FreeTime() {
        var clock=document.getElementById("clock").innerHTML;
        if(clock!=null){
            var curTime=Date.now();
            var endTime=new Date();
            endTime.setHours(9);
            endTime.setMinutes(0);
            endTime.setSeconds(0);
            console.log((endTime-curTime)/1000);
            console.log(Math.floor(curTime-endTime)/1000%60);
            //var endTime=new Date("2020-11-20 10:10:00");
            var allFreeSeconds=(endTime-curTime)/1000;
            if(allFreeSeconds>0){
                var freeHour=Math.floor(allFreeSeconds/(60*60)%24);
                var freeMinute=Math.floor(allFreeSeconds/60%60);
                var freeSecond=Math.floor(allFreeSeconds%60);
                document.getElementById("showTimes").innerHTML="距离上班剩余"+freeHour+"时"+freeMinute+"分"+freeSecond+"秒";
            }else{
                var freeMinute=Math.floor((curTime-endTime)/1000/60%60);
                var freeSecond=Math.floor((curTime-endTime)/1000%60);
                document.getElementById("showTimes").innerHTML="已过打卡时间"+freeMinute+"分"+freeSecond+"秒";
            }
        }
    }
</script>
</html>