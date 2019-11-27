<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<title>Flight Booking Service</title>
</head>
<body>
<h1>Welcome to the Flight Booking Service</h1>
<p>We have the following specials now:</p>
56 CHAPTER 4 ■ JUMP INTO SPRING MVC
<ul>
<c:forEach items="${specials}" var="special">
<li>${special.departFrom.name} - ${special.arriveAt.name} from
$${special.cost}</li>
</c:forEach>
</ul>
<p><a href="search">Search for a flight.</a></p>
</body>
</html>