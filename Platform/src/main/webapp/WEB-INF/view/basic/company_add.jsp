<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <!-- Standard Meta -->
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
    <jsp:include page="/WEB-INF/view/common/basecss.jsp" flush="true" />
</head>

<body class="no-skin">
<div class="main-container" id="main-container">
    <script type="text/javascript">
        try{ace.settings.check('main-container' , 'fixed')}catch(e){}
    </script>

    <div class="main-container-inner">
        <div class="main-content" style="margin-left: 0px;">
            <div class="page-content">

                <div class="row">
                    <div class="col-xs-12">
                        <!-- PAGE CONTENT BEGINS -->
                        <!-- PAGE CONTENT BEGINS -->
                        <form class="form-horizontal" id="validation-form" method="post">
                            <input name="id" type="hidden" value="${id}"/>
                            <div class="form-group">
                                <label class="control-label col-xs-12 col-sm-3 no-padding-right" for="name">单位名称</label>
                                <div class="col-xs-12 col-sm-9">
                                    <div class="clearfix">
                                        <input type="text"  name="name" ${id ne null?'readonly':'' } value="${item.name}" class="col-xs-12 col-sm-6">
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                            <label class="control-label col-xs-12 col-sm-3 no-padding-right" for="innerCode">单位编号</label>
                            <div class="col-xs-12 col-sm-9">
                                <div class="clearfix">
                                    <input type="text"  name="innerCode" ${id ne null?'readonly':'' } value="${item.innerCode}" class="col-xs-12 col-sm-6">
                                </div>
                            </div>
                        </div>
                            <div class="form-group">
                                <label class="control-label col-xs-12 col-sm-3 no-padding-right" for="street">所属乡镇或街道</label>
                                <div class="col-xs-12 col-sm-9">
                                    <div class="clearfix">
                                        <input type="text" name="street" value="${item.street}" class="col-xs-12 col-sm-6">
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-xs-12 col-sm-3 no-padding-right" for="address">单位地址</label>
                                <div class="col-xs-12 col-sm-9">
                                    <div class="clearfix">
                                        <input type="text"  name="address" value="${item.address}" class="col-xs-12 col-sm-6">
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-xs-12 col-sm-3 no-padding-right" for="customerType">用户类型</label>
                                <div class="col-xs-12 col-sm-9">
                                    <div class="clearfix">
                                        <input type="text"  name="customerType" value="${item.customerType}" class="col-xs-12 col-sm-6">
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-xs-12 col-sm-3 no-padding-right" for="waterUseType">取水用途</label>
                                <div class="col-xs-12 col-sm-9">
                                    <div class="clearfix">
                                        <input type="text"  name="waterUseType" value="${item.waterUseType}" class="col-xs-12 col-sm-6">
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-xs-12 col-sm-3 no-padding-right" for="contact">联系人</label>
                                <div class="col-xs-12 col-sm-9">
                                    <div class="clearfix">
                                        <input type="text"  name="contact" value="${item.contact}" class="col-xs-12 col-sm-6">
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-xs-12 col-sm-3 no-padding-right" for="phone">联系电话</label>
                                <div class="col-xs-12 col-sm-9">
                                    <div class="clearfix">
                                        <input type="text"  name="phone" value="${item.phone}" class="col-xs-12 col-sm-6">
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-xs-12 col-sm-3 no-padding-right" for="postalCode">邮政编码</label>
                                <div class="col-xs-12 col-sm-9">
                                    <div class="clearfix">
                                        <input type="text" name="postalCode" value="${item.postalCode}" class="col-xs-12 col-sm-6">
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-xs-12 col-sm-3 no-padding-right" for="department">管水部门</label>
                                <div class="col-xs-12 col-sm-9">
                                    <div class="clearfix">
                                        <input type="text" name="department" value="${item.department}" class="col-xs-12 col-sm-6">
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-xs-12 col-sm-3 no-padding-right" for="wellCount">水井数量</label>
                                <div class="col-xs-12 col-sm-9">
                                    <div class="clearfix">
                                        <input type="text" name="wellCount" value="${item.wellCount}" class="col-xs-12 col-sm-6">
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-xs-12 col-sm-3 no-padding-right" for="firstWatermeterCount">一级表数量</label>
                                <div class="col-xs-12 col-sm-9">
                                    <div class="clearfix">
                                        <input type="text" name="firstWatermeterCount" value="${item.firstWatermeterCount}" class="col-xs-12 col-sm-6">
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="control-label col-xs-12 col-sm-3 no-padding-right" for="remotemeterCount">远传表数量</label>
                                <div class="col-xs-12 col-sm-9">
                                    <div class="clearfix">
                                        <input type="text" name="remotemeterCount" value="${item.remotemeterCount}" class="col-xs-12 col-sm-6">
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-xs-12 col-sm-3 no-padding-right" for="unitType">节水型单位类型</label>
                                <div class="col-xs-12 col-sm-9">
                                    <div class="clearfix">
                                        <input type="text" name="unitType" value="${item.unitType}" class="col-xs-12 col-sm-6">
                                    </div>
                                </div>
                            </div>
                            <div class="clearfix form-actions" align="center">
                                <div class="col-md-offset-3 col-md-9">
                                    <button id="submit-btn" class="btn btn-info" type="submit" data-last="Finish">
                                        <i class="ace-icon fa fa-check bigger-110"></i>
                                        提交
                                    </button>
                                    &nbsp; &nbsp; &nbsp;
                                    <button class="btn" type="reset">
                                        <i class="ace-icon fa fa-undo bigger-110"></i>
                                        重置
                                    </button>
                                </div>
                            </div>
                        </form>
                    </div><!-- /.col -->
                </div><!-- /.row -->
            </div><!-- /.page-content -->
        </div><!-- /.main-content -->
    </div><!-- /.main-container-inner -->
</div><!-- /.main-container -->
<jsp:include page="/WEB-INF/view/common/basejs.jsp" flush="true" />
<script type="text/javascript">

    jQuery(function($) {

        var $validation = true;
        $('#validation-form').validate({
            errorElement: 'div',
            errorClass: 'help-block',
            focusInvalid: false,
            rules: {
                name:{
                    required: true
                }
            },
            messages: {
                name:{
                    required: "请输入单位名称"
                }
            },
            rules: {
                innerCode:{
                    required: true
                }
            },
            messages: {
                innerCode:{
                    required: "请输入单位编码"
                }
            },
            highlight: function (e) {
                $(e).closest('.form-group').removeClass('has-info').addClass('has-error');
            },

            success: function (e) {
                $(e).closest('.form-group').removeClass('has-error');//.addClass('has-info');
                $(e).remove();
            },

            errorPlacement: function (error, element) {
                if(element.is(':checkbox') || element.is(':radio')) {
                    var controls = element.closest('div[class*="col-"]');
                    if(controls.find(':checkbox,:radio').length > 1) controls.append(error);
                    else error.insertAfter(element.nextAll('.lbl:eq(0)').eq(0));
                }
                else if(element.is('.select2')) {
                    error.insertAfter(element.siblings('[class*="select2-container"]:eq(0)'));
                }
                else if(element.is('.chosen-select')) {
                    error.insertAfter(element.siblings('[class*="chosen-container"]:eq(0)'));
                }
                else error.insertAfter(element.parent());
            },

            submitHandler: function (form) {
                var $form = $("#validation-form");
                var $btn = $("#submit-btn");
                if($btn.hasClass("disabled")) return;
                var postData=$("#validation-form").serializeJson();
                $.post("${context_path}/basic/company/save" ,postData,
                        function(data){
                            if(data.code==0){
                                parent.reloadGrid(); //重新载入
                                layer.msg('操作成功', {
                                    icon: 1,
                                    time: 2000 //2秒关闭（如果不配置，默认是3秒）
                                },function(){
                                    closeView();
                                });
                            }else {
                                layer.msg(data.msg, {
                                    icon: 2,
                                    time: 2000 //2秒关闭（如果不配置，默认是3秒）
                                });
                            }
                            $("#btn-submit").removeClass("disabled");
                        },"json");
                return false;
            },
            invalidHandler: function (form) {
            }
        });

    });

    function closeView(){
        var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
        parent.layer.close(index); //再执行关闭
    }

</script>
</body>

</html>
