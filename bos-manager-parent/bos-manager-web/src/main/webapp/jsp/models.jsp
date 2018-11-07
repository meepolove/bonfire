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
    <table id="fucktable"></table>
</body>
</html>

<script type="text/javascript">
    //项目跟路径
    var path = "http://localhost:8888";
    $("#fucktable").bootstrapTable({
        method : 'get',                                   // 向服务器请求方式
        //contentType : "application/json;charset=UTF-8", // 如果是post必须定义
        url : "/models/getAllByPageHelp",                           //请求后台的URL（*）
        //dataType:"json",
        pageSize : 10,                                      // 每页的记录行数（*）
        pageNumber : 1,                                    // table初始化时显示的页数
        toolbar : '#toolbar',
        pageList : [ 5, 10, 15 ],                           //可供选择的每页的行数（*）
        sidePagination : "server",                         //分页方式：client客户端分页，server服务端分页（*）  bootstrap-table要求服务器返回的json须包含：total rows
        cache : false,                                     // 是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        striped : true,                                    // 隔行变色
        pagination : true,                                 // 是否启用分页
        showRefresh : true,                                //是否显示刷新按钮
        showToggle : true,                                 //是否显示详细视图和列表视图的切换按钮默认true

        silent : true,                                     // 设置刷新事件
        queryParamsType:'',                                //queryParamsType的默认值为 'limit' ,在默认情况下 传给服务端的参数为：offset,limit,sort//设置为 ''  在这种情况下传给服务器的参数为：pageSize,pageNumbe
        queryParams : function(params) {                   //params为bootstraptable自带的    //  请求参数，传到服务器的参数
            return {
                pageSize : params.pageSize,                   // 每页显示数量
                pageNumber : params.pageNumber                 // 显示第几页
            }
        },
        columns : [                                        //页面需要展示的列，后端交互对象的属性
            {
                field : 'id',                           // 返回json数据中的name
                title : 'Id',                              // 表格表头显示文字
                align : 'center',                          // 左右居中
                valign : 'middle'                          // 上下居中
            }, {
                field : 'modelbaseId',
                title : 'ModelsBaseId',
                align : 'center',
            }, {
                field : 'imei',
                title : 'IMEi',
                align : 'center',
            }, {
                field : 'lineNumber',
                title : 'LineNumber',
                align : 'center',
            }, {
                field : 'serialNumber',
                title : 'serialNumber',
                align : 'center',
            }, {
                field : 'ismi',
                title : 'ISMI',
                align : 'center',

            }, {
                field : 'phoneId',
                title : 'phoneId',
                align : 'center',
            }, {
                field : 'serial',
                title : 'serial',
                align : 'center',
            }, {
                field : 'createdAt',
                title : 'CreateAt',
                align : 'center',
            }, {
                field : 'updatedAt',
                title : 'UpdateAt',
                align : 'center',
            },
            {
                title : '操作',
                align : 'center',
                formatter : function(value, row, index) {
                    var d = '<button class="btn btn-primary btn-sm" onclick="del(\'' + row.id + '\')">删除</button>';
                    var u = '<button class="btn btn-primary btn-sm" onclick="upd(\'' + row + '\')">修改</button>';
                    return d + u;
                },
            } ],

        onLoadSuccess : function() {                  //加载成功时执行
            //alert("success");
            console.info("加载成功");
        }, //加载成功时执行的方法
        onLoadError : function(err) {                 //加载失败时执行
            //alert("error");
            console.info("加载数据失败:"+err);
        }, //加载失败时执行的方法



        responseHandler : function(res) { //加载服务器数据之前的处理程序，可以用来格式化数据。参数：res为从服务器请求到的数据。如果你的json格式没有嵌套可以不必写
            console.info("数据格式:"+JSON.stringify(res));
            return {
                total : res.total,
                rows : res.rows
            };
        }
    })
    function del(id) {
        console.log(id)
    }

    function upd(row) {
        console.log(JSON.stringify(row))
    }
</script>
