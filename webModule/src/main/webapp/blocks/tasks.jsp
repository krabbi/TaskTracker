<div ng-controller="ProjectController">
	<h1>Tasks in project {{project.name}}</h1>
	<table class="table table-hover table-striped">
		<tbody>
			<tr>
				<th>ID</th>
				<th>Task Name</th>
			</tr>
			<tr ng-repeat="task in project.taskList" class="clickable"
				onClick="location.href='/TaskTracker/task/{{task.id}}'">
				<td>{{task.id}}</td>
				<td>{{task.name}}</td>
			</tr>
		</tbody>
	</table>
	<a class="btn btn-primary" type="button" href="/TaskTracker/newTask">Add
		task</a>
</div>