package com.keyvani.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout layout = (RelativeLayout) findViewById(R.id.mainActivity);

        String[] buttonNames = {
                "Spotify Streamer",
                "Scores App",
                "Library App",
                "Build It Bigger",
                "XYZ Reader",
                "Capstone Project"
        };

        // start iterating from 1 to skip the TextView item
        for (int i = 1; i < layout.getChildCount(); i++) {
            View v = layout.getChildAt(i);
            if (v instanceof Button) {
                ((Button) v).setText(buttonNames[i - 1]);
            }
        }
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

    public void displayToast(View view) {

//        String buttonName = view.getResources().getResourceEntryName(view.getId());
//        Log.d("MainActivity", buttonName + " Clicked!");

        Button b = (Button) view;
        String bt = (String) b.getText();
        Toast.makeText(this, "This button will lunch my " + bt + " app!", Toast.LENGTH_LONG)
        .show();
    }
}
