<div ng-controller="TaskController">
<h1>Task: {{task.name}}</h1>
<form>    
    <div class="row">
        <div class="col-xs-4">
            <div class="input-group">
                <span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
                <span class="input-group-addon">{{task.developer.surname}} {{task.developer.name}}</span>
            </div>
        </div>
        <div class="col-xs-4">
        	<div class="input-group">
					<select class="selectpicker" data-show-subtext="true"
						placeholder="Status">
						<option data-subtext="In progress">In progress</option>
						<option data-subtext="Resolved">Resolved</option>
						<option data-subtext="Closed">Closed</option>
						<option data-subtext="Reopened">Reopened</option>
						<option data-subtext="Open">Open</option>
					</select> <span class="badge pull-right">{{task.status}}</span>
            </div>
        </div>
        <div class="col-xs-4">        	
      		<button type="submit" class="btn btn-default">Save</button>
        </div>
    </div>    
</form>
	<div class="panel panel-default" ng-repeat="com in comment">
	  <div class="panel-heading">
	    <h3 class="panel-title"><span class="glyphicon glyphicon-user"></span> 
	    {{com.user.surname}} {{com.user.name}}</h3>
	  </div>
	  <div class="panel-body">
		    {{com.comment}}
	  </div>
	</div>
<form>
  <div class="form-group">
   <textarea class="form-control" rows="3"></textarea>
   <button type="submit" class="btn btn-default">Comment</button>
  </div>
</form>
</div>