package com.hwr_goes_beuth.cardz.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Project0rion on 15.12.2016.
 */
public class Deck {

    private long id;
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
    }
}