<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  </head>
<body>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
       
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark sticky-top">
            <a class="navbar-brand" href="#" style="padding-left: 3%">
              <img src="finix.jpg" width="50" height="30"><b style="padding-left: 20%">FiNiX</b>
            </a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>
            <form class="form-inline my-2 my-lg-n1" style="padding-left: 5%">
              <input class="form-control mr-sm-2"  size="50" type="search" placeholder="Search" aria-label="Search">
              <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
            <div class="collapse navbar-collapse" id="navbarNavDropdown"style="padding-left: 10%;">
              <ul class="navbar-nav" style="padding-top: 1%">
                <li class="nav-item">
                  <a class="nav-link" href="signin.html" style="padding-top: 3px"><button class="btn btn-secondary my-2 my-sm-0" type="submit" style="height: 42px"> <i class="material-icons">home</i> &nbsp;<b>Home</b></button></a>
                </li>&nbsp;&nbsp;
                <li class="nav-item">
                  <a class="nav-link" href="flights.html"><h5><i class="material-icons">flight</i>Flights</h5></a>
                </li>&nbsp;&nbsp;
                <li class="nav-item">
                  <a class="nav-link" href="signup.html" style="padding-top: 3px"><button class="btn btn-outline-primary my-2 my-sm-0" type="submit" style="height: 42px"><i class="material-icons">person_add</i>Sign up</button></a>
                </li>
                </ul>
            </div>
          </nav><br><br><br><br>
          <center>
          <div class="card" style="width:30rem;">
            <div class="card-header">
              <h4><b><span style="color:rgba(12, 34, 233, 0.897)">FiNiX</span>&nbsp;<span style="color:rgba(233, 75, 12, 0.562)">Airways</span></b></h4>
            </div>
            <div class="card-body">
                <form action="./hello">
                    <div class="form-group">
                        <label for="disabledSelect">Role</label>
                        <select id="disabledSelect" class="form-control">
                            <option selected>Choose...</option>
                          <option>User</option>
                          <option>Admin</option>
                        </select>
                      </div>
                    <div class="form-group">
                      <label for="exampleInputEmail1">Email address</label>
                      <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                      <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                    </div>
                    <div class="form-group">
                      <label for="exampleInputPassword1">Password</label>
                      <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                    </div>
                    <div class="form-group form-check">
                      <input type="checkbox" class="form-check-input" id="exampleCheck1">
                      <label class="form-check-label" for="exampleCheck1">Check me out</label>
                    </div>
                  </form>
              <a href="project.html"><button type="submit" class="btn btn-primary">Signin</button></a>
            </div>
            <div class="card-header">
              <a href="signup.html" style="padding-right: 150px">New User</a> <a href="forgotpassword.html">forgot password?</a>
            </div>
          </div>
        </center>
</body>
</html>