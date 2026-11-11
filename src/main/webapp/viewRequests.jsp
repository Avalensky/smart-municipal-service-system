<%@ page import="java.sql.*" %>
<%@ page import="util.DBConnection" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Municipal Service Requests</title>
</head>
<body>
    <h2>Submitted Municipal Service Requests</h2>
    <table border="1" cellpadding="8">
        <tr>
            <th>Request ID</th>
            <th>Citizen Name</th>
            <th>Request Type</th>
            <th>Description</th>
            <th>Status</th>
        </tr>
        <%
            try (Connection conn = DBConnection.getConnection();
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT * FROM service_request")) {

                while (rs.next()) {
        %>
        <tr>
            <td><%= rs.getInt("request_id") %></td>
            <td><%= rs.getString("citizen_name") %></td>
            <td><%= rs.getString("request_type") %></td>
            <td><%= rs.getString("description") %></td>
            <td><%= rs.getString("status") %></td>
        </tr>
        <%
                }
            } catch (Exception e) {
                out.println("<tr><td colspan='5'>Error: " + e.getMessage() + "</td></tr>");
            }
        %>
    </table>
    <br>
    <a href="index.jsp">Submit Another Request</a>
</body>
</html>

