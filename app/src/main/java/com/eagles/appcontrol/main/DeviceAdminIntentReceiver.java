package com.eagles.appcontrol.main;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.eagles.appcontrol.R;


/**
 * Device Admin Receiver
 * 
 * @author myung77.lee
 *
 */
public class DeviceAdminIntentReceiver extends DeviceAdminReceiver {
	
	@Override
    public void onEnabled(Context context, Intent intent) {
        showToast(context, context.getResources().getString(R.string.enabled_device_admin));
    }

    @Override
    public CharSequence onDisableRequested(Context context, Intent intent) {
        return "This is an optional message to warn the user about disabling.";
    }

    @Override
    public void onDisabled(Context context, Intent intent) {
        showToast(context, context.getResources().getString(R.string.disabled_device_admin));
    }

    @Override
    public void onPasswordChanged(Context context, Intent intent) {
        showToast(context, context.getResources().getString(R.string.password_changed_device_admin));
    }

    void showToast(Context context, CharSequence msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
