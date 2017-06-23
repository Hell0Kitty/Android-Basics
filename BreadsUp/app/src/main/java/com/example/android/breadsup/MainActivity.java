package com.example.android.breadsup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick1 (View view)
    {
        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.group2);
        if (radioGroup2.getCheckedRadioButtonId()!=-1)
            radioGroup2.clearCheck();
    }
    public void onClick2 (View view)
    {
        RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.group1);
        if (radioGroup1.getCheckedRadioButtonId()!=-1)
            radioGroup1.clearCheck();
    }
}
