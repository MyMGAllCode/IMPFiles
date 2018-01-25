<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page import="net.tanesha.recaptcha.ReCaptcha" %>
    <%@ page import="net.tanesha.recaptcha.ReCaptchaFactory" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="process.jsp" method="post">

<%

//ReCaptcha c = ReCaptchaFactory.newReCaptcha("your_public_key", "your_private_key", false);
ReCaptcha captcha =ReCaptchaFactory.newReCaptcha("6LeTZAkUAAAAACMwwCn9lDdwUsrDJMMK07j0zCrX","6LeTZAkUAAAAAF73KhF6OSpBOR9wc2LEqGJnN1g",false);
out.print(captcha.createRecaptchaHtml(null, null));

%>
<input type="submit" value="send">
</form>

</body>
</html>