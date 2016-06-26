package location.clanner.ui.activity;

import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import location.clanner.utils.Common;
import location.clanner.utils.LocationSvc;

public class MainActivity extends AppCompatActivity {

    private TextView text;
    private ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //注册广播
        IntentFilter filter = new IntentFilter();
        filter.addAction(Common.LOCATION_ACTION);
        this.registerReceiver(new LocationBroadcastReceiver(), filter);

        //启动服务
        Intent intent = new Intent();
        intent.setClass(this, LocationSvc.class);
        startService(intent);

        //等待提示
        dialog = new ProgressDialog(this);
        dialog.setMessage("正在定位...");
        dialog.setCancelable(true);
        dialog.show();
    }

    private class LocationBroadcastReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            if (!intent.getAction().equals(Common.LOCATION_ACTION)) return;
            String locationInfo = intent.getStringExtra(Common.LOCATION);
            text.setText(locationInfo);
            dialog.dismiss();
            MainActivity.this.unregisterReceiver(this);// 不需要时注销
        }
    }
}
