var app = angular.module("indexApp", []);
app.controller("indexCtrl", function ($scope, $rootScope) {

  $scope.changeFrameHeight = function () {
    var ifm = document.getElementById("iframepage");
    ifm.height = document.documentElement.clientHeight;
    ifm.width = document.documentElement.clientWidth;
  }

  window.onresize = function () {
    $scope.changeFrameHeight();
  }
  $scope.init = function () {
    $scope.changeUrl("../goods/list/goodsList.html");
    $.ajax({
      url: "/getUserInfo",
      type: "GET",
      contentType: "application/json",
      // dataType: "json",
      success: function (data) {
        $rootScope.$apply(function () {
          $scope.userName = data.userName
        })
      },
      error: function (data) {

      }
    })
  };
  $scope.changeUrl = function(url){
    $("#iframepage").attr("src",url);
  }
  $scope.login = function () {
    window.location.href = "/view/login/login.html"
  }
  $scope.register = function () {
    window.location.href = "/view/register/register.html"
  }
  $scope.logout = function () {
    $.ajax({
      url: "/logout",
      type: "GET",
      contentType: "application/json",
      // dataType: "json",
      success: function (data) {
        $rootScope.$apply(function () {
          top.location.reload()
        })
      },
      error: function (data) {

      }
    })
  }

})