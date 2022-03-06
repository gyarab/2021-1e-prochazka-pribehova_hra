package com.example.rocnikovaprace;

import static com.example.rocnikovaprace.GameStatus.*;
import static com.example.rocnikovaprace.Mainpart.buttons;

public class UserInput {

    GameStatus gameStatus = GARDEN;

    public UserInput() {

    }

    void processResponse(int actionNumber) {
        int a = actionNumber;
        Texts content = new Texts();
        switch(gameStatus) {

            case GARDEN:
                if (a == 0) {
                buttons[4].setDisable(true);
                content.getStory("Uvod1");
                }



            case TOILET:

            default:
        }


        }
    }


