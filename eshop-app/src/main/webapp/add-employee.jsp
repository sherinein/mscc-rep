<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="nav.html" /> 
<form action="employees" method="post">
	 <div class="row">
        <div class="col">
             <div class="form-group">
                <label for="id">Employee Id</label>
                <input type="text" name="id" id="eid" class="form-control">
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col">
             <div class="form-group">
                <label for="ename">Employee Name</label>
                <input type="text" name="ename" id="ename" class="form-control">
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col">
             <div class="form-group">
                <label for="salary">Employee Salary</label>
                <input type="text" name="salary" id="salary" class="form-control">
            </div>
        </div>
    </div>
     <div class="row">
      <div class="col">
			<input type="submit" value="Add Employee"/>
	</div>
	</div>
</form>
</body>
</html>