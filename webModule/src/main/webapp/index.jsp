<!doctype html>
<html ng-app>
<head>
<title>Task Tracker</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<link rel="stylesheet" href="/TaskTracker/css/style.css">
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js"></script>
<script type="text/javascript" src="/TaskTracker/script/app.js"></script>
<script type="text/javascript"
	src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script type="text/javascript"
	src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</head>

<body>

	<header>
		<div>blabla</div>
	</header>

	<nav class="navbar navbar-default" role="navigation">
		<div class="container-fluid">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="/TaskTracker/index">Task Tracker</a>
			</div>
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav ">
					<li class="active"><a href="/TaskTracker/index">Home</a></li>
					<li><a href="/TaskTracker/newDeveloper">New user</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#">Log out</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<!-- block with partials -->
	<div class="container" ng-controller="UrlController">
		<div ng-include="'/TaskTracker/blocks/newDeveloper.jsp'"
			ng-show="lastPathName == 'newDeveloper'"></div>
		<div ng-include="'/TaskTracker/blocks/newProject.jsp'"
			ng-show="lastPathName == 'newProject'"></div>
		<div ng-include="'/TaskTracker/blocks/newTask.jsp'"
			ng-show="lastPathName == 'newTask'"></div>
		<div ng-include="'/TaskTracker/blocks/projects.jsp'"
			ng-show="lastPathName == 'TaskTracker' || lastPathName == 'index' || lastPathName == ''"></div>
		<div ng-include="'/TaskTracker/blocks/task.jsp'"
			ng-show="beforeLastPathName == 'task'"></div>
		<div ng-include="'/TaskTracker/blocks/tasks.jsp'"
			ng-show="beforeLastPathName == 'tasks'"></div>
	</div>

	<footer class="navbar-fixed-bottom">
		<div>(c)Deshkevich Alexander</div>
	</footer>
</body>
</html>