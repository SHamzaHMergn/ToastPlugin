var exec = cordova.require('cordova/exec');

var ToastPlugin = {
    show: function(message, duration, successCallback, errorCallback) {
        exec(successCallback, errorCallback, 'ToastPlugin', 'show', [message, duration]);
    }
};


if (typeof window !== undefined) {
    (window).ToastPlugin = ToastPlugin;
}