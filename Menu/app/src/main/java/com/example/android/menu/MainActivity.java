package com.example.android.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView textView = (TextView) findViewById(R.id.menu_item_1);
        String log=textView.getText().toString();
        Log.i("MainActivity",log);
        textView = (TextView) findViewById(R.id.menu_item_2);
        log=textView.getText().toString();
        Log.i("MainActivity",log);
        textView = (TextView) findViewById(R.id.menu_item_3);
        log=textView.getText().toString();
        Log.i("MainActivity",log);

        // Find second menu item TextView and print the text to the logs

        // Find third menu item TextView and print the text to the logs

    }
}
