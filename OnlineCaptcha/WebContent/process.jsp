<%@ page import="net.tanesha.recaptcha.ReCaptchaImpl"%>
<%@ page import="net.tanesha.recaptcha.ReCaptchaResponse"%>
 

    <%
        String remoteAddr = request.getRemoteAddr();
        ReCaptchaImpl reCaptcha = new ReCaptchaImpl();
        reCaptcha.setPrivateKey("6LeTZAkUAAAAAF73KhF6OSpBOR9wc2LEqGJnN1gb");
 
        String challenge = request.getParameter("recaptcha_challenge_field");
        String uresponse = request.getParameter("recaptcha_response_field");
        ReCaptchaResponse reCaptchaResponse = reCaptcha.checkAnswer(remoteAddr, challenge, uresponse);
 
        if (reCaptchaResponse.isValid()) 
        {
            out.print("Answer was entered correctly!");
        } else
        {
            out.print("Answer is wrong");
        }
    %>