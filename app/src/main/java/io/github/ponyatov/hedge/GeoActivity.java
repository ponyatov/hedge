package io.github.ponyatov.hedge;

import android.Manifest;
import android.app.ActionBar;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuBuilder;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class GeoActivity extends AnyActivity {

    private Button mGSMbutton;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState,R.layout.activity_geo,R.string.geo_title,R.drawable.geo);

        // ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_COARSE_LOCATION}, 1);
        
//        // geo buttons
////          Toast.makeText(GeoActivity.this,"push!",Toast.LENGTH_LONG).show();

        findViewById(R.id.GSMpushButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View pView) {
                TelephonyManager tm = (TelephonyManager) getSystemService(getApplicationContext().TELEPHONY_SERVICE);
                GsmCellLocation loc = (GsmCellLocation) tm.getCellLocation();
                ((TextView) findViewById(R.id.cellView)).setText(" cell:"+Integer.toHexString(loc.getCid()));
                ((TextView) findViewById(R.id.lacView )).setText("  lac:"+Integer.toHexString(loc.getLac()));
            }
        });
    }

}
