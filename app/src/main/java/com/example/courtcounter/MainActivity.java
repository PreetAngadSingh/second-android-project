package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA;
    int yellowA;
    int redA;
    int scoreB;
    int yellowB;
    int redB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //when Goal button is pressed
    public void goalScoredA(View view){
        scoreA=scoreA+1;
        displayForTeamA(scoreA);
    }
    //when Yellow Card button is pressed
    public void yellowCardA(View view)
    {
        yellowA=yellowA+1;
        displayYellowTeamA(yellowA);
    }
    //when Red Card button is pressed
    public void redCardA(View view)
    {
        redA++;
        displayRedTeamA(redA);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }

    /**
     *To display yellow card for Team A
     */
    public void displayYellowTeamA(int yellowA) {
        TextView yellowView = (TextView) findViewById(R.id.team_a_yellow);
        yellowView.setText(String.valueOf(yellowA));
    }
    /**
     *To display red card for Team A
     */
    public void displayRedTeamA(int redA) {
        TextView redView = (TextView) findViewById(R.id.team_a_red);
        redView.setText(String.valueOf(redA));
    }

    //when Goal Button is pressed Team B
    public void goalScoredB(View view){
        scoreB=scoreB+1;
        displayForTeamB(scoreB);
    }
    //when Yellow Card button is pressed Team B
    public void yellowCardB(View view)
    {
        yellowB=yellowB+1;
        displayYellowTeamB(yellowB);
    }
    //when Red Card button is pressed Team B
    public void redCardB(View view)
    {
        redB++;
        displayRedTeamB(redB);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }
    /**
     *To display yellow card for Team A
     */
    public void displayYellowTeamB(int yellowB) {
        TextView yellowView = (TextView) findViewById(R.id.team_b_yellow);
        yellowView.setText(String.valueOf(yellowB));
    }
    /**
     *To display red card for Team A
     */
    public void displayRedTeamB(int scoreB) {
        TextView redView = (TextView) findViewById(R.id.team_b_red);
        redView.setText(String.valueOf(redB));
    }
    public void  resetBut(View view)
    {
        scoreA=0;
        yellowA=0;
        redA=0;
        scoreB=0;
        yellowB=0;
        redB=0;
        displayForTeamA(scoreA);
        displayYellowTeamA(yellowA);
        displayRedTeamA(redA);
        displayForTeamB(scoreB);
        displayYellowTeamB(yellowB);
        displayRedTeamB(redB);
    }
}
