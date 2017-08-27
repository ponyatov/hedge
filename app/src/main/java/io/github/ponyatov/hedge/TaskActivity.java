package io.github.ponyatov.hedge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TaskActivity extends AnyActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState,R.layout.activity_task,R.string.task_title,R.drawable.task);
	}

}
