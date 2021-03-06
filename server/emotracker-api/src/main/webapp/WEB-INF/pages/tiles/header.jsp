<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap -->
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">

<link href="${pageContext.request.contextPath}/resources/css/bootstrap-theme.min.css" rel="stylesheet">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/dashboard.css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
<script type="text/javascript" src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
<script type="text/javascript" src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/lib/jquery-1.11.0.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/lib/bootstrap.min.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/lib/jquery.validate.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/lib/messages_ru.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/lib/jquery-ui-1.10.3.custom.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/lib/jquery-ui.datepicker.ru.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/lib/jquery-ui-timepicker-addon-1.4.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/lib/date.js"></script>

<label id="realPath" hidden="true" style="display: none;">
    <%= request.getScheme()+"://"
            + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() %>
</label>

<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/api/Emotracker-auth.js"></script>