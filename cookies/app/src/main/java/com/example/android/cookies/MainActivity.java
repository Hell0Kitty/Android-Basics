package com.example.android.cookies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        TextView textView= (TextView) findViewById(R.id.status_text_view);
        ImageView imageView=(ImageView) findViewById(R.id.android_cookie_image_view);
        textView.setText("I am so full");
        imageView.setImageResource(R.drawable.after_cookie);
    }
}
