<!doctype html>
<html ng-app>
<head>
    <title>Hello AngularJS</title>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js"></script>
    <script src="script/test.js"></script>
    <script src="script/app.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
</head>

<body>

    <header>
        <div>blabla</div>
    </header>

    <nav class="navbar navbar-default" role="navigation">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Task Tracker</a>
            </div>
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav ">
                    <li class="active"><a href="#">Home</a></li>
                    <li><a href="#">New developer</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#">Log out</a></li>
                </ul>
            </div>
        </div>
    </nav>

    <!-- block with table -->

    <div ng-controller="Hello">
        <p>The ID is {{user.id}}</p>
        <p>The name is {{user.name}}</p>
        <p>The surname is {{user.surname}}</p>
        <p>The login is {{user.login}}</p>
        <p>The password is {{user.password}}</p>
        <p>The role is {{user.role}}</p>
    </div>

    <footer class="navbar-fixed-bottom">
        <div>(c)Deshkevich Alexander</div>
    </footer>
</body>
</html>