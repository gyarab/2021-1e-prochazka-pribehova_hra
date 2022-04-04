package com.example.rocnikovaprace;

import static com.example.rocnikovaprace.GameStatus.*;
import static com.example.rocnikovaprace.Mainpart.buttons;

public class UserInput {

    GameStatus gameStatus = MENU;

    public UserInput() {

    }

    void processResponse(int actionNumber) {

        for ( int i = 0; i < buttons.length; i++){
            buttons[i].setDisable(false);

        }
        int a = actionNumber;
        Texts content = new Texts();

        switch (gameStatus) {
            case MENU:
                if (a == 0) {
                    buttons[3].setDisable(true);
                    buttons[4].setDisable(true);
                    content.getStory("Uvod");
                    gameStatus = UVOD;

                }
                break;
            case UVOD:
                if (a == 0) {
                    content.getStory("RozhovorSeStarostou");
                    buttons[3].setDisable(true);
                    buttons[4].setDisable(true);
                    gameStatus = SPAT;
                }
                if (a == 1) {
                    content.getStory("okno");
                    buttons[2].setDisable(true);
                    buttons[3].setDisable(true);
                    buttons[4].setDisable(true);
                    gameStatus = OKNO;
                }
                if (a == 2) {
                    content.getStory("dvere");
                    buttons[2].setDisable(true);
                    buttons[3].setDisable(true);
                    buttons[4].setDisable(true);
                    gameStatus = DVERE;
                }
                break;

            case SPAT:
                if (a == 0) {
                    content.getStory("rozhovor se Starostou A");
                    buttons[2].setDisable(true);
                    buttons[3].setDisable(true);
                    buttons[4].setDisable(true);
                    gameStatus = ROZHOVORSESTAROSTOUA;
                }
                if (a == 1) {
                    content.getStory("rozhovor se Starostou B");
                    buttons[2].setDisable(true);
                    buttons[3].setDisable(true);
                    buttons[4].setDisable(true);
                    gameStatus = ROZHOVORSESTAROSTOUB;
                }
                break;
            case OKNO:
                if (a == 0) {
                    content.getStory("okno A");
                    buttons[3].setDisable(true);
                    buttons[4].setDisable(true);
                    gameStatus = SPAT;
                }
                if (a == 1) {
                    content.getStory("okno B");
                    buttons[3].setDisable(true);
                    buttons[4].setDisable(true);
                    gameStatus = SPAT;
                }
                break;
            case DVERE:
                if (a == 0){
                    content.getStory("dvere A");
                    buttons[3].setDisable(true);
                    buttons[4].setDisable(true);
                    gameStatus = SPAT;
                }
                if (a == 1){
                    content.getStory("dvere B");
                    buttons[3].setDisable(true);
                    buttons[4].setDisable(true);
                    gameStatus = SPAT;
                }
                break;
            case ROZHOVORSESTAROSTOUB :
                if (a == 0){
                  content.getStory("rozhovor se starostou B_A");
                    buttons[2].setDisable(true);
                    buttons[3].setDisable(true);
                    buttons[4].setDisable(true);
                    gameStatus  = ROZHOVORSESTAROSTOUB_A;
                }
                if (a == 1){
                    content.getStory("rozhovor se starostou B_B");
                    buttons[2].setDisable(true);
                    buttons[3].setDisable(true);
                    buttons[4].setDisable(true);
                    gameStatus  = ROZHOVORSESTAROSTOUB_B;
                }
                break;
            case ROZHOVORSESTAROSTOUA:
                if (a == 0) {
                    content.getStory("rozhovor se starostou A_A");
                    buttons[2].setDisable(true);
                    buttons[3].setDisable(true);
                    buttons[4].setDisable(true);
                    gameStatus = ROZHOVORSESTAROSTOUA_A;

                }
                if (a == 1) {
                    content.getStory("rozhovor se starostou A_B");
                    buttons[2].setDisable(true);
                    buttons[3].setDisable(true);
                    buttons[4].setDisable(true);
                    gameStatus = ROZHOVORSESTAROSTOUA_B;

                }
                break;
            case ROZHOVORSESTAROSTOUA_B:
                break;
            case ROZHOVORSESTAROSTOUB_A:
                if (a == 0) {
                    content.getStory("rozhovor se starostou B,A_A");
                    buttons[2].setDisable(true);
                    buttons[3].setDisable(true);
                    buttons[4].setDisable(true);
                    gameStatus = ROZHOVORSESTAROSTOUBA_A;
                }

                if (a == 1) {
                    content.getStory("rozhovor se starostou B,A_B");
                    buttons[2].setDisable(true);
                    buttons[3].setDisable(true);
                    buttons[4].setDisable(true);
                    gameStatus = ROZHOVORSESTAROSTOUBA_B;
                }
                break;
            case ROZHOVORSESTAROSTOUBA_B:
                if (a == 0) {
                    content.getStory("rozhovor se starostou B,A,B_A");
                    buttons[0].setDisable(true);
                    buttons[1].setDisable(true);
                    buttons[2].setDisable(true);
                    buttons[3].setDisable(true);
                    buttons[4].setDisable(true);
                    //konec hry
                }


            if (a == 1) {
                content.getStory("rozhovor se starostou B,A,B_B");
                buttons[0].setDisable(true);
                buttons[1].setDisable(true);
                buttons[2].setDisable(true);
                buttons[3].setDisable(true);
                buttons[4].setDisable(true);
                //konec hry
                break;
            }
        }


    }
}


