package ca.nickadams.devtools;

import android.content.Context;
import android.content.SharedPreferences;

public class DevTools {
	
	protected static final String SHARED_PREFS_NAME = "devsettingsprefs";

	public static boolean isFeatureEnabled(Context context, String key, boolean defaultValue) {
		SharedPreferences prefs = context.getSharedPreferences(SHARED_PREFS_NAME, Context.MODE_PRIVATE);
		return prefs.getBoolean(key, defaultValue);
	}
	
}
