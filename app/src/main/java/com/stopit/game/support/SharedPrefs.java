package com.stopit.game.support;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Dharam on 11/25/2014.
 */
public class SharedPrefs {

    private static final String SharedPrefsName = "StopIt";

    public static void setInt(String key, int intValue, Context mContext) {

        SharedPreferences sharedPreferences = mContext
                .getSharedPreferences(SharedPrefsName, Context.MODE_PRIVATE);
        SharedPreferences.Editor mEditor = sharedPreferences.edit();
        mEditor.putInt(key, intValue);
        mEditor.apply();
    }

    public static int getInt(String key, int defaultValue, Context mContext) {
        SharedPreferences sharedPreferences = mContext
                .getSharedPreferences(SharedPrefsName,
                                      Context.MODE_PRIVATE);
        return sharedPreferences.getInt(key, defaultValue);
    }

    public static void setString(String key, String stringValue,
                                 Context mContext) {

        SharedPreferences sharedPreferences = mContext
                .getSharedPreferences(SharedPrefsName, Context.MODE_PRIVATE);
        SharedPreferences.Editor mEditor = sharedPreferences.edit();
        mEditor.putString(key, stringValue);
        mEditor.apply();
    }

    public static String getString(String key, String defaultValue,
                                   Context mContext) {
        SharedPreferences sharedPreferences = mContext
                .getSharedPreferences(SharedPrefsName,
                                      Context.MODE_PRIVATE);
        return sharedPreferences.getString(key, defaultValue);
    }

    public static void setBoolean(String key, Boolean boolValue,
                                  Context mContext) {

        SharedPreferences sharedPreferences = mContext
                .getSharedPreferences(SharedPrefsName, Context.MODE_PRIVATE);
        SharedPreferences.Editor mEditor = sharedPreferences.edit();
        mEditor.putBoolean(key, boolValue);
        mEditor.apply();
    }

    public static Boolean getBoolean(String key, Boolean boolValue,
                                     Context mContext) {
        SharedPreferences sharedPreferences = mContext
                .getSharedPreferences(SharedPrefsName,
                                      Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean(key, boolValue);
    }

    public static void setLong(String key, long longValue, Context mContext) {

        SharedPreferences sharedPreferences = mContext
                .getSharedPreferences(SharedPrefsName, Context.MODE_PRIVATE);
        SharedPreferences.Editor mEditor = sharedPreferences.edit();
        mEditor.putLong(key, longValue);
        mEditor.apply();
    }

    public static long getLong(String key, long longValue, Context mContext) {
        SharedPreferences sharedPreferences = mContext
                .getSharedPreferences(SharedPrefsName,
                                      Context.MODE_PRIVATE);
        return sharedPreferences.getLong(key, longValue);
    }

    public static void remove(String key, Context mContext) {

        SharedPreferences sharedPreferences = mContext
                .getSharedPreferences(SharedPrefsName, Context.MODE_PRIVATE);
        SharedPreferences.Editor mEditor = sharedPreferences.edit();
        mEditor.remove(key);
        mEditor.apply();
    }

    public static void clearAll(Context mContext) {
        SharedPreferences sharedPreferences = mContext
                .getSharedPreferences(SharedPrefsName, Context.MODE_PRIVATE);
        SharedPreferences.Editor mEditor = sharedPreferences.edit();
        Map<String, ?> allSharedPrefs = sharedPreferences.getAll();
        Set<String> allKeys = allSharedPrefs.keySet();
        Iterator<String> iterator = allKeys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            mEditor.remove(key);
        }
        mEditor.apply();
    }
}
