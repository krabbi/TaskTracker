function UrlController($scope) {
    var url = window.location.href;
    var parts = url.split("/");
    var last = parts[parts.length - 1];
    var beforeLast = parts[parts.length - 2];
    $scope.lastPathName = last;
    $scope.beforeLastPathName = beforeLast;
}

function ProjectsController($scope, $http) {
    $http.get('/TaskTracker/rest/projects').
            success(function (data) {
                $scope.projects = data;
            });
}

function ProjectController($scope, $http) {
    $http.get('/TaskTracker/rest/project/' + $scope.lastPathName).
            success(function (data) {
                $scope.project = data;
            });
}

function TaskController($scope, $http) {
    $http.get('/TaskTracker/rest/task/' + $scope.lastPathName).
            success(function (data) {
                $scope.task = data;
            });

}

function NewTaskController($scope, $http) {
    $http.get('/TaskTracker/rest/developers').
            success(function (data) {
                $scope.developers = data;
            });
}

$scope.addTaskJSON = function () {
    // Writing it to the server
    //
    var dataObj = {
        id: null,
        name: $scope.name,
        project: "{" + $scope.developer.id + "}",
        developer: "{" + $scope.developer.id + "}",
        comment: [],
        status: "OPEN"
    };
    var res = $http({
        method: 'POST',
        url: '/TaskTracker/saveTask',
        data: dataObj,
        headers: {
            'Content-Type': 'application/json'
        }});
    res.success(function (data, status, headers, config) {
        $scope.message = data;
    });
    res.error(function (data, status, headers, config) {
        alert("failure message: " + JSON.stringify({data: data}));
    });
    // Making the fields empty
    //
    $scope.name = '';
    $scope.developer.id = '';
};

angular.module('formExample', [])
        .controller('NewTaskController2', ['$scope', '$http', function($scope) {
            $scope.master = {};

            var dataObj = {
                id: null,
                name: $scope.name,
                project: "{" + $scope.developer.id + "}",
                developer: "{" + $scope.developer.id + "}",
                comment: [],
                status: "OPEN"
            };
            var res = $http({
                method: 'POST',
                url: '/TaskTracker/saveTask',
                data: dataObj,
                headers: {
                    'Content-Type': 'application/json'
                }});


            $http.get('/TaskTracker/rest/developers').
                    success(function (data) {
                        $scope.developers = data;
                    });

            $scope.save = function() {
                res.success(function (data, status, headers, config) {
                    $scope.message = data;
                });
                res.error(function (data, status, headers, config) {
                    alert("failure message: " + JSON.stringify({data: data}));
                });

                $scope.name = '';
                $scope.developer.id = '';
            };
        }]);
