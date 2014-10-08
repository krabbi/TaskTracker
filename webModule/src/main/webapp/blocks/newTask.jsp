<div ng-app="taskForm"
        class="col-md-4 col-md-offset-4 col-sm-6 col-sm-offset-3 col-xs-10 col-xs-offset-1">
    <div class="panel panel-default">
        <div class="panel-heading">
            <strong> New task </strong>
        </div>
<%--        <div class="panel-body">
            <form action="#" ng-submit="addTaskJSON()"><br/>

                <div class="form-group input-group">
					<span class="input-group-addon"><i
                            class="glyphicon glyphicon-bookmark"></i></span>
                    <input type="text"
                           class="form-control"
                           placeholder="Task Name"
                           ng-model="form.name" required/>
                </div>

                <select class="selectpicker" data-show-subtext="true"
                        placeholder="Developer" ng-controller="NewTaskController">
                    <option ng-repeat="developer in developers" ng-model="form.developer" value="{{developer.id}}">{{developer.surname}}
                        {{developer.name}}
                    </option>
                </select>
                <input type="submit" name="submit" id="submit" value="Submit"
                       class="btn btn-info pull-right" ng-click="Submit" ngClick="Submit">
            </form>
        </div>--%>
        <div ng-controller="NewTaskController2" class="panel-body">
            <form novalidate class="simple-form">
                <div class="form-group input-group">
					<span class="input-group-addon"><i
                            class="glyphicon glyphicon-bookmark"></i></span>
                    <input type="text" class="form-control" ng-model="name" placeholder="Task Name" required=""/>
                </div>
                <select class="selectpicker" data-show-subtext="true"
                        placeholder="Developer" >
                    <option ng-repeat="dev in developers" ng-model="developer.id" value="{{dev.id}}">{{dev.surname}}
                        {{dev.name}}
                    </option>
                </select>
                <button class="btn btn-info pull-right" ng-click="save()">Submit</button>
            </form>
        </div>

    </div>
</div>

