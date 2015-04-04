package com.londite.zurullo;

import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Android studio found the IDs without problem when they were in the activity
        // but now in the fragment, it seems that it can't find them, both button and
        // editText.
        Button buttonGo = (Button) findViewById(R.id.buttonGo);
    }

    public void goButton (View view) {
        EditText laURL=(EditText) findViewById(R.id.editTextURL);

        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(laURL.getText().toString())));
    }



}
