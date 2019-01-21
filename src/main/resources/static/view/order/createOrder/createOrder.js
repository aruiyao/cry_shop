var app = angular.module("createOrderApp", []);
app.controller("createOrderCtrl", function ($scope, $rootScope,$location) {
  $scope.init = function () {
    $scope.goodsID = $location.search().goodsID;
    $scope.downUrl = "/uploadDownload/downloadImage";
    $scope.queryGoodsDetail()
  }
  $scope.queryGoodsDetail = function () {
    $.ajax({
      url: "/queryGoodsDetail",
      type: "GET",
      contentType: "application/json",
      data: {
        id: $scope.goodsID,
      },
      // dataType: "json",
      success: function (data) {
        $rootScope.$apply(function () {
          if (data.detailPicture) {
            $scope.detailPic = data.detailPicture.split("|");
          } else {
            $scope.detailPic = [];
          }

          $scope.goods = data;
        })
      },
      error: function (data) {

      }
    })
  }
})

app.config(['$locationProvider', function ($locationProvider) {
  $locationProvider.html5Mode({
    enabled: true,
    requireBase: false
  });
}]);