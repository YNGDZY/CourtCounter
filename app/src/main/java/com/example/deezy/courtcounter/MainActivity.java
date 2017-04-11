package com.example.deezy.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {
int scoreA = 0;
int scoreB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }


    public void threePointA (View view){
        scoreA= scoreA + 3;
        displayForTeamA (scoreA);

    }
    public void twoPointA (View view){
        scoreA= scoreA + 2;
        displayForTeamA(scoreA);

    }
    public void onePointA (View view){
        scoreA= scoreA + 1;
        displayForTeamA(scoreA);


    }
    public void displayForTeamA (int number){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(number));
    }

    public void threePointB (View view){
        scoreB= scoreB + 3;
        displayForTeamB (scoreB);

    }
    public void twoPointB (View view){
        scoreB= scoreB + 2;
        displayForTeamB(scoreB);

    }
    public void onePointB (View view){
        scoreB= scoreB + 1;
        displayForTeamB(scoreB);


    }
    public void displayForTeamB (int number){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(number));
    }

    public void reset (View view){
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);

    }
}
