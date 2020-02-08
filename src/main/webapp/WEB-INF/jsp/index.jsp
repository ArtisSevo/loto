<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<header>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>This is title</title></header>
<body>
<button onclick="window.location.href='/start-registration'" type="button" class="btn btn-primary">Create Lottery</button>
<table class="table table-hover">
    <thead>
    <tr>
        <th scope="col">Id</th>
        <th scope="col">Title</th>
        <th scope="col">Stard Date</th>
        <th scope="col">End Date</th>
        <th scope="col">Status</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${lotteries}" var="lottery">
        <tr>
            <th scope="row">${lottery.id}</th>
            <td>${lottery.title}</td>
            <td>${lottery.startDate}</td>
            <td>${lottery.endDate}</td>
            <td>${lottery.status}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>