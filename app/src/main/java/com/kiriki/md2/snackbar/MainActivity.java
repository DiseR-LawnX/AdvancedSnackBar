package com.kiriki.md2.snackbar;

import android.os.Bundle;

import com.Kiriki.AdvancedSnackBar.AdvancedSnackBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final CoordinatorLayout contaier = findViewById(R.id.container);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AdvancedSnackBar snackbar = new AdvancedSnackBar(contaier,AdvancedSnackBar.LENGTH_LONG,MainActivity.this);
                snackbar.setDesign(AdvancedSnackBar.DESIGN_MATERIAL);
				/*DESIGN_MATERIAL:Material Design 2.0 Style
				DESIGN_ORIGINAL: Original Style*/
                snackbar.setText("This is a Snackbar");
                snackbar.setBackgroundColor("#000000");
                snackbar.setTextSize(18);
                snackbar.setElevation(4.0f);
                snackbar.addButton("Button", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Any Code
                    }
                });
                snackbar.setBackgroundDrawable(R.drawable.design_snackbar_material_background);
                snackbar.setMargin(12,12,12,12);
                snackbar.show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
