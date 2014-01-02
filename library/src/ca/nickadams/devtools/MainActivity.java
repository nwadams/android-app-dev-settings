package ca.nickadams.devtools;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	private Button mButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mButton = (Button) findViewById(R.id.button);
		
		Button settingsButton = (Button) findViewById(R.id.settings_button);
		settingsButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
			}
		});
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		
		mButton.setEnabled(DevTools.isFeatureEnabled(this, "button_enabled_key", false));

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
