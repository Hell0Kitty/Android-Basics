package com.example.android.practiceset2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0, scoreB = 0;
    boolean gameOn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayResult("");
    }

    public void p3a(View view) {
        if (gameOn == false) {
            gameOn = true;
            TextView t = (TextView) findViewById(R.id.gameResult);
            t.setText("");
        }
        scoreA += 3;
        displaya(scoreA);
    }

    public void p1a(View view) {
        if (gameOn == false) {
            gameOn = true;
            TextView t = (TextView) findViewById(R.id.gameResult);
            t.setText("");
        }
        scoreA += 1;
        displaya(scoreA);
    }

    public void p2a(View view) {
        if (gameOn == false) {
            gameOn = true;
            TextView t = (TextView) findViewById(R.id.gameResult);
            t.setText("");
        }
        scoreA += 2;
        displaya(scoreA);
    }

    public void p3b(View view) {
        if (gameOn == false) {
            gameOn = true;
            TextView t = (TextView) findViewById(R.id.gameResult);
            t.setText("");
        }
        scoreB += 3;
        displayb(scoreB);
    }

    public void p1b(View view) {
        if (gameOn == false) {
            gameOn = true;
            TextView t = (TextView) findViewById(R.id.gameResult);
            t.setText("");
        }
        scoreB += 1;
        displayb(scoreB);
    }

    public void p2b(View view) {
        if (gameOn == false) {
            gameOn = true;
            TextView t = (TextView) findViewById(R.id.gameResult);
            t.setText("");
        }
        scoreB += 2;
        displayb(scoreB);
    }

    public void displaya(int score) {
        String text = "" + score;
        TextView t = (TextView) findViewById(R.id.scoreA);
        t.setText(text);
    }

    public void displayb(int score) {
        String text = "" + score;
        TextView t = (TextView) findViewById(R.id.scoreB);
        t.setText(text);
    }

    public void displayResult(String text) {
        TextView t = (TextView) findViewById(R.id.gameResult);
        t.setText(text);
    }


    public void changeGameStates(View view) {
        if (scoreA!=0 && scoreB!=0) {
            gameOn = false;
            if (scoreA > scoreB) {
                String text = "Team a win!";
                TextView t = (TextView) findViewById(R.id.gameResult);
                t.setText(text);
            } else {
                if (scoreA == scoreB) {
                    String text = "same result!";
                    TextView t = (TextView) findViewById(R.id.gameResult);
                    t.setText(text);
                } else {
                    String text = "Team b win!";
                    TextView t = (TextView) findViewById(R.id.gameResult);
                    t.setText(text);
                }
            }
        } else {
            TextView t = (TextView) findViewById(R.id.gameResult);
            t.setText("");
        }
        scoreA = 0;
        scoreB = 0;
        displaya(scoreA);
        displayb(scoreB);


    }


}
