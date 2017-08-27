package io.github.ponyatov.hedge;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.menu.MenuBuilder;
import android.view.Menu;
import android.view.MenuItem;

public class AnyActivity extends AppCompatActivity {
	protected void onCreate(Bundle savedInstanceState,int pActivity,int pTitle,int pLogo) {
		super.onCreate(savedInstanceState);
		setContentView(pActivity);

		// action bar
		ActionBar bar = getSupportActionBar();
		// title
		bar.setTitle(pTitle);
        // icon
        bar.setDisplayShowHomeEnabled(true);
        bar.setLogo(pLogo);
        bar.setDisplayUseLogoEnabled(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu pMenu) {
		getMenuInflater().inflate(R.menu.menu,pMenu);
		if (pMenu instanceof MenuBuilder) ((MenuBuilder) pMenu).setOptionalIconsVisible(true);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem pItem) {
////		Toast.makeText(GeoActivity.this,Integer.toString(pItem.getItemId()),Toast.LENGTH_LONG).show();
//				Toast.makeText(GeoActivity.this,"Task",Toast.LENGTH_LONG).show();
		switch (pItem.getItemId()) {
			case R.id.miTask:
				startActivity(new Intent(this,TaskActivity.class));
				return true;
			case R.id.miSensor:
				startActivity(new Intent(this,SensorActivity.class));
				return true;
			default:
				return super.onOptionsItemSelected(pItem);
		}
	}
}
