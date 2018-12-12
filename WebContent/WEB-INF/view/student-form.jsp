<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 02.12.2018
  Time: 09:39
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Registration Form </title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
    First name:<form:input path="firstName"/>
    <br><br>
    Last name: <form:input path="lastName"/>
    <br><br>
Choose your country <form:select path="country">
    <from:options items="${student.countryOptions}"/>
<br><br>
</form:select>
    <br><br>
    Choose your favorite language: <br>
    Java <form:radiobutton path="favoriteLanguage" value="Java"/> <br>
    C# <form:radiobutton path="favoriteLanguage" value="C#"/> <br>
    PHP <form:radiobutton path="favoriteLanguage" value="PHP"/> <br>
    Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/> <br>
    Node.js <form:radiobutton path="favoriteLanguage" value="Note.js"/>

    <br><br>
    Which one operation system do you use? (you can choose more than one)
    MS Windows <form:checkbox path="operatingSystems" value="MS Windows"/>
    Linux <form:checkbox path="operatingSystems" value="Linux"/>
    Mac OS<form:checkbox path="operatingSystems" value="Mac OS"/>
    <br><br>
    <input type="submit" value="Submit" />

</form:form>
</body>
</html>
