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
import android.view.MenuItem;
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
        bar.setTitle("");//R.string.geo_title);
        // icon
        bar.setDisplayShowHomeEnabled(true);
        bar.setLogo(R.drawable.geo);
        bar.setDisplayUseLogoEnabled(true);
        // geo buttons
//          Toast.makeText(GeoActivity.this,"push!",Toast.LENGTH_LONG).show();
        findViewById(R.id.GSMpushButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View pView) {
                TelephonyManager tm = (TelephonyManager) getSystemService(getApplicationContext().TELEPHONY_SERVICE);
                GsmCellLocation loc = (GsmCellLocation) tm.getCellLocation();
                ((TextView) findViewById(R.id.cellView)).setText("cell:"+Integer.toHexString(loc.getCid()));
                ((TextView) findViewById(R.id.lacView)).setText(" lac:"+Integer.toHexString(loc.getLac()));
            }
        });
        // menu clicker
//        findViewById(R.id.miTask).setOnClickListener(new View.OnClickListener() {
//			@Override
//			public void onClick(View pView) {
//				//GeoActivity.this.setContentView(R.layout.activity_task);
//			}
//		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu pMenu) {
        boolean T = super.onCreateOptionsMenu(pMenu);
        getMenuInflater().inflate(R.menu.menu,pMenu);
        return T;
    }

	@Override
	public boolean onOptionsItemSelected(MenuItem pItem) {
		switch (pItem.getItemId()) {
			//case R.id.miTask: startActivity(R.id.act)
			default: return super.onOptionsItemSelected(pItem);
		}
	}
}
