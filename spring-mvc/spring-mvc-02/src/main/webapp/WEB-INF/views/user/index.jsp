<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/9/25
  Time: 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
    <link rel="stylesheet" href="https://www.layuicdn.com/layui/css/layui.css">
</head>
<body>

<table class="layui-hide" id="test"></table>

<script src="https://www.layuicdn.com/layui/layui.js"></script>
<script>
    layui.use('table', function(){
        var table = layui.table;

        table.render({
            elem: '#test'

            ,url:'${pageContext.request.contextPath}/user/findAll'
            ,cols: [[
                {field:'id', width:80, title: 'ID', sort: true}
                ,{field:'username', width:80, title: '用户名'}
                ,{field:'sex', width:80, title: '性别', sort: true}
                ,{field:'age', width:80, title: '年龄'}
                ,{field:'create_time', title: '创建时间', minWidth: 100}
            ]]
            ,page: true
        });
    });
</script>
</body>
</html>
