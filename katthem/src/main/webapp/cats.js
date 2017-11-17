function Cats($scope, $http) {
	$http.get('http://localhost:8080/katthem/showCatsJ.json').
	success(function(data){$scope.cats = data;});
}