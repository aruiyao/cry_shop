var app = angular.module("registerApp", []);
app.controller("registerCtrl", function ($scope, $rootScope, $timeout) {

  $timeout(function () {
    /**
     * https://www.cnblogs.com/v-weiwang/p/4834672.html?ptvd
     */
    $('#register_form').bootstrapValidator({
      message: 'This value is not valid',
      feedbackIcons: {
        valid: 'glyphicon glyphicon-ok',
        invalid: 'glyphicon glyphicon-remove',
        validating: 'glyphicon glyphicon-refresh'
      },
      submitButtons: '#login-submit',
      fields: {
        userName: {
          validators: {
            notEmpty: {
              message: '用户名不能为空'
            }
          }
        },
        password: {
          validators: {
            notEmpty: {
              message: '密码不能为空'
            }
          }
        },
        repassword: {
          validators: {
            identical: {
              field: 'password',
              message: '两次输入的密码不一致'
            },
            notEmpty: {
              message: '密码不能为空'
            }
          }
        }
      }
    })
  })
  $scope.register = function () {
    var bootstrapValidator = $("#register_form").data('bootstrapValidator');
    //手动触发验证
    bootstrapValidator.validate();
    if (bootstrapValidator.isValid()) {
      var req = {
        userName: $scope.userName,
        password: $scope.password
      };
      $.ajax({
        url: "/register",
        type: "POST",
        contentType: "application/json",
        data: JSON.stringify(req),
        // dataType: "json",
        success: function (data) {
          $rootScope.$apply(function () {
            window.location.href = "../index/index.html"
          })
        },
        error: function (data) {

        }
      })
    }
  }
  $scope.cancle = function () {
    window.location.href = "../index/index.html"
  }
})