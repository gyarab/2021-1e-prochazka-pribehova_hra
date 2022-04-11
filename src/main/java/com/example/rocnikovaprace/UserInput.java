package com.example.rocnikovaprace;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import static com.example.rocnikovaprace.GameStatus.*;
import static com.example.rocnikovaprace.Mainpart.*;

public class UserInput {


    Texts content = new Texts();

    GameStatus gameStatus = MENU;

    public static String currentAnswer;
    String previousAnswer;
    boolean isShowingPrevAns = false;
    int buttonsDisabled;
    int buttonSelected;


    static Stage newStage = new Stage();
    Image pictureMapa = new Image("mapa.jpg");
    ImageView showMap = new ImageView(pictureMapa);
    Pane pane = new Pane();
    Scene scena = new Scene(pane,750,750);

    public UserInput(){
        pane.getChildren().add(showMap);
        newStage.setScene(scena);
        newStage.setMaxHeight(750);
        newStage.setMaxWidth(750);
        newStage.setMinHeight(750);
        newStage.setMinWidth(750);
    }
    void showPreviousAnswer(){

        if (isShowingPrevAns ){
            content.writeStory(currentAnswer);
            previousButton.setText("minulý text");
            isShowingPrevAns = false;
            buttons[0].setStyle("-fx-border-color: #F7DA09; -fx-faint-focus-color: #F7DA09; -fx-focus-color: transparent");
            buttons[1].setStyle("-fx-border-color: #7C09F7; -fx-faint-focus-color: #7C09F7; -fx-focus-color: transparent");
            buttons[2].setStyle("-fx-border-color: #F709BA; -fx-faint-focus-color: #F709BA; -fx-focus-color: transparent");
            for(int x = 0; x <buttons.length - buttonsDisabled; x++ ){
                buttons[x].setDisable(false);

            }
        }else {
            content.writeStory(previousAnswer);
            previousButton.setText("současný text");
            switch (buttonSelected){
                case 0:
                    buttons[buttonSelected].setStyle("-fx-background-color: #F7DA09;-fx-border-color: #000000; ");
                    break;
                case 1:
                    buttons[buttonSelected].setStyle("-fx-background-color: #7C09F7;-fx-border-color: #000000; ");
                    break;
                case 2:
                    buttons[buttonSelected].setStyle("-fx-background-color: #F709BA;-fx-border-color: #000000; ");
                    break;

            }

            for(int x = 0; x < buttons.length; x++){
                buttons[x].setDisable(true);
            }
            isShowingPrevAns = true;
        }


    }

    void showMap(double x, double y) {


        newStage.setX(x+1000);
        newStage.setY(y);
        if (newStage.isShowing()) {
            newStage.close();
            mapButton.setText("otevřít mapu");
        } else {

            newStage.show();
            mapButton.setText("zavřít mapu");
        }


    }

    void processResponse(int a) {
        buttonSelected = a;
        previousAnswer = currentAnswer;

        switch (gameStatus) {
            case MENU:
                if (a == 0) {
                    content.getStory("Uvod");
                    buttonsDisabled = 0;
                    gameStatus = UVOD;

                }
                break;
            case UVOD:
                if (a == 0) {
                    content.getStory("RozhovorSeStarostou");
                    buttonsDisabled = 0;
                    gameStatus = SPAT;
                }
                if (a == 1) {
                    content.getStory("okno");
                    buttonsDisabled = 1;
                    gameStatus = OKNO;
                }
                if (a == 2) {
                    content.getStory("dvere");
                    buttonsDisabled = 1;
                    gameStatus = DVERE;
                }
                break;

            case SPAT:
                if (a == 0) {
                    content.getStory("rozhovor se Starostou A");
                    buttonsDisabled = 1;
                    gameStatus = ROZHOVORSESTAROSTOUA;
                }
                if (a == 1) {
                    content.getStory("rozhovor se Starostou B");
                    buttonsDisabled = 1;
                    gameStatus = ROZHOVORSESTAROSTOUB;
                }
                if (a == 2) {
                    content.getStory("rozhovor se starostou C");
                    buttonsDisabled = 0;
                    gameStatus = KAPITOLA2;
                }
                break;
            case OKNO:
                if (a == 0) {
                    content.getStory("okno A");
                    buttonsDisabled = 0;
                    gameStatus = SPAT;
                }
                if (a == 1) {
                    content.getStory("okno B");
                    buttonsDisabled = 0;
                    gameStatus = SPAT;
                }
                break;
            case DVERE:
                if (a == 0) {
                    content.getStory("dvere A");
                    buttonsDisabled = 0;
                    gameStatus = SPAT;
                }
                if (a == 1) {
                    content.getStory("dvere B");
                    buttonsDisabled = 0;
                    gameStatus = SPAT;
                }
                break;
            case ROZHOVORSESTAROSTOUB:
                if (a == 0) {
                    content.getStory("rozhovor se starostou B_A");
                    buttonsDisabled = 1;
                    gameStatus = ROZHOVORSESTAROSTOUB_A;
                }
                if (a == 1) {
                    content.getStory("rozhovor se starostou B_B");
                    buttonsDisabled = 1;
                    gameStatus = ROZHOVORSESTAROSTOUB_B;
                }
                break;
            case ROZHOVORSESTAROSTOUA:
                if (a == 0) {
                    content.getStory("rozhovor se starostou A_A");
                    buttonsDisabled = 1;
                    gameStatus = KAPITOLA2;

                }
                if (a == 1) {
                    content.getStory("rozhovor se starostou A_B");
                    buttonsDisabled = 1;
                    gameStatus = KAPITOLA2;

                }
                break;

            case ROZHOVORSESTAROSTOUB_A:
                if (a == 0) {
                    content.getStory("rozhovor se starostou B,A_A");
                    buttonsDisabled = 1;
                    gameStatus = ROZHOVORSESTAROSTOUBA_A;
                }

                if (a == 1) {
                    content.getStory("rozhovor se starostou B,A_B");
                    buttonsDisabled = 1;
                    gameStatus = ROZHOVORSESTAROSTOUBA_B;
                }
                break;
            case ROZHOVORSESTAROSTOUBA_B:
                if (a == 0) {
                    content.getStory("rozhovor se starostou B,A,B_A");
                    currentAnswer = "rozhovor se starostou B,A,B_A";
                    buttonsDisabled = 3;
                    //konec hry
                }


                if (a == 1) {
                    content.getStory("rozhovor se starostou B,A,B_B");
                    buttonsDisabled = 3;
                    //konec hry
                    break;
                }
            case KAPITOLA2:
                if (a == 0) {
                }
                if (a == 1) {
                }
                if (a == 2) {
                }
                break;


        }
        for (int i = 0; i < buttons.length; i++){
            buttons[i].setDisable(true);
        }
        for (int i = 0; i < buttons.length-buttonsDisabled; i++) {
            buttons[i].setDisable(false);

        }

    }
}


