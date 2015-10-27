function Hello($scope, $http) {
    $http.get('http://localhost:8080/WebserviceRest/helloJson').
        success(function(data) {
            $scope.resp = data;
        });
}