<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body><center><h1>User Account Login</h1>
<form:form action="verifyUser.jlc" method="post" commandName="user">
<table>

<tr><td>UserName</td>
<td><form:input path="username"/></td>
<td><font color=red size=5>
<form:errors path="username"/></font></td></tr>

<tr><td>password</td>
<td><form:input path="password"/></td>
<td><font color=red size=5>
<form:errors path="password"/></font></td></tr>
</table>

<br><input type="submit" value="Account Login">
</form:form>
</center>
</body>
</html>