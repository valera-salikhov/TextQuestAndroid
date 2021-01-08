package com.example.quest_new;

public class Situation {
    Situation[] direction;
    String subject,text;
    public Situation (String subject, String text, int variants) {
        this.subject=subject;
        this.text=text;
        direction=new Situation[variants];
    }
}
