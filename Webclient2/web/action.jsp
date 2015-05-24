<%-- 
    Document   : action.jsp
    Created on : 23 mai 2015, 15:21:02
    Author     : macbookpro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    <%-- start web service invocation --%><hr/>
    <%
        String name = request.getParameter("ip");
    try {
	webservice.NewWebService_Service service = new webservice.NewWebService_Service();
	webservice.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	
	// TODO process result here
	java.lang.String result = port.executeCommand(name);
        port.creerfichier(result);
        
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
