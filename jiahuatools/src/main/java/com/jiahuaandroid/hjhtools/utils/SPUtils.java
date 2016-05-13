package com.jiahuaandroid.hjhtools.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by jhhuang on 2016/3/14.
 */
public class SPUtils {
    public static final String DEVICE = "decice";
    public static final String TOKEN = "token";
    public static final String AVATARFILEID = "avatarFileId";
    public static final String QRCODEURL = "qrCodeUrl";
    public static final String USERNAME = "userName";
    public static final String MOBILE = "mobile";
    public static final String USERID = "userId";
    public static final String NICKNAME = "nickName";

    public static final String MAIL = "mail";
    public static final String CAR_SIZE = "car_size";
    public static final String COMPANYNAME = "companyName";

    private static SharedPreferences sp;
    private static SPUtils instance;

    private SPUtils() {
    }
    public static SPUtils getInstance(Context context) {
        if (instance == null) {
            sp = context.getSharedPreferences("config", Context.MODE_PRIVATE);
            instance = new SPUtils();
        }
        return instance;
    }

    /**
     * 保存
     */
    public void save(String key, Object value) {
        if (value instanceof String) {
            sp.edit().putString(key, (String)value).commit();
        } else if (value instanceof Integer) {
            sp.edit().putInt(key, (Integer) value).commit();
        } else if (value instanceof Boolean) {
            sp.edit().putBoolean(key, (Boolean) value).commit();
        }
    }
    /**
     * 读取
     */
    public String getString(String key, String defValue) {
        return sp.getString(key, defValue);
    }
    public boolean getBoolean(String key, boolean defValue) {
        return sp.getBoolean(key, defValue);
    }
    public int getInt(String key, int defValue) {
        return sp.getInt(key, defValue);
    }


    /**
     * 根据key移除
     * @param key
     */
    public void remove(String key) {
        sp.edit().remove(key).commit();
    }

}
