var app = angular.module("goodsListApp", []);
app.controller("goodsListCtrl", function ($scope, $rootScope) {
  $scope.imgName = "";
  $scope.init = function () {
    $scope.downUrl = "/uploadDownload/downloadImage"
    $scope.getGoodsList()
  }

  $scope.getGoodsList = function () {
    $.ajax({
      url: "/getGoodsList",
      type: "GET",
      contentType: "application/json",
      data: {
        goodsStatus: 1
      },
      // dataType: "json",
      success: function (data) {
        $rootScope.$apply(function () {
          $scope.goodsList = data.goodsList;
        })
      },
      error: function (data) {

      }
    })
  }

  $scope.detail = function (id) {
    window.location.href = "/view/goods/detail/goodsDetail.html?goodsID=" + id;
  }
})


app.directive('repeatFinish', function () {
  return {
    link: function (scope, element, attr) {
      if (scope.$last == true) {
        scope.$emit('renderFinish');
      }
    }
  }
})