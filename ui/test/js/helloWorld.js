function HelloWorld($scope, $http) {
    $http.get('http://localhost:8080/WebserviceRest/helloJson').
        success(function(data) {
            $scope.resp = data;
        });
}



helloApp.controller('HelloCtrl', function ($scope, $http) {
 $http.get('http://localhost:8080/WebserviceRest/helloJson').
        success(function(data) {
            $scope.resp = data;
        });
});