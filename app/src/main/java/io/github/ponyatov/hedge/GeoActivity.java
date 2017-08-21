package io.github.ponyatov.hedge;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GeoActivity extends AppCompatActivity {

    private Button mGSMbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo);
        // action bar
        android.support.v7.app.ActionBar bar = getSupportActionBar();
        // title
        bar.setTitle(R.string.geo_title);
        // icon
        bar.setDisplayShowHomeEnabled(true);
        bar.setLogo(R.drawable.geo);
        bar.setDisplayUseLogoEnabled(true);
        // geo buttons
        mGSMbutton = (Button) findViewById(R.id.GSMpushButton);
        mGSMbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GeoActivity.this,"push!",Toast.LENGTH_LONG).show();
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
