<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link href="https://cdn.bootcss.com/bootstrap-table/1.12.1/bootstrap-table.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.bootcss.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <script src="https://cdn.bootcss.com/bootstrap-table/1.12.1/bootstrap-table.js"></script>


</head>

<body>
    <div class = "panel panel-default">
        <div class="panel-body"><h2>手机型号表</h2></div>
    </div>
    <!-- table 标签 -->
    <table></table>
</body>
</html>

<script type="text/javascript">
    console.log("aljfkjafjlfkjl");
    //项目跟路径
    //var path = "http://localhost:8888";
    $('table').bootstrapTable({
        method : 'get',                                   // 向服务器请求方式
        //contentType : "application/x-www-form-urlencoded", // 如果是post必须定义
        url : 'http://localhost:8888/models/getAllByPageHelp',                           //请求后台的URL（*）
        pageSize : 10,                                      // 每页的记录行数（*）
        pageNumber : 1,                                    // table初始化时显示的页数
        pageList : [ 10, 20 ],                           //可供选择的每页的行数（*）
        sidePagination : "server",                         //分页方式：client客户端分页，server服务端分页（*）  bootstrap-table要求服务器返回的json须包含：total rows
        cache : false,                                     // 是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        striped : true,                                    // 隔行变色
        pagination : true,                                 // 是否启用分页
        showRefresh : true,                                //是否显示刷新按钮
        showToggle : true,                                 //是否显示详细视图和列表视图的切换按钮默认true
        silent : true,                                     // 设置刷新事件
        queryParamsType:'',                        //queryParamsType的默认值为 'limit' ,在默认情况下 传给服务端的参数为：offset,limit,sort
        queryParams : function(params) {                   //params为bootstraptable自带的    //  请求参数，传到服务器的参数
            return {
                pageSize : params.pageSize,                   // 每页显示数量
                pageNumber : params.pageNumber                 // 显示第几页
            }
        },
        columns : [                                        //页面需要展示的列，后端交互对象的属性
            {
                field : 'stuNo',                           // 返回json数据中的name
                title : 'Id',                           // 表格表头显示文字
                align : 'center',                          // 左右居中
                valign : 'middle'                          // 上下居中
            }, {
                field : 'stuName',
                title : 'ModelsBaseId'
            }, {
                field : 'gradeName',
                title : 'IMEi'
            }, {
                field : 'stuGender',
                title : 'LineNumber'
            }, {
                field : 'stuBirthday',
                title : 'serialNumber'
            }, {
                field : 'enterDate',
                title : 'ISMI'
            }, {
                field : 'createBy',
                title : 'phoneId'
            }, {
                field : 'createTime',
                title : 'serial'
            }, {
                field : 'modifyBy',
                title : 'CreateAt'
            }, {
                field : 'modifyTime',
                title : 'UpdateAt'
            },
            {
                title : '操作',
                align : 'center',
                formatter : function(value, row, index) {
                    return '<button class="btn btn-primary btn-sm" onclick="del(\'' + row.stuNo + '\')">删除</button>';
                }
            } ],

        onLoadSuccess : function() {//加载成功时执行
            //alert("success");
            console.info("加载成功");
        }, //加载成功时执行的方法
        onLoadError : function(err) {                 //加载失败时执行
            //alert("error");
            console.info("加载数据失败:",+err);
        }, //加载失败时执行的方法



        responseHandler : function(res) { //加载服务器数据之前的处理程序，可以用来格式化数据。参数：res为从服务器请求到的数据。如果你的json格式没有嵌套可以不必写
            console.log("数据加载："+JSON.stringify(res));
//            // 把res.rows中嵌套的json对象取出来追加到res.rows中
//            for (var i = 0; i < res.rows.length; i++) {
//                var grade = res.rows[i].gradeList[0];
//                for (var key in grade) {
//                    //如果grade的键值等于gradeName 就追加
//                    if (key == "gradeName") {
//                        var k = key;
//                        var value = grade[key];
//                        res.rows[i][k] = value;
//                    }
//                }
//            }
//
//            //把res.rows 中的 gradeList删除
//            for (var i = 0; i < res.rows.length; i++) {
//                delete res.rows[i]["gradeList"];
//            }
            //返回格式化好的json数据
            return res;
        }
    })
</script>
