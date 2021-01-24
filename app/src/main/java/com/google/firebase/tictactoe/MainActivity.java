package com.google.firebase.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int board[][]=new int[3][3];
        initialiseboard(board);
        final int occupied[]=new int[10];
        final int[] turn = {0};



        final Button b1=findViewById(R.id.b1);
        final Button b2=findViewById(R.id.b2);
        final Button b3=findViewById(R.id.b3);
        final Button b4=findViewById(R.id.b4);
        final Button b5=findViewById(R.id.b5);
        final Button b6=findViewById(R.id.b6);
        final Button b7=findViewById(R.id.b7);
        final Button b8=findViewById(R.id.b8);
        final Button b9=findViewById(R.id.b9);
        final Button[] buttonarray =new Button[10];

        buttonarray[1]=b1; buttonarray[2]=b2; buttonarray[3]=b3; buttonarray[4]=b4; buttonarray[5]=b5; buttonarray[6]=b6; buttonarray[7]=b7; buttonarray[8]=b8; buttonarray[9]=b9;
        reset(board,occupied,turn,buttonarray);
        ImageButton br=findViewById(R.id.br);

        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset(board,occupied,turn,buttonarray);
                Toast.makeText(MainActivity.this,"Resetting......",Toast.LENGTH_LONG).show();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(occupied[1]==0){
                    board[0][0]=turn[0];
                    occupied[1]=1;
                    if(turn[0] ==0){
                        b1.setText("X");
                        b1.setBackgroundColor(Color.parseColor("#C62828"));
                        turn[0] =1;
                    }else{
                        b1.setText("O");
                        b1.setBackgroundColor(Color.parseColor("#1565C0"));
                        turn[0] =0;
                    }
                }
                int st=checkboard(board,turn);
                if(st==1){
                    Toast.makeText(MainActivity.this,"Player 1 Wins Reseting......Better Luck Next Time Player 2",Toast.LENGTH_LONG).show();
                    reset(board,occupied,turn,buttonarray);
                }else if(st==2){
                    Toast.makeText(MainActivity.this,"Player 2 Wins Reseting......Better Luck Next Time Player 1",Toast.LENGTH_LONG).show();
                    reset(board,occupied,turn,buttonarray);
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(occupied[2]==0){
                    board[0][1]=turn[0];
                    occupied[2]=1;
                    if(turn[0] ==0){
                        b2.setText("X");
                        b2.setBackgroundColor(Color.parseColor("#C62828"));
                        turn[0] =1;
                    }else{
                        b2.setText("O");
                        b2.setBackgroundColor(Color.parseColor("#1565C0"));
                        turn[0] =0;
                    }
                }
                int st=checkboard(board,turn);
                if(st==1){
                    Toast.makeText(MainActivity.this,"Player 1 Wins Reseting......Better Luck Next Time Player 2",Toast.LENGTH_LONG).show();
                    reset(board,occupied,turn,buttonarray);
                }else if(st==2){
                    Toast.makeText(MainActivity.this,"Player 2 Wins Reseting......Better Luck Next Time Player 1",Toast.LENGTH_LONG).show();
                    reset(board,occupied,turn,buttonarray);
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(occupied[3]==0){
                    board[0][2]=turn[0];
                    occupied[3]=1;
                    if(turn[0] ==0){
                        b3.setText("X");
                        b3.setBackgroundColor(Color.parseColor("#C62828"));
                        turn[0] =1;
                    }else{
                        b3.setText("O");
                        b3.setBackgroundColor(Color.parseColor("#1565C0"));
                        turn[0] =0;
                    }
                }
                int st=checkboard(board,turn);
                if(st==1){
                    Toast.makeText(MainActivity.this,"Player 1 Wins Reseting......Better Luck Next Time Player 2",Toast.LENGTH_LONG).show();
                    reset(board,occupied,turn,buttonarray);
                }else if(st==2){
                    Toast.makeText(MainActivity.this,"Player 2 Wins Reseting......Better Luck Next Time Player 1",Toast.LENGTH_LONG).show();
                    reset(board,occupied,turn,buttonarray);
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(occupied[4]==0){
                    board[1][0]=turn[0];
                    occupied[4]=1;
                    if(turn[0] ==0){
                        b4.setText("X");
                        b4.setBackgroundColor(Color.parseColor("#C62828"));
                        turn[0] =1;
                    }else{
                        b4.setText("O");
                        b4.setBackgroundColor(Color.parseColor("#1565C0"));
                        turn[0] =0;
                    }
                }
                int st=checkboard(board,turn);
                if(st==1){
                    Toast.makeText(MainActivity.this,"Player 1 Wins Reseting......Better Luck Next Time Player 2",Toast.LENGTH_LONG).show();
                    reset(board,occupied,turn,buttonarray);
                }else if(st==2){
                    Toast.makeText(MainActivity.this,"Player 2 Wins Reseting......Better Luck Next Time Player 1",Toast.LENGTH_LONG).show();
                    reset(board,occupied,turn,buttonarray);
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(occupied[5]==0){
                    board[1][1]=turn[0];
                    occupied[5]=1;
                    if(turn[0] ==0){
                        b5.setText("X");
                        b5.setBackgroundColor(Color.parseColor("#C62828"));
                        turn[0] =1;
                    }else{
                        b5.setText("O");
                        b5.setBackgroundColor(Color.parseColor("#1565C0"));
                        turn[0] =0;
                    }
                }
                int st=checkboard(board,turn);
                if(st==1){
                    Toast.makeText(MainActivity.this,"Player 1 Wins Reseting......Better Luck Next Time Player 2",Toast.LENGTH_LONG).show();
                    reset(board,occupied,turn,buttonarray);
                }else if(st==2){
                    Toast.makeText(MainActivity.this,"Player 2 Wins Reseting......Better Luck Next Time Player 1",Toast.LENGTH_LONG).show();
                    reset(board,occupied,turn,buttonarray);
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(occupied[6]==0){
                    board[1][2]=turn[0];
                    occupied[6]=1;
                    if(turn[0] ==0){
                        b6.setText("X");
                        b6.setBackgroundColor(Color.parseColor("#C62828"));
                        turn[0] =1;
                    }else{
                        b6.setText("O");
                        b6.setBackgroundColor(Color.parseColor("#1565C0"));
                        turn[0] =0;
                    }
                }
                int st=checkboard(board,turn);
                if(st==1){
                    Toast.makeText(MainActivity.this,"Player 1 Wins Reseting......Better Luck Next Time Player 2",Toast.LENGTH_LONG).show();
                    reset(board,occupied,turn,buttonarray);
                }else if(st==2){
                    Toast.makeText(MainActivity.this,"Player 2 Wins Reseting......Better Luck Next Time Player 1",Toast.LENGTH_LONG).show();
                    reset(board,occupied,turn,buttonarray);
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(occupied[7]==0){
                    board[2][0]=turn[0];
                    occupied[7]=1;
                    if(turn[0] ==0){
                        b7.setText("X");
                        b7.setBackgroundColor(Color.parseColor("#C62828"));
                        turn[0] =1;
                    }else{
                        b7.setText("O");
                        b7.setBackgroundColor(Color.parseColor("#1565C0"));
                        turn[0] =0;
                    }
                }
                int st=checkboard(board,turn);
                if(st==1){
                    Toast.makeText(MainActivity.this,"Player 1 Wins Reseting......Better Luck Next Time Player 2",Toast.LENGTH_LONG).show();
                    reset(board,occupied,turn,buttonarray);
                }else if(st==2){
                    Toast.makeText(MainActivity.this,"Player 2 Wins Reseting......Better Luck Next Time Player 1",Toast.LENGTH_LONG).show();
                    reset(board,occupied,turn,buttonarray);
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(occupied[8]==0){
                    board[2][1]=turn[0];
                    occupied[8]=1;
                    if(turn[0] ==0){
                        b8.setText("X");
                        b8.setBackgroundColor(Color.parseColor("#C62828"));
                        turn[0] =1;
                    }else{
                        b8.setText("O");
                        b8.setBackgroundColor(Color.parseColor("#1565C0"));
                        turn[0] =0;
                    }
                }
                int st=checkboard(board,turn);
                if(st==1){
                    Toast.makeText(MainActivity.this,"Player 1 Wins Reseting......Better Luck Next Time Player 2",Toast.LENGTH_LONG).show();
                    reset(board,occupied,turn,buttonarray);
                }else if(st==2){
                    Toast.makeText(MainActivity.this,"Player 2 Wins Reseting......Better Luck Next Time Player 1",Toast.LENGTH_LONG).show();
                    reset(board,occupied,turn,buttonarray);
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(occupied[9]==0){
                    board[2][2]=turn[0];
                    occupied[9]=1;
                    if(turn[0] ==0){
                        b9.setText("X");
                        b9.setBackgroundColor(Color.parseColor("#C62828"));
                        turn[0] =1;
                    }else{
                        b9.setText("O");
                        b9.setBackgroundColor(Color.parseColor("#1565C0"));
                        turn[0] =0;
                    }
                }
                int st=checkboard(board,turn);
                if(st==1){
                    Toast.makeText(MainActivity.this,"Player 1 Wins Reseting......Better Luck Next Time Player 2",Toast.LENGTH_LONG).show();
                    reset(board,occupied,turn,buttonarray);
                }else if(st==2){
                    Toast.makeText(MainActivity.this,"Player 2 Wins Reseting......Better Luck Next Time Player 1",Toast.LENGTH_LONG).show();
                    reset(board,occupied,turn,buttonarray);
                }
            }
        });

    }

    private int checkboard(int[][] board,int[] turn) {
        // for player 1
        if(board[0][0]==board[0][1]&&board[0][1]==board[0][2]&&board[0][0]==0)return 1;
        if(board[1][0]==board[1][1]&&board[1][1]==board[1][2]&&board[1][0]==0)return 1;
        if(board[2][0]==board[2][1]&&board[2][1]==board[2][2]&&board[2][0]==0)return 1;
        if(board[0][0]==board[1][0]&&board[1][0]==board[2][0]&&board[0][0]==0)return 1;
        if(board[0][1]==board[1][1]&&board[1][1]==board[2][1]&&board[0][1]==0)return 1;
        if(board[0][2]==board[1][2]&&board[1][2]==board[2][2]&&board[0][2]==0)return 1;
        if(board[0][0]==board[1][1]&&board[1][1]==board[2][2]&&board[0][0]==0)return 1;
        if(board[0][2]==board[1][1]&&board[1][1]==board[2][0]&&board[1][1]==0)return 1;

        if(board[0][0]==board[0][1]&&board[0][1]==board[0][2]&&board[0][0]==1)return 2;
        if(board[1][0]==board[1][1]&&board[1][1]==board[1][2]&&board[1][0]==1)return 2;
        if(board[2][0]==board[2][1]&&board[2][1]==board[2][2]&&board[2][0]==1)return 2;
        if(board[0][0]==board[1][0]&&board[1][0]==board[2][0]&&board[0][0]==1)return 2;
        if(board[0][1]==board[1][1]&&board[1][1]==board[2][1]&&board[0][1]==1)return 2;
        if(board[0][2]==board[1][2]&&board[1][2]==board[2][2]&&board[0][2]==1)return 2;
        if(board[0][0]==board[1][1]&&board[1][1]==board[2][2]&&board[0][0]==1)return 2;
        if(board[0][2]==board[1][1]&&board[1][1]==board[2][0]&&board[1][1]==1)return 2;
        return 0;

    }

    private void reset(int[][] board, int[] occupied, int[] turn,Button[] arr) {
       initialiseboard(board);
        for(int i=1;i<=9;i++){
            occupied[i]=0;
        }
        turn[0] =0;
       for(int i=1;i<=9;i++){ arr[i].setText("-"); arr[i].setBackgroundColor(Color.parseColor("#C59F80"));}
    }

    private void initialiseboard(int[][] board) {
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                board[i][j]=-1;
        }
    }
}