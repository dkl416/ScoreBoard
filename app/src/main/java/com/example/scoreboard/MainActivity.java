package com.example.scoreboard;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.scoreboard.R;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {

    public int score_A = 0;
    public int score_B = 0;
    //EditText edit = (EditText) findViewById(R.id.quantity_text_view);

    @Nullable
    @Override
    public View findViewById(@IdRes int id) {
        return super.findViewById(id);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void getScore(View view) {

        switch (view.getId()) {
            case R.id.A_3:
                score_A += 3;
                break;
            case R.id.A_2:
                score_A+=2;
                break;
            case R.id.A_1:
                score_A+=1;
                break;
            case R.id.B_3:
                score_B += 3;
                break;
            case R.id.B_2:
                score_B+=2;
                break;
            case R.id.B_1:
                score_B+=1;
                break;
        }

        displayA(score_A);
        displayB(score_B);
    }

    public void resetScore(View view) {
        score_A = 0;
        score_B = 0;
        displayA(score_A);
        displayB(score_B);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayA(int number) {
        TextView scoreA = (TextView) findViewById(
                R.id.scoreA);
        scoreA.setText("" + number);
    }

    private void displayB(int number) {
        TextView scoreB = (TextView) findViewById(R.id.scoreB);
        scoreB.setText("" + number);
    }


}
