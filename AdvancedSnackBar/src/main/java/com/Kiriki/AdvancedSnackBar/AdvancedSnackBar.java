package com.Kiriki.AdvancedSnackBar;

import android.content.Context;

import android.graphics.Color;

import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;


import androidx.core.view.ViewCompat;

import com.google.android.material.snackbar.Snackbar;


public class AdvancedSnackBar{
    private static Snackbar snackbar;
    public static int LENGTH_INDEFINITE = Snackbar.LENGTH_INDEFINITE;
    public static int LENGTH_LONG = Snackbar.LENGTH_LONG;
    public static int LENGTH_SHORT = Snackbar.LENGTH_SHORT;

    public static int DESIGN_ORIGINAL = 0;
    public static int DESIGN_MATERIAL = 1;

    private static Context main_context;
    //private int LENGTH_MEDIUM =
    /*public AdvancedSnackBar(){
    }*/
    public AdvancedSnackBar(View container, int duration, Context context){
        snackbar = Snackbar.make(container, "", duration);
        main_context = context;
    }
    public void setDesign(int design){
        switch (design){
            case 0:
                ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) snackbar.getView().getLayoutParams();
                params.setMargins(0,0,0,0);
                snackbar.getView().setLayoutParams(params);
                snackbar.getView().setBackground(main_context.getDrawable(R.drawable.design_snackbar_original_background));
                break;
            case 1:
                ViewGroup.MarginLayoutParams params1 = (ViewGroup.MarginLayoutParams) snackbar.getView().getLayoutParams();
                params1.setMargins(12,12,12,12);
                snackbar.getView().setLayoutParams(params1);
                snackbar.getView().setBackground(main_context.getDrawable(R.drawable.design_snackbar_material_background));
                ViewCompat.setElevation(snackbar.getView(), 6f);
                break;
        }
    }
    public void setText(String snack_bar_text){
        snackbar.setText(snack_bar_text);
    }
    public void setBackgroundColor(String backgroundColor){
        snackbar.getView().setBackgroundColor(Color.parseColor(backgroundColor));
    }
    public void setTextSize(int textSize){
        TextView snackbar_text = (TextView)snackbar.getView().findViewById(R.id.snackbar_text);
        snackbar_text.setTextSize(textSize);
    }
    public void setElevation (float elevation){
        ViewCompat.setElevation(snackbar.getView(),elevation);
    }
    public void setBackgroundDrawable(int drawable){
        snackbar.getView().setBackground(main_context.getDrawable(drawable));
    }
    public void addButton(String button_text, View.OnClickListener onClickListener){
        snackbar.setAction(button_text,onClickListener);
    }
    public void setMargin(int top,int bottom,int left ,int right){
        ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) snackbar.getView().getLayoutParams();
        params.setMargins(left,top,right,bottom);
        snackbar.getView().setLayoutParams(params);
    }
    public void show(){
        snackbar.show();
    }
}
