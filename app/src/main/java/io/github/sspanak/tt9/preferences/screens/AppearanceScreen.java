package io.github.sspanak.tt9.preferences.screens;

import io.github.sspanak.tt9.R;
import io.github.sspanak.tt9.preferences.PreferencesActivity;
import io.github.sspanak.tt9.preferences.items.ItemSelectTheme;

public class AppearanceScreen extends BaseScreenFragment {
	public AppearanceScreen() { init(); }
	public AppearanceScreen(PreferencesActivity activity) { init(activity); }

	@Override protected int getTitle() { return R.string.pref_category_appearance; }
	@Override protected int getXml() { return R.xml.prefs_screen_appearance; }

	@Override
	protected void onCreate() {
		(new ItemSelectTheme(activity, findPreference(ItemSelectTheme.NAME)))
			.populate()
			.enableClickHandler()
			.preview();
	}
}