package com.blackpai.otc.fexpay.Utils.sharedpreferences;

import android.content.SharedPreferences;

import com.blackpai.otc.fexpay.App.App;

import java.util.Set;

/**
 * Created by 77 on 2018/4/20.
 */

public class SharedPreferencesUtils {

    private static SharedPreferencesUtils sharedPreferencesUtils;
    private SharedPreferences sharedPreferences;

    private SharedPreferencesUtils() {
        sharedPreferences = App.context.getSharedPreferences("xingxing", App.context.MODE_APPEND);
    }

    //用单一实例来调用这个方法
    public static SharedPreferencesUtils getInstance() {
        if (sharedPreferencesUtils == null) {
            sharedPreferencesUtils = new SharedPreferencesUtils();
        }
        return sharedPreferencesUtils;
    }

    public void setSharedPreferences(String key, boolean value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key, value);
        editor.commit();
    }

    public boolean getSharedPreferences(String key) {

        return sharedPreferences.getBoolean(key, true);

    }

    public void setSharedPreferencesString(String key, String value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.commit();
    }

    public String getSharedPreferencesString(String key) {

        return sharedPreferences.getString(key, "");

    }

    public void removeSharedPreferences(String key) {

        sharedPreferences.edit().remove(key);

    }

    public void setSharedPreferencesSet(String key, Set<String> value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putStringSet(key, value);
        editor.commit();
    }

    public Set<String> getSharedPreferencesSet(String key) {

        return sharedPreferences.getStringSet(key, null);

    }


}
