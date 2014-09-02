<%-- 
    Document   : index
    Created on : 2 Sep, 2014, 10:25:05 AM
    Author     : param
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="parse" class="mypack.Parse" />
<!DOCTYPE html>
<style>
    ul{
        background:#d0d0d0;
        padding-top: 40px;
        width:80%;
        margin: auto;
        list-style:none;
    }
    li{
        margin-bottom: 20px;
        width:100%;
    }
    li .title{
        font-size:20px;
        width:40%;
        margin-bottom: 20px;
    }
    li img{
        /*margin-left: 200px;*/
        width:30%;
        text-align: right;
    }
</style>
    
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <ul>
            <%=parse.showData()%></ul>
    </body>
</html>
