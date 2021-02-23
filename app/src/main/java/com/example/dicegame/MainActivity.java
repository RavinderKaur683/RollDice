package com.example.dicegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // View and widget classes for any component in your activity main.xml
        // you can create an object out of these to apply your logic
        // any component your create in activity main has an id in form of integer
        // that automatically store in your resources

        ImageView Left_Dice = findViewById(R.id.Left_Dice);
        ImageView Right_Dice = findViewById(R.id.Right_Dice);
        Button high_btn = findViewById(R.id.high_btn);
        Button low_btn =findViewById(R.id.low_btn);


        // we need to randomly pick one of the dice images that i have in my resources
        // and replace them with my left and right dice in my activity main

        int[] DiceArray = {R.drawable.dice1,
                            R.drawable.dice2,
                            R.drawable.dice3,
                            R.drawable.dice4,
                            R.drawable.dice5,
                            R.drawable.dice6};

        high_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // take the action we want to apply
                // two random numbers one to pick a left and one to pick a right

                Random rand = new Random();
                int LeftDice= rand.nextInt(6);
                int RightDice = rand.nextInt(6);

                Left_Dice.setImageResource(DiceArray[LeftDice]);
                Right_Dice.setImageResource(DiceArray[RightDice]);
                if (LeftDice>RightDice) {
                    Toast.makeText(MainActivity.this, "Left dice is greater... User Wins!", Toast.LENGTH_LONG).show();
                }
                else if(LeftDice<RightDice)
                    Toast.makeText(MainActivity.this, "Right dice is greater...Computer Wins!", Toast.LENGTH_LONG).show();
                else{
                    Toast.makeText(MainActivity.this, "Tie", Toast.LENGTH_LONG).show();
                }
                //Log.d("This is a message", "onClick: I am pressed!");
            }
        });
        low_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int LeftDice= rand.nextInt(6);
                int RightDice = rand.nextInt(6);

                Left_Dice.setImageResource(DiceArray[LeftDice]);
                Right_Dice.setImageResource(DiceArray[RightDice]);
                if (LeftDice>RightDice) {
                    Toast.makeText(MainActivity.this, "Left dice is greater....User Wins!", Toast.LENGTH_LONG).show();
                }
                else if(LeftDice<RightDice)
                    Toast.makeText(MainActivity.this, "Right dice is greater...Computer Wins!", Toast.LENGTH_LONG).show();

                else{
                    Toast.makeText(MainActivity.this, "Tie", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    private void elseif(boolean b) {
    }
}