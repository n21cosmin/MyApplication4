package com.example.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.myapplication.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0;
    int scoreTeamB=0;
    int foulScoreTeamA=0;
    int foulScoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulForTeamA(foulScoreTeamA);
        displayFoulForTeamB(foulScoreTeamB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulForTeamA(int foulScore) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul_score);
        scoreView.setText(String.valueOf(foulScore));
    }

    public void addPointForTeamA(View v)
    {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void addFoulForTeamA(View v)
    {
        foulScoreTeamA = foulScoreTeamA + 1;
        displayFoulForTeamA(foulScoreTeamA);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulForTeamB(int foulScore) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul_score);
        scoreView.setText(String.valueOf(foulScore));
    }

    public void addPointForTeamB(View v)
    {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void addFoulForTeamB(View v)
    {
        foulScoreTeamB = foulScoreTeamB + 1;
        displayFoulForTeamB(foulScoreTeamB);
    }

    public void resetScore(View v)
    {
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        foulScoreTeamA = 0;
        foulScoreTeamB = 0;
        displayFoulForTeamA(foulScoreTeamA);
        displayFoulForTeamB(foulScoreTeamB);
    }


}

