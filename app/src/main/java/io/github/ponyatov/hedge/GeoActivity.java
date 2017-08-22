package io.github.ponyatov.hedge;

import android.Manifest;
import android.app.ActionBar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class GeoActivity extends AppCompatActivity {

    private Button mGSMbutton;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo);

        // ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_COARSE_LOCATION}, 1);
        
        // action bar
        android.support.v7.app.ActionBar bar = getSupportActionBar();
        // title
        bar.setTitle(R.string.geo_title);
        // icon
        bar.setDisplayShowHomeEnabled(true);
        bar.setLogo(R.drawable.geo);
        bar.setDisplayUseLogoEnabled(true);
        // geo buttons
//          Toast.makeText(GeoActivity.this,"push!",Toast.LENGTH_LONG).show();
        findViewById(R.id.GSMpushButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//              Toast.makeText(GeoActivity.this,loc.toString(),Toast.LENGTH_LONG).show();
                TelephonyManager tm = (TelephonyManager) getSystemService(getApplicationContext().TELEPHONY_SERVICE);
                GsmCellLocation loc = (GsmCellLocation) tm.getCellLocation();
                ((TextView) findViewById(R.id.cellView)).setText("cell:"+Integer.toHexString(loc.getCid()));
                ((TextView) findViewById(R.id.lacView)).setText(" lac:"+Integer.toHexString(loc.getLac()));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        boolean T = super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu,menu);
        return T;
    }
}
