package com.example.quest_new;

public class Situation {
    Situation[] direction;
    String subject, text, ch1, ch2, ch3;
    public Situation (String subject, String text, String ch1, String ch2, String ch3, int variants) {
        this.subject=subject;
        this.text=text;
        this.ch1 = ch1;
        this.ch2 = ch2;
        this.ch3 = ch3;
        direction = new Situation[variants];
    }
}
