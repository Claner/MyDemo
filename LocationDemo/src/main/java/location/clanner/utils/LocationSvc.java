package location.clanner.utils;

import android.app.Service;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Clanner on 2016/6/26.
 */
public class LocationSvc extends Service implements LocationListener {

    private static final String TAG = "LocationSvc";
    private LocationManager locationManager;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
    }

    @Override
    public void onStart(Intent intent, int startId) {
        if (locationManager.getProvider(LocationManager.NETWORK_PROVIDER) != null) {
            locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 0, 0, this);
        }else if (locationManager.getProvider(LocationManager.GPS_PROVIDER)!=null){
            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,0,0,this);
        }else {
            Toast.makeText(LocationSvc.this, "无法定位", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean stopService(Intent name) {
        return super.stopService(name);
    }

    @Override
    public void onLocationChanged(Location location) {
        Log.d(TAG, "Get the current position \n" + location);

        //通知Activity
        Intent intent = new Intent();
        intent.setAction(Common.LOCATION_ACTION);
        intent.putExtra(Common.LOCATION,location.toString());
        sendBroadcast(intent);
    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }
}
