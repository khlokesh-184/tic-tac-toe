package com.lokesh.android.tic_tac_toe;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {
    int check=1;

    int table[][]= new int[3][3];


    public int checkIfWinner() {
        if( table [0][0]==table[1][0] && table[1][0] == table[2][0] && table[0][0]!=0 && table[1][0]!=0 && table[2][0]!=0){
            if(table[0][0]==1){
                return 1;
            }
            return  -1;
        }

        else if( table [0][1]==table[1][1] && table[1][1] == table[2][1] && table[0][1]!=0 && table[1][1]!=0 && table[2][1]!=0)
            {
                if(table[0][1]==1){
                    return 1;
                }
                return  -1;
            }
        else if( table [0][2]==table[1][2] && table[1][2] == table[2][2] && table[0][2]!=0 && table[1][2]!=0 && table[2][2]!=0)
            {
                if(table[0][2]==1){
                    return 1;
                }
                return  -1;
            }
        else if( table [0][0]==table[0][1] && table[0][1] == table[0][2] && table[0][0]!=0 && table[0][1]!=0 && table[0][2]!=0)
            {
                if(table[0][0]==1){
                    return 1;
                }
                return  -1;
            }
        else if( table [1][0]==table[1][1] && table[1][1] == table[1][2] && table[1][0]!=0 && table[1][1]!=0 && table[1][2]!=0)
            {
                if(table[1][0]==1){
                    return 1;
                }
                return  -1;
            }
        else if( table [2][0]==table[2][1] && table[2][1] == table[2][2] && table[2][0]!=0 && table[2][1]!=0 && table[2][2]!=0)
            {
                if(table[2][0]==1){
                    return 1;
                }
                return  -1;
            }
        else if( table [0][0]==table[1][1] && table[1][1] == table[2][2] && table[0][0]!=0 && table[1][1]!=0 && table[2][2]!=0)
            {
                if(table[0][0]==1){
                    return 1;
                }
                return  -1;
            }
        else if( table [2][0]==table[1][1] && table[1][1] == table[0][2] && table[0][2]!=0&& table[1][1]!=0 && table[2][0]!=0)
            {
                if(table[0][0]==1){
                    return 1;
                }
                return  -1;
            }
        else
            return 0;
    }


    public boolean checkIfTie() {
        for (int i = 0; i < 3; i++) {
            for (int p = 0; p < 3; p++) {
                if (table[i][p] == 0)
                    return false;
            }
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView mTextField= (TextView) findViewById(R.id.timer);






        //int check=1;

        final Button botton_00 = (Button) findViewById(R.id._00);
        final Button botton_01 = (Button) findViewById(R.id._01);
        final Button botton_02 = (Button) findViewById(R.id._02);
        final Button botton_10 = (Button) findViewById(R.id._10);
        final Button botton_11 = (Button) findViewById(R.id._11);
        final Button botton_12 = (Button) findViewById(R.id._12);
        final Button botton_20 = (Button) findViewById(R.id._20);
        final Button botton_21 = (Button) findViewById(R.id._21);
        final Button botton_22 = (Button) findViewById(R.id._22);

        botton_00.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(check==1){
                    botton_00.setText("X");
                    table[0][0]=1;
                    check=0;
                }
                else{
                    botton_00.setText("O");
                    table[0][0]=-1;
                    check=1;
                }
                int res=checkIfWinner();
                boolean tie=checkIfTie();
                TextView t=(TextView) findViewById(R.id.player_chance);
                if(res==1){

                    t.setText("Player 1 wins");
                }
                else if(res==-1){
                    t.setText("Player 2 wins");
                }
                else if(tie){
                    t.setText("DRAW");
                }
                botton_00.setClickable(false);
            }
        });

        botton_01.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(check==1){
                    botton_01.setText("X");
                    table[0][1]=1;
                    check=0;
                }
                else{
                    botton_01.setText("O");
                    table[0][1]=-1;
                    check=1;
                }
                int res=checkIfWinner();
                boolean tie=checkIfTie();
                TextView t=(TextView) findViewById(R.id.player_chance);
                if(res==1){

                    t.setText("Player 1 wins");
                }
                else if(res==-1){
                    t.setText("Player 2 wins");
                }
                else if(tie){
                    t.setText("DRAW");
                }
                botton_01.setClickable(false);
            }
        });

        botton_02.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(check==1){
                    botton_02.setText("X");
                    table[0][2]=1;
                    check=0;
                }
                else{
                    botton_02.setText("O");
                    table[0][2]=-1;
                    check=1;
                }
                int res=checkIfWinner();
                boolean tie=checkIfTie();
                TextView t=(TextView) findViewById(R.id.player_chance);
                if(res==1){

                    t.setText("Player 1 wins");
                }
                else if(res==-1){
                    t.setText("Player 2 wins");
                }
                else if(tie){
                    t.setText("DRAW");
                }
                botton_02.setClickable(false);
            }
        });
        botton_10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(check==1){
                    botton_10.setText("X");
                    table[1][0]=1;
                    check=0;
                }
                else{
                    botton_10.setText("O");
                    table[1][0]=-1;
                    check=1;
                }
                int res=checkIfWinner();
                boolean tie=checkIfTie();
                TextView t=(TextView) findViewById(R.id.player_chance);
                if(res==1){

                    t.setText("Player 1 wins");
                }
                else if(res==-1){
                    t.setText("Player 2 wins");
                }
                else if(tie){
                    t.setText("DRAW");
                }
                botton_10.setClickable(false);
            }
        });

        botton_11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(check==1){
                    botton_11.setText("X");
                    table[1][1]=1;
                    check=0;
                }
                else{
                    botton_11.setText("O");
                    table[1][1]=-1;
                    check=1;
                }
                int res=checkIfWinner();
                boolean tie=checkIfTie();
                TextView t=(TextView) findViewById(R.id.player_chance);
                if(res==1){

                    t.setText("Player 1 wins");
                }
                else if(res==-1){
                    t.setText("Player 2 wins");
                }
                else if(tie){
                    t.setText("DRAW");
                }
                botton_11.setClickable(false);
            }
        });
        botton_12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(check==1){
                    botton_12.setText("X");
                    table[1][2]=1;
                    check=0;
                }
                else{
                    botton_12.setText("O");
                    table[1][2]=-1;
                    check=1;
                }
                int res=checkIfWinner();
                boolean tie=checkIfTie();
                TextView t=(TextView) findViewById(R.id.player_chance);
                if(res==1){

                    t.setText("Player 1 wins");
                }
                else if(res==-1){
                    t.setText("Player 2 wins");
                }
                else if(tie){
                    t.setText("DRAW");
                }
                botton_12.setClickable(false);
            }
        });
        botton_20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(check==1){
                    botton_20.setText("X");
                    table[2][0]=1;
                    check=0;
                }
                else{
                    botton_20.setText("O");
                    table[2][0]=-1;
                    check=1;
                }
                int res=checkIfWinner();
                boolean tie=checkIfTie();
                TextView t=(TextView) findViewById(R.id.player_chance);
                if(res==1){

                    t.setText("Player 1 wins");
                }
                else if(res==-1){
                    t.setText("Player 2 wins");
                }
                else if(tie){
                    t.setText("DRAW");
                }
                botton_20.setClickable(false);
            }
        });
        botton_21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(check==1){
                    botton_21.setText("X");
                    table[2][1]=1;
                    check=0;
                }
                else{
                    botton_21.setText("O");
                    table[2][1]=-1;
                    check=1;
                }
                int res=checkIfWinner();
                boolean tie=checkIfTie();
                TextView t=(TextView) findViewById(R.id.player_chance);
                if(res==1){

                    t.setText("Player 1 wins");
                }
                else if(res==-1){
                    t.setText("Player 2 wins");
                }
                else if(tie){
                    t.setText("DRAW");
                }
                botton_21.setClickable(false);
            }
        });
        botton_22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(check==1){
                    botton_22.setText("X");
                    table[2][2]=1;
                    check=0;
                }
                else{
                    botton_22.setText("O");
                    table[2][2]=-1;
                    check=1;
                }
                int res=checkIfWinner();
                boolean tie=checkIfTie();
                TextView t=(TextView) findViewById(R.id.player_chance);
                if(res==1){

                    t.setText("Player 1 wins");
                }
                else if(res==-1){
                    t.setText("Player 2 wins");
                }
                else if(tie){
                    t.setText("DRAW");
                }

                botton_22.setClickable(false);
            }
        });



        final Button botton_enter_1 = (Button) findViewById(R.id.enter_1);
        final Button botton_enter_2 = (Button) findViewById(R.id.enter_2);
        final Button botton_enter_3 = (Button) findViewById(R.id.enter_3);
        final Button botton_enter_4 = (Button) findViewById(R.id.enter_4);
        final Button botton_enter_5 = (Button) findViewById(R.id.enter_5);
        final Button botton_enter_6 = (Button) findViewById(R.id.enter_6);
        final Button botton_enter_7 = (Button) findViewById(R.id.enter_7);
        final Button botton_enter_8 = (Button) findViewById(R.id.enter_8);
        final Button botton_enter_9 = (Button) findViewById(R.id.enter_9);
        final Button botton_enter_0 = (Button) findViewById(R.id.enter_0);

        final Button back_button= (Button) findViewById(R.id.back);

        final Score a=new Score();

        back_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a.clearScore();
            }
        });

        botton_enter_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a.setScore(1);
            }
        });
        botton_enter_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a.setScore(2);
            }
        });
        botton_enter_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a.setScore(3);
            }
        });
        botton_enter_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a.setScore(4);
            }
        });
        botton_enter_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a.setScore(5);
            }
        });
        botton_enter_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a.setScore(6);
            }
        });
        botton_enter_7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a.setScore(7);
            }
        });
        botton_enter_8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a.setScore(8);
            }
        });
        botton_enter_9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a.setScore(9);
            }
        });
        botton_enter_0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a.setScore(0);
            }
        });

        final Button button = (Button) findViewById(R.id.timer_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView score=(TextView) findViewById(R.id.score);
                score.setText(""+0);
                botton_enter_0.setClickable(true);
                botton_enter_1.setClickable(true);
                botton_enter_2.setClickable(true);
                botton_enter_3.setClickable(true);
                botton_enter_4.setClickable(true);
                botton_enter_5.setClickable(true);
                botton_enter_6.setClickable(true);
                botton_enter_7.setClickable(true);
                botton_enter_8.setClickable(true);
                botton_enter_9.setClickable(true);

                back_button.setClickable(true);

                botton_00.setClickable(false);
                botton_01.setClickable(false);
                botton_02.setClickable(false);
                botton_10.setClickable(false);
                botton_11.setClickable(false);
                botton_12.setClickable(false);
                botton_20.setClickable(false);
                botton_21.setClickable(false);
                botton_22.setClickable(false);


                // Perform action on click
                new CountDownTimer(7000, 1000) {

                    public void onTick(long millisUntilFinished) {
                        mTextField.setText("seconds remaining: " + millisUntilFinished / 1000);
                    }

                    public void onFinish() {
                        mTextField.setText("done!");

                        botton_enter_0.setClickable(false);
                        botton_enter_1.setClickable(false);
                        botton_enter_2.setClickable(false);
                        botton_enter_3.setClickable(false);
                        botton_enter_4.setClickable(false);
                        botton_enter_5.setClickable(false);
                        botton_enter_6.setClickable(false);
                        botton_enter_7.setClickable(false);
                        botton_enter_8.setClickable(false);
                        botton_enter_9.setClickable(false);

                        back_button.setClickable(false);

                        botton_00.setClickable(true);
                        botton_01.setClickable(true);
                        botton_02.setClickable(true);
                        botton_10.setClickable(true);
                        botton_11.setClickable(true);
                        botton_12.setClickable(true);
                        botton_20.setClickable(true);
                        botton_21.setClickable(true);
                        botton_22.setClickable(true);

                    }
                }.start();

            }
        });

    }

    class Score{
        public void setScore(int a){
            TextView score=(TextView) findViewById(R.id.score);
            TextView remaining_coins=(TextView) findViewById(R.id.remaining_balance);
            int currentBid=Integer.parseInt(score.getText().toString());
            int bid_remaining=Integer.parseInt(remaining_coins.getText().toString());

            int newBid=currentBid*10+a;
            if(newBid<=100 && (newBid-currentBid)<=bid_remaining){
                score.setText(""+newBid);
                remaining_coins.setText(""+(bid_remaining-(newBid-currentBid)));

            }
            else{
                score.setText(""+currentBid);
            }
        }

        public  void clearScore(){
            TextView score=(TextView) findViewById(R.id.score);
            TextView remaining_coins=(TextView) findViewById(R.id.remaining_balance);
            //String curr_Bid=score.getText().toString();
            int currentBid=Integer.parseInt(score.getText().toString());
            score.setText("0");
            remaining_coins.setText(""+(Integer.parseInt(remaining_coins.getText().toString())+currentBid));
        }
    }
}
