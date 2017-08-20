package io.github.ponyatov.hedge;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

public class GeoActivity extends AppCompatActivity {

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
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        boolean T = super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu,menu);
        return T;
    }
}
