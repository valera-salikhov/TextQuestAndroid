package com.example.quest_new;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView textView;
    Button[] choices = new Button[3];
    Character player;
    Story story;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        choices[0] = findViewById(R.id.choice1);
        choices[1] = findViewById(R.id.choice2);
        choices[2] = findViewById(R.id.choice3);
        for (Button b: choices) {
            b.setOnClickListener(this);
        }
        player = new Character();
        story = new Story();
        textView.setText("====================" + story.current_situation.subject + "====================\n" + story.current_situation.text);
    }

    @Override
    public void onClick(View v) {
        int choice = 0;
        if (v.getId() == R.id.choice1) {
            choice = 1;
        }
        if (v.getId() == R.id.choice2) {
            choice = 2;
        }
        if (v.getId() == R.id.choice3) {
            choice = 3;
        }
        if (story.isEnd()) {
            textView.setText("====================the end====================");
        }
        story.go(choice);
        textView.setText("====================" + story.current_situation.subject + "====================\n" + story.current_situation.text);
    }
}