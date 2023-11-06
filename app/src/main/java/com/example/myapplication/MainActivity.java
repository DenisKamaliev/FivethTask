package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView secondTextView = findViewById(R.id.textView2);
        TextView thirdTextView = findViewById(R.id.textView3);
        TextView fourTextView = findViewById(R.id.textView4);

        ImageView right_bottom_image = findViewById(R.id.imageView);
        right_bottom_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] phrases = {
                        "Уже 6 часов утра, Хозяин",
                        "Вставай, мы там всё пометили",
                        "Мы пометили вообще всё, Хозяин, честно",
                        "Хозяин, пошли гулять!",
                        "А я белку съел",
                        "Гулять срочно!",
                        "Хозяин, мы гулять хотим!"};

                shuffleArray(phrases); // перемешиваем

                secondTextView.setText(phrases[0]);
                thirdTextView.setText(phrases[1]);
                fourTextView.setText(phrases[2]);
            }
        });
    }

    void shuffleArray(String[] ar){
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            String a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
}