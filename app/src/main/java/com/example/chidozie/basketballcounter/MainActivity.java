package com.example.chidozie.basketballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plusThree(View view){
        String tag = view.getTag().toString();
        if(tag.equals("A")) teamAScore = teamAScore + 3;
        else teamBScore += 3;
        if(tag.equals("A")) displayScore(teamAScore, tag);
        else displayScore(teamBScore, tag);
    }

    public void plusTwo(View view){
        String tag = view.getTag().toString();
        if(tag.equals("A")) teamAScore += 2;
        else teamBScore += 2;
        if(tag.equals("A")) displayScore(teamAScore, tag);
        else displayScore(teamBScore, tag);
    }

    public void plusOne(View view){
        String tag = view.getTag().toString();
        if(tag.equals("A")) teamAScore += 1;
        else teamBScore += 1;
        if(tag.equals("A")) displayScore(teamAScore, tag);
        else displayScore(teamBScore, tag);
    }

    public void reset(View view){
        teamAScore = 0;
        teamBScore = 0;
        displayScore(teamAScore, "A");
        displayScore(teamBScore, "B");
    }

    private void displayScore(int score, String tag){
        TextView quantityTextView;
        if(tag.equals("A")) quantityTextView = (TextView) findViewById(R.id.teamAScore);
        else quantityTextView = (TextView) findViewById(R.id.teamBScore);
        quantityTextView.setText("" + score);
    }
}
