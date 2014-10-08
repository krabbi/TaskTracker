<div>
	<h1>Current projects</h1>
	<table class="table table-hover table-striped"
		ng-controller="ProjectsController">
		<tbody>
			<tr>
				<th>ID</th>
				<th>Project Name</th>
			</tr>
			<tr ng-repeat="project in projects" class="clickable"
				onClick="location.href='/TaskTracker/tasks/{{project.id}}'">
				<td>{{project.id}}</td>
				<td>{{project.name}}</td>
			</tr>
		</tbody>
	</table>
	<a class="btn btn-primary" type="button" href="/TaskTracker/newProject">Add
		project</a>
</div>
