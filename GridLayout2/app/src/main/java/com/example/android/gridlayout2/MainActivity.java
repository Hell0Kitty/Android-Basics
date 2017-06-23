package com.example.android.gridlayout2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreForTeamA = 0, scoreForTeamB = 0;
    int ifGameStart = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView view = (TextView) findViewById(R.id.result);
        view.setText("");
    }

    public void displayForTeamA() {
        TextView textview = (TextView) findViewById(R.id.TeamAScore);
        textview.setText(String.valueOf(scoreForTeamA));
    }

    public void displayForTeamB() {
        TextView textview = (TextView) findViewById(R.id.TeamBScore);
        textview.setText(String.valueOf(scoreForTeamB));
    }

    public void addThreeForA(View view) {
        if (ifGameStart == 1) {
            scoreForTeamA += 3;
            displayForTeamA();
        }
    }

    public void addTwoForA(View view) {
        if (ifGameStart == 1) {
            scoreForTeamA += 2;
            displayForTeamA();
        }
    }

    public void addOneForA(View view) {
        if (ifGameStart == 1) {
            scoreForTeamA += 1;
            displayForTeamA();
        }
    }

    public void addThreeForB(View view) {
        if (ifGameStart == 1) {
            scoreForTeamB += 3;
            displayForTeamB();
        }
    }

    public void addTwoForB(View view) {
        if (ifGameStart == 1) {
            scoreForTeamB += 2;
            displayForTeamB();
        }
    }

    public void addOneForB(View view) {
        if (ifGameStart == 1) {
            scoreForTeamB += 1;
            displayForTeamB();
        }
    }

    public void StartAndEnd(View view) {

        switch (ifGameStart) {
            case 0: {
                Button button = (Button) findViewById(R.id.power);
                button.setText("End");
                ifGameStart = 1;
                break;
            }
            case 1: {
                Button button = (Button) findViewById(R.id.power);
                button.setText("Reset");
                ifGameStart = 2;
                if (scoreForTeamA > scoreForTeamB) {
                    TextView textview = (TextView) findViewById(R.id.result);
                    textview.setText("Team A Win!");
                } else if (scoreForTeamA < scoreForTeamB) {
                    TextView textview = (TextView) findViewById(R.id.result);
                    textview.setText("Team B Win!");
                } else {
                    TextView textview = (TextView) findViewById(R.id.result);
                    textview.setText("Draw!");
                }
                break;
            }
            case 2: {
                Button button = (Button) findViewById(R.id.power);
                button.setText("start");
                ifGameStart = 0;
                scoreForTeamA=0;
                scoreForTeamB=0;
                displayForTeamB();
                displayForTeamA();
                TextView textview = (TextView) findViewById(R.id.result);
                textview.setText("");
                break;
            }
        }
    } /*else if (ifGameEnd == false) {
            ifGameEnd = true;
            ifGameStart = false;
            Button button = (Button) findViewById(R.id.power);
            button.setText("reset");

            if (scoreForTeamA > scoreForTeamB) {
                TextView textview = (TextView) findViewById(R.id.result);
                textview.setText("Team A Win!");
            } else if (scoreForTeamA < scoreForTeamB) {
                TextView textview = (TextView) findViewById(R.id.result);
                textview.setText("Team B Win!");
            } else {
                TextView textview = (TextView) findViewById(R.id.result);
                textview.setText("Draw!");
            }
        } else {
            ifGameEnd = false;
            ifGameStart = false;
            Button button = (Button) findViewById(R.id.power);
            button.setText("start");
            scoreForTeamA = 0;
            scoreForTeamB = 0;
            displayForTeamA();
            displayForTeamB();
        }*/
}
