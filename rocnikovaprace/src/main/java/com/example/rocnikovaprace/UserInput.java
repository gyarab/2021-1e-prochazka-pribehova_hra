package com.example.rocnikovaprace;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import static com.example.rocnikovaprace.GameStatus.*;
import static com.example.rocnikovaprace.Mainpart.*;

public class UserInput {

    public static Texts content = new Texts();

    GameStatus gameStatus = UVOD;

    public static String currentAnswer;
    public static String previousAnswer;
    boolean isShowingPrevAns = false;
    int buttonsDisabled;
    int buttonSelected;


    static Stage newStage = new Stage();
    Image pictureMapa = new Image("mapa.jpg");
    ImageView showMap = new ImageView(pictureMapa);
    Pane pane = new Pane();
    Scene scena = new Scene(pane, 750, 750);

    public UserInput() {

        pane.getChildren().add(showMap);
        newStage.setScene(scena);
        newStage.setResizable(false);
    }

    void showPreviousAnswer() {

        if (isShowingPrevAns) {
            content.writeStory(currentAnswer);
            previousButton.setText("minulý text");
            for (int i = 0; i < buttons.length; i++) {
                buttons[i].setStyle(("-fx-border-color: #F7DA09; -fx-faint-focus-color: #F7DA09; -fx-focus-color: transparent"));
            }
            for (int x = 0; x < buttons.length - buttonsDisabled; x++) {
                buttons[x].setDisable(false);
            }
            isShowingPrevAns = false;
        } else {
            content.writeStory(previousAnswer);
            previousButton.setText("současný text");
            buttons[buttonSelected].setStyle("-fx-background-color: #F7DA09;-fx-border-color: #000000; ");
            for (int x = 0; x < buttons.length; x++) {
                buttons[x].setDisable(true);
            }
            isShowingPrevAns = true;
        }
    }

    void showMap(double x, double y) {

        newStage.setX(x + 1000);
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

        switch (gameStatus) {

            case UVOD:
                if (a == 0) {
                    content.getStory("RozhovorSeStarostou");
                    previousButton.setDisable(false);
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
            case OKNO:
                if (a == 0) {
                    content.getStory("okno A");
                    previousButton.setDisable(false);
                    buttonsDisabled = 0;
                    gameStatus = SPAT;
                }
                if (a == 1) {
                    content.getStory("okno B");
                    previousButton.setDisable(false);
                    buttonsDisabled = 0;
                    gameStatus = SPAT;
                }
                break;
            case DVERE:
                if (a == 0) {
                    content.getStory("dvere A");
                    previousButton.setDisable(false);
                    buttonsDisabled = 0;
                    gameStatus = SPAT;
                }
                if (a == 1) {
                    content.getStory("dvere B");
                    previousButton.setDisable(false);
                    buttonsDisabled = 0;
                    gameStatus = SPAT;
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
            case ROZHOVORSESTAROSTOUA:
                if (a == 0) {
                    content.getStory("rozhovor se starostou A_A");
                    buttonsDisabled = 0;
                    gameStatus = KAPITOLA2;

                }
                if (a == 1) {
                    content.getStory("rozhovor se starostou A_B");
                    buttonsDisabled = 0;
                    gameStatus = KAPITOLA2;

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
                    buttonsDisabled = 0;
                    gameStatus = KAPITOLA2;
                }
                break;
            case ROZHOVORSESTAROSTOUB_A:
                if (a == 0) {
                    content.getStory("rozhovor se starostou B,A_A");
                    buttonsDisabled = 0;
                    gameStatus = KAPITOLA2;
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
                    buttonsDisabled = 0;
                    gameStatus = GAMEOVER;
                    //konec hry
                }


                if (a == 1) {
                    content.getStory("rozhovor se starostou B,A,B_B");
                    buttonsDisabled = 0;
                    gameStatus = GAMEOVER;
                    //konec hry
                }
                break;
            case KAPITOLA2:
                Mainpart.gameVisible(4);
                break;
            case GAMEOVER:
                Mainpart.gameVisible(3);
                break;
        }
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setDisable(true);
        }
        for (int i = 0; i < buttons.length - buttonsDisabled; i++) {
            buttons[i].setDisable(false);

        }

    }
}


