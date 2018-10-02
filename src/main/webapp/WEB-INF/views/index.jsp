<!DOCTYPE html>
<html lang="en">

<head>
<title>Keep-Board</title>
</head>

<body>
	<!-- Create a form which will have text boxes for Note title, content and status along with a Add 
		 button. Handle errors like empty fields -->

	<!-- display all existing notes in a tabular structure with Title,Content,Status, Created Date and Action -->

	<form action="register" method="post">
      First name:<br>
      <input type="text" name="title">
      <br>
      Last name:<br>
      <input type="text" name="content">
      <br><br>
      <input type="text" name= "status">
      <br><br>
      <input type="submit" name = "submit">
    </form>
    <form method="get" action="/add">
        <button type="submit">register</button>
    </form>
    <form method="get" action="/delete">
        <button type="submit">delete</button>
    </form>
    <form method="get" action="/modify">
        <button type="submit">update</button>
    </form>
</body>

</html>