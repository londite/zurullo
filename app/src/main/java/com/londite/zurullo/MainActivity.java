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

        //I don't know why is not grabbing the id of the button
        Button buttonGo = (Button) findViewById(R.id.buttonGo);

    }

        //Is not grabbing the editText ID either. I probably forgot something
    public void goButton (View v) {
        EditText laURL=(EditText) findViewById(R.id.editTextURL);

        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(laURL.getText().toString())));
    }


}
