<%--
  Created by IntelliJ IDEA.
  User: modyn
  Date: 06/12/2022
  Time: 00:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Login V8</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!--===============================================================================================-->
	<link rel="icon" type="image/png" href="public/images/icons/favicon.ico"/>
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="public/vendor/bootstrap/css/bootstrap.min.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="public/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="public/vendor/animate/animate.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="public/vendor/css-hamburgers/hamburgers.min.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="public/vendor/animsition/css/animsition.min.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="public/vendor/select2/select2.min.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="public/vendor/daterangepicker/daterangepicker.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="public/css/util.css">
	<link rel="stylesheet" type="text/css" href="public/css/main.css">
	<!--===============================================================================================-->
</head>
<body>

<div class="limiter">
	<div class="container-login100">
		<div class="wrap-login100">
			<form class="login100-form validate-form p-l-55 p-r-55 p-t-178" action="/Login" method="post">
					<span class="login100-form-title">
						Sign In
					</span>
				<% if(request.getAttribute("error") != null) {%>
					<div style="background-color: indianred; margin-bottom: 30px; text-align: center; border-radius: 30px; padding: 10px; color: black"><%=request.getAttribute("error")%></div>
				<%}%>
				<div class="wrap-input100 validate-input m-b-16" data-validate="Please enter email">
					<input class="input100" type="email" name="username" placeholder="Email">
					<span class="focus-input100"></span>
				</div>

				<div class="wrap-input100 validate-input" data-validate = "Please enter password">
					<input class="input100" type="password" name="pass" placeholder="Password">
					<span class="focus-input100"></span>
				</div>

				<div class="text-right p-t-13 p-b-23">
						<span class="txt1">
							Forgot
						</span>

					<a href="#" class="txt2">
						Username / Password?
					</a>
				</div>

				<div class="container-login100-form-btn">
					<button class="login100-form-btn">
						Sign in
					</button>
				</div>

				<div class="flex-col-c p-t-170 p-b-40">
						<span class="txt1 p-b-9">
							Don’t have an account?
						</span>

					<a href="#" class="txt3">
						Sign up now
					</a>
				</div>
			</form>
		</div>
	</div>
</div>


<!--===============================================================================================-->
<script src="public/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
<script src="public/vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
<script src="public/vendor/bootstrap/js/popper.js"></script>
<script src="public/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
<script src="public/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
<script src="public/vendor/daterangepicker/moment.min.js"></script>
<script src="public/vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
<script src="public/vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
<script src="public/js/main.js"></script>

</body>
</html>
