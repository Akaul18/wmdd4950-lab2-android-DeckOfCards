package com.example.deckofcards;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//import android.widget.RadioButton;
import android.widget.TextView;
//import java.util.Random;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class MainActivity extends AppCompatActivity {

    private int count = 51;
    private List<String> finalList = new ArrayList<>();
    Object[] list;
//    private String[] list;
//    Random random = new Random();

    String[] ranks = {
            "Ace","Two","Three","Four","Five", "Six","Seven", "Eight", "Nine", "Ten", "Jack",
            "Queen","King"
    };

    String[] suits = {

            "Spades", "Clubs", "Diamond", "Hearts"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = this.findViewById(R.id.button);

        for(int i=0;i<suits.length;i++) {
            for (int j = 0; j < ranks.length; j++) {
                finalList.add(String.valueOf(new Cards(ranks[j], suits[i])));
            }
        }
//        list = finalList.toArray();

        Collections.shuffle(finalList);

        btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {


                TextView text = findViewById(R.id.textView);
                TextView remaining = findViewById(R.id.textView3);

//                int randNum=random.nextInt(ranks.length);
//                int randNum2=random.nextInt(suits.length);

//                String finalValue= ranks[randNum]+" of "+suits[randNum2];
//                text.setText(finalValue);


                text.setText(finalList.get(count));
                remaining.setText(String.valueOf(count));

                count--;
                if(count == -1) count = 51;
            }
        });
    }
}
