var app = angular.module("createOrderApp", []);
app.controller("createOrderCtrl", function ($scope, $rootScope, $timeout, $location) {
  $timeout(function () {
    /**
     * https://www.cnblogs.com/v-weiwang/p/4834672.html?ptvd
     */
    $('#order_form').bootstrapValidator({
      message: 'This value is not valid',
      feedbackIcons: {
        valid: 'glyphicon glyphicon-ok',
        invalid: 'glyphicon glyphicon-remove',
        validating: 'glyphicon glyphicon-refresh'
      },
      fields: {
        address: {
          validators: {
            notEmpty: {
              message: '收货地址不能为空'
            }
          }
        }
      }
    })
  })
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
          $scope.goods = data;
        })
      },
      error: function (data) {

      }
    })
  }
  $scope.dateTimeFormate = function () {
    var obj = {};
    var d = new Date();
    obj.year = d.getFullYear();
    obj.month = ('0' + (d.getMonth() + 1)).slice(-2);
    obj.day = ('0' + (d.getDate())).slice(-2);
    obj.hour = ('0' + (d.getHours())).slice(-2);
    obj.minutes = ('0' + (d.getMinutes())).slice(-2);
    obj.seconds = ('0' + (d.getSeconds())).slice(-2);
    return obj
  }
  $scope.submitOrder = function () {
    var bootstrapValidator = $("#order_form").data('bootstrapValidator');
    //手动触发验证
    bootstrapValidator.validate();
    if (bootstrapValidator.isValid()) {
      var date = $scope.dateTimeFormate();
      $.ajax({
        url: "/getUserInfo",
        type: "GET",
        contentType: "application/json",
        // dataType: "json",
        success: function (data) {
          $rootScope.$apply(function () {
            //未登录
            if (data.userName == "" || data.userName == null) {
              top.location.href = "../../login/login.html";
            } else {
              var req = {
                goodsId: $scope.goods.id,
                userId: data.id,
                userName: data.userName,
                goodsName: $scope.goods.goodsName,
                mainPicture: $scope.goods.mainPicture,
                address: $scope.address,
                leaveWord: $scope.leaveWord,
                number: 1,
                totalPrice: $scope.goods.goodsPrice,
                createTime: date.year + date.month + date.day + date.hour + date.minutes + date.seconds,
              }
              $.ajax({
                url: "/createOrder",
                type: "POST",
                contentType: "application/json",
                data: JSON.stringify(req),
                // dataType: "json",
                success: function (result) {
                  $rootScope.$apply(function () {
                    $('#myModal').modal()
                  })
                },
                error: function (result) {

                }
              })
            }
          })
        },
        error: function (data) {

        }
      })
    }




  }
  $scope.sure = function () {
    window.location.href = "../../goods/list/goodsList.html"
  }
})

app.config(['$locationProvider', function ($locationProvider) {
  $locationProvider.html5Mode({
    enabled: true,
    requireBase: false
  });
}]);