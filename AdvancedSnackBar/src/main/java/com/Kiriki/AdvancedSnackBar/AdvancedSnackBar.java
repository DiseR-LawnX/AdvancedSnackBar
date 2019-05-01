package com.Kiriki.AdvancedSnackBar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
    @NonNull
    public static void make(View container,int duration){
        snackbar = Snackbar.make(container,null,duration);
        main_context = ContextApplication.getContext();
    }
    @NonNull
    public static void setDesign(int design){
        switch (design){
            case 0:
                FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) snackbar.getView().getLayoutParams();
                params.setMargins(0,0,0,0);
                snackbar.getView().setLayoutParams(params);
                snackbar.getView().setBackground(main_context.getDrawable(R.drawable.design_snackbar_original_background));
                break;
            case 1:
                FrameLayout.LayoutParams params1 = (FrameLayout.LayoutParams) snackbar.getView().getLayoutParams();
                params1.setMargins(12,12,12,12);
                snackbar.getView().setLayoutParams(params1);
                snackbar.getView().setBackground(main_context.getDrawable(R.drawable.design_snackbar_material_background));
                ViewCompat.setElevation(snackbar.getView(), 6f);
                break;
        }
    }
    @NonNull
    public static void setText(String snack_bar_text){
        snackbar.setText(snack_bar_text);
    }
    @NonNull
    public static void setBackgroundColor(String backgroundColor){
        snackbar.getView().setBackgroundColor(Color.parseColor(backgroundColor));
    }
    @NonNull
    public static void setTextSize(int textSize){
        TextView snackbar_text = (TextView)snackbar.getView().findViewById(R.id.snackbar_text);
        snackbar_text.setTextSize(textSize);
    }
    @NonNull
    public static void setElevation (float elevation){
        ViewCompat.setElevation(snackbar.getView(),elevation);
    }
    @NonNull
    public static void setBackgroundDrawable(int drawable){
        snackbar.getView().setBackground(main_context.getDrawable(drawable));
    }
    @NonNull
    public static void addButton(String button_text, View.OnClickListener onClickListener){
        snackbar.setAction(button_text,onClickListener);
    }
    @NonNull
    public static void setMargin(int top,int bottom,int left ,int right){
        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) snackbar.getView().getLayoutParams();
        params.setMargins(left,top,right,bottom);
        snackbar.getView().setLayoutParams(params);
    }
    @NonNull
    public static void show(){
        snackbar.show();
    }
}
