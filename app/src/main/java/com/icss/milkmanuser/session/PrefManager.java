package com.icss.milkmanuser.session;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

import java.util.HashMap;

public class PrefManager {
    // Shared Preferences
    SharedPreferences pref;

    // Editor for Shared preferences
    Editor editor;

    // Context
    Context _context;

    // Shared pref mode
    int PRIVATE_MODE = 0;

    // Shared preferences file name
    private static final String PREF_NAME = "MilkMan";

    // All Shared Preferences Keys
    private static final String KEY_IS_LOGGED_IN = "isLoggedIn";
    private static final String KEY_IS_SAVE_PASSWORD = "save";
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_EMAIL = "email";
    private static final String KEY_MOBILE = "mobile";
    private static final String KEY_PROFILE = "profile";
    private static final String KEY_PASSWORD = "password";
    private static final String CAT_NAME = "cat_name";
    private static final String TRACE_ID = "id";
    private static final String CATTLE = "cate";
    private static final String TRAC = "tractor";
    private static final String POSITION = "pos";
    private static final String CATTLE_POSITION = "position";
    private static final String EXPENSES_POSITION = "positionexp";
    private static final String CURRENT_TIME = "time";
    private static final String EQUI_POS = "pos_equi";
//    private static final String DIESEL = "pos_diesel";
    private static final String CROP = "position_crop";


    public PrefManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }



    public void createLogin(String id ,String name, String email, String mobile,String password) {
        editor.putString(KEY_ID, id);
        editor.putString(KEY_NAME, name);
         editor.putString(KEY_EMAIL, email);
        editor.putString(KEY_MOBILE, mobile);
      //  editor.putString(CURRENT_TIME, time);
       editor.putString(KEY_PASSWORD,password);
//        editor.putString(KEY_REFER,refer);
        editor.putBoolean(KEY_IS_LOGGED_IN, true);
        editor.commit();
    }

    public void dataCategory(String name) {
        editor.putString(CAT_NAME, name);
        editor.commit();
    }

    public void dataId(String id)
    {
        editor.putString(TRACE_ID,id);
        editor.commit();
    }

    public void cattle(String type)
    {
        editor.putString(CATTLE,type);
        editor.commit();
    }

    public void tracc(String module)
    {
        editor.putString(TRAC,module);
        editor.commit();
    }

    public void posi(int position)
    {
        editor.putString(POSITION, String.valueOf(position));
        editor.commit();

    }

    public void position_cattle(int position)
    {
        editor.putString(CATTLE_POSITION, String.valueOf(position));
        editor.commit();

    }

    public void positon_expenses(int position)
    {
        editor.putString(CATTLE_POSITION, String.valueOf(position));
        editor.commit();

    }

    public void position_equi(int position)
    {
        editor.putString(EQUI_POS, String.valueOf(position));
        editor.commit();

    }

//    public void position_diesel(int position)
//    {
//        editor.putString(DIESEL, String.valueOf(position));
//        editor.commit();
//
//    }

    public void position_crop(String position)
    {
        editor.putString(CROP, String.valueOf(position));
        editor.commit();

    }




    public boolean isLoggedIn() {
        return pref.getBoolean(KEY_IS_LOGGED_IN, false);
    }



    public void clearSession() {
        editor.clear();
        editor.commit();
    }

    public HashMap<String, String> getUserDetails() {
        HashMap<String, String> profile = new HashMap<>();
        profile.put("id", pref.getString(KEY_ID, null));
       // profile.put("time", pref.getString(CURRENT_TIME, null));
        profile.put("name", pref.getString(KEY_NAME, null));
         profile.put("email", pref.getString(KEY_EMAIL, null));
        profile.put("mobile", pref.getString(KEY_MOBILE, null));
        profile.put("password", pref.getString(KEY_PASSWORD, null));
//        profile.put("refer_code",pref.getString(KEY_REFER, null));
        return profile;
    }

    public HashMap<String, String> getCatName() {
        HashMap<String, String> category = new HashMap<>();
        category.put("cat_name", pref.getString(CAT_NAME, null));
        return category;
    }

    public HashMap<String ,String> getSomeId()
    {
        HashMap<String , String>  trace_id=new HashMap<>();
        trace_id.put("trace_some",pref.getString(TRACE_ID,null));
        return trace_id;
    }

    public HashMap<String ,String> getCattle()
    {
        HashMap<String , String>  cattle=new HashMap<>();
        cattle.put("cattle_type",pref.getString(CATTLE,null));
        return cattle;
    }

    public HashMap<String ,String> getTract()
    {
        HashMap<String , String>  trcat=new HashMap<>();
        trcat.put("tractor_module",pref.getString(TRAC,null));
        return trcat;
    }

    public HashMap<String ,String> getposition()
    {
        HashMap<String , String>  poss=new HashMap<>();
        poss.put("possss",pref.getString(POSITION,null));
        return poss;
    }

    public HashMap<String ,String> getposition_cattle()
    {
        HashMap<String , String>  possii=new HashMap<>();
        possii.put("possssiii",pref.getString(CATTLE_POSITION,null));
        return possii;
    }

    public HashMap<String ,String> get_posi_exp()
    {
        HashMap<String , String>  exp=new HashMap<>();
        exp.put("poi",pref.getString(EXPENSES_POSITION,null));
        return exp;
    }

    public HashMap<String ,String> get_pos()
    {
        HashMap<String , String>  equi=new HashMap<>();
        equi.put("equi_pos",pref.getString(EQUI_POS,null));
        return equi;
    }
//    public HashMap<String ,String> get_pos_diesel()
//    {
//        HashMap<String , String>  dise=new HashMap<>();
//        dise.put("disel_pod",pref.getString(DIESEL,null));
//        return dise;
//    }

    public HashMap<String ,String> get_position_crop()
    {
        HashMap<String , String>  cro=new HashMap<>();
        cro.put("crop_posi",pref.getString(CROP,null));
        return cro;
    }

}
