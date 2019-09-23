package com.example.deckofcards;

//import java.lang.String;


class Cards extends Object {
    private String rank;
    private String suit;

    public Cards(String r,String s) {
        rank=r;
        suit=s;
    }

    @Override
    public String toString() {
        return rank+" of "+suit;
    }
}
