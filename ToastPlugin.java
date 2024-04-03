package com.example.toast;

import android.widget.Toast;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

public class ToastPlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("show")) {
            String message = args.getString(0);
            int duration = args.getInt(1);

            showToast(message, duration, callbackContext);
            return true;
        }
        return false;
    }

    private void showToast(String message, int duration, CallbackContext callbackContext) {
        Toast.makeText(cordova.getActivity().getApplicationContext(), message, duration).show();
        callbackContext.success(message);
    }
}