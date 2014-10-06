function Hello($scope, $http) {
    $http.get('/test2').
            success(function(data) {
                $scope.user = data;
            });
}