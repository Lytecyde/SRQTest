package com.company;

/**
 * Created by diku on 11/26/15.
 */
public class Question {
    String itemText;
    int id;
    boolean reverse;
    int answer;

    public Question(String text, int id, boolean reverse){
        this.itemText = text;
        this.id = id;
        this.reverse = reverse;
    }
}
