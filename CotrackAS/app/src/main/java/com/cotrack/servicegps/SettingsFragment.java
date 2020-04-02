package com.cotrack.servicegps;

import android.os.Bundle;


import androidx.fragment.app.DialogFragment;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;

public class SettingsFragment extends PreferenceFragmentCompat {

  @Override
  public void onCreatePreferences(Bundle bundle, String s) {
    addPreferencesFromResource(R.xml.pref_main);
  }

  @Override
  public void onDisplayPreferenceDialog(Preference preference) {
    DialogFragment dialogFragment = null;
    if (preference instanceof NumberPickerPreference) {
      dialogFragment = NumberPickerPreferenceDialogFragmentCompat.newInstance(preference.getKey());
    }

    if (dialogFragment != null) {
      dialogFragment.setTargetFragment(this, 0);
      dialogFragment.show(
          this.getFragmentManager(), "android.support.v7.preference.PreferenceFragment.DIALOG");
    } else {
      super.onDisplayPreferenceDialog(preference);
    }
  }
}
