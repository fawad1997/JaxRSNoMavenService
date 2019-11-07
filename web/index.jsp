<%@ page import="javax.ws.rs.core.Response" %>
<%@ page import="org.jboss.resteasy.client.jaxrs.ResteasyClient" %>
<%@ page import="org.jboss.resteasy.client.jaxrs.ResteasyWebTarget" %>
<%@ page import="org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder" %>
<%@ page import="org.json.JSONObject" %>
<%@ page import="org.json.JSONArray" %><%--
  Created by IntelliJ IDEA.
  User: Fawad
  Date: 07/11/2019
  Time: 8:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <h1>Hello World</h1>
    <%
      ResteasyClient client = new ResteasyClientBuilder().build();
      ResteasyWebTarget getDummy = client.target("http://localhost:8080/JaxRSNoMavenService_war_exploded/api/library/books");

      Response getDummyResponse = getDummy.request().get();
      String value = getDummyResponse.readEntity(String.class);

      out.println(value); //prints JSON Object Value

      JSONArray jsonArray = new JSONArray(value);
      for(int i=0;i<jsonArray.length();i++){
        JSONObject jsonObject = jsonArray.getJSONObject(i);
        out.println(jsonObject.get("title"));
      }

      getDummyResponse.close();
    %>
  </body>
</html>
