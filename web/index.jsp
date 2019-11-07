<%@ page import="javax.ws.rs.core.Response" %>
<%@ page import="org.jboss.resteasy.client.jaxrs.*" %>
<%@ page import="org.json.JSONObject" %>
<%@ page import="org.json.JSONArray" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>RestEasy Example</title>
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
