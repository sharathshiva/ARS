<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

        <nav class="navbar navbar-expand-lg navbar-dark bg-dark sticky-top">
                <a class="navbar-brand" href="project.html" style="padding-left: 3%">
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
                      <a class="nav-link" href="flights.html"><h5>Flights</h5> <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item disabled">
                      <a class="nav-link" href="booking.html"><h5>Book</h5></a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="Support.html"><h5>Support</h5></a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="signin.html" style="padding-top: 3px"> <button class="btn btn-outline-primary my-2 my-sm-0" type="submit">Signin</button></a>
                    </li>
                        <li class="nav-item">
                            <a class="nav-link" href="signup.html" style="padding-top: 3px"> <button class="btn btn-outline-primary my-2 my-sm-0" type="submit">Sign up</button></a>
                          </li>
                  </ul>
                </div>
              </nav>

        <div class="jumbotron jumbotron-fluid">
                <div class="container">
                        <form action="./register" method="post">
                                <div class="form-row">
                                    <div class="col-md-6 mb-3">
                                        <label for="validationTooltip01">Username</label>
                                        <input type="text" class="form-control" id="validationTooltip01" placeholder="First name" required>
                                        <div class="valid-tooltip">
                                          Looks good!
                                        </div>
                                      </div>
                                      <div class="col-md-6 mb-6">
                                        <label for="validationTooltip02">Mobile no</label>
                                        <input type="text" class="form-control" id="validationTooltip02" placeholder="Mobile no." required>
                                        <div class="valid-tooltip">
                                          Looks good!
                                        </div>
                                      </div>
                                  <div class="form-group col-md-6">
                                    <label for="inputEmail4">Email</label>
                                    <input type="email" class="form-control" id="inputEmail4" placeholder="Email">
                                  </div>
                                  <div class="form-group col-md-6">
                                    <label for="inputPassword4">Password</label>
                                    <input type="password" class="form-control" id="inputPassword4" placeholder="Password">
                                  </div>
                                </div>
                                <div class="form-group">
                                  <label for="inputAddress">Address</label>
                                  <input type="text" class="form-control" id="inputAddress" placeholder="1234 Main St">
                                </div>
                                <div class="form-group">
                                  <label for="inputAddress2">Address 2</label>
                                  <input type="text" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor">
                                </div>
                                <div class="form-row">
                                  <div class="form-group col-md-6">
                                    <label for="inputCity">City</label>
                                    <input type="text" class="form-control" id="inputCity" placeholder="City">
                                  </div>
                                  <div class="form-group col-md-4">
                                    <label for="inputState">State</label>
                                    <select id="inputState" class="form-control">
                                      <option selected>Choose...</option>
                                      <option>Andhra Pradesh</option>
                                      <option>Arunachal Pradesh</option>
                                      <option>Assam</option>
                                      <option>	Bihar</option>
                                      <option>Chhattisgarh</option>
                                      <option>Goa</option>
                                      <option>Gujarat</option>
                                      <option>Haryana</option>
                                      <option>Himachal Pradesh</option>
                                      <option>Jammu and Kashmir</option>
                                      <option>Jharkhand</option>
                                      <option>Karnataka</option>
                                      <option>Kerala</option>
                                      <option>Madhya Pradesh</option>
                                      <option>Maharashtra</option>
                                      <option>Manipur</option>
                                      <option>Meghalaya</option>
                                      <option>Mizoram</option>
                                      <option>Nagaland</option>
                                      <option>Odisha</option>
                                      <option>	Punjab</option>
                                      <option>Rajasthan</option>
                                      <option>Sikkim</option>
                                      <option>Tamil Nadu</option>
                                      <option>Telangana</option>
                                      <option>Tripura</option>
                                      <option>Uttar Pradesh</option>
                                      <option>Uttarakhand</option>
                                      <option>WestBengal</option>
                                    </select>
                                  </div>
                                  <div class="form-group col-md-2">
                                    <label for="inputZip">Zip</label>
                                    <input type="text" class="form-control" id="inputZip">
                                  </div>
                                </div>
                                <div class="form-group">
                                  <label for="disabledSelect">Role</label>
                                  <select id="disabledSelect" class="form-control col-md-6">
                                      <option selected>Choose...</option>
                                    <option>User</option>
                                    <option>Admin</option>
                                  </select>
                                </div>
                                      <div class="form-group">
                                        <div class="form-check">
                                          <input class="form-check-input" type="checkbox" value="" id="invalidCheck2" required>
                                          <label class="form-check-label" for="invalidCheck2">
                                            Agree to terms and conditions
                                          </label>
                                        </div>
                                      </div>
                                      <button class="btn btn-primary" type="submit">Submit form</button>
                                      
                              </form>
                </div>
              </div>
</body>
</html>