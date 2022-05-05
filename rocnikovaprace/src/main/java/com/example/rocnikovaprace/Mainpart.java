package com.example.rocnikovaprace;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;


import java.io.IOException;
// tato třída je hlavní část celé hry, hlavně z grafického hlediska

    public class Mainpart extends Application {
    static ImageView showGameOver;
    static ImageView showMenu;
    static ImageView showGameBackground;
    static ImageView showGameEnd;
    static HBox box;
    static Button endButton;
    static Button startButton;
    public static Label text;
    public static Button buttons[];
    public static Button mapButton;
    public static Button previousButton;

    @Override
    public void start(Stage stage) throws IOException {
        UserInput userInput = new UserInput();


        text = new Label();
        UserInput.content.getStory("Uvod");
        text.setFont(new Font("Arial", 18)); // změní font a velikost písma
        text.setWrapText(true); // zapne zarovnávání textu v labelu

        startButton = new Button("start");
        startButton.setPrefSize(200, 100);
        startButton.relocate(400, 450);
        startButton.setFont(new Font("Arial", 25));
        startButton.setOnAction(event ->gameVisible(2));

        endButton = new Button("exit");
        endButton.setPrefSize(200, 100);
        endButton.relocate(400, 450);
        endButton.setFont(new Font("Arial", 25));
        endButton.setOnAction(event -> {System.exit(0);});

        // vytvoří pole tlačítek a přiřadí k němu jednotlivá tlačítka
        buttons = new Button[3];
        buttons[0] = new Button("A");
        buttons[1] = new Button("B");
        buttons[2] = new Button("C");

        mapButton = new Button("otevřít mapu");
        mapButton.setPrefSize(100, 50);
        mapButton.relocate(800, 800);
        mapButton.setStyle("-fx-border-color: #F16915; -fx-faint-focus-color: #F16915; -fx-focus-color: transparent");
        mapButton.setOnAction(event -> userInput.showMap(stage.getX(), stage.getY()));

        previousButton = new Button("předchozí text");
        previousButton.setPrefSize(100, 50);
        previousButton.relocate(100, 800);
        previousButton.setStyle("-fx-border-color: #8AD910; -fx-faint-focus-color: #8AD910; -fx-focus-color: transparent");
        previousButton.setOnAction(event -> userInput.showPreviousAnswer());

        box = new HBox();
        box.relocate(350, 800);
        box.setStyle("-fx-background-color: #FFFFFF;");

        // nastaví vzhled a pozici všem tlačítkům
        for (int i = 0; i < buttons.length; i++) {
            int number = i;
            box.getChildren().add(buttons[i]);
            buttons[i].setPrefSize(100, 50);
            buttons[i].setStyle(("-fx-border-color: #F7DA09; -fx-faint-focus-color: #F7DA09; -fx-focus-color: transparent"));
            /*
             * přiřadí všem tlačítkům funkci , že když jsou zmáčknuta,
             * tak zavolají metodu "processResponse" s jejich indexem v pořadí v poli "buttons"
             */
            buttons[i].setOnAction(event -> userInput.processResponse(number));
        }

        Image pictureMenu = new Image("menu.png");
        showMenu = new ImageView(pictureMenu);
        Image pictureGameBackground = new Image("gamebackground.png");
        showGameBackground = new ImageView(pictureGameBackground);
        Image pictureGameOver = new Image("gameover.png");
        showGameOver = new ImageView(pictureGameOver);
        Image pictureGameEnd = new Image("gameend.png");
        showGameEnd = new ImageView(pictureGameEnd);

        stage.setOnCloseRequest(event -> {System.exit(0);});
        gameVisible(1);
        Pane freeSpace = new Pane(showMenu,showGameBackground,showGameOver,showGameEnd, text, mapButton, previousButton,startButton,endButton,box);
        Scene scene = new Scene(freeSpace, 1000, 1000);
        stage.setTitle("Plague Lands");
        stage.setScene(scene);
        text.setMaxHeight(800);
        text.setMaxWidth(950);
        stage.setResizable(false);
        stage.show();


    }

    public static void gameVisible( int state) {
        switch (state){
            case 1:
                box.setVisible(false);
                text.setVisible(false);
                mapButton.setVisible(false);
                previousButton.setVisible(false);
                endButton.setVisible(false);
                showGameBackground.setVisible(false);
                showGameOver.setVisible(false);
                showGameEnd.setVisible(false);

                previousButton.setDisable(true);
                break;
            case 2:
                showMenu.setVisible(false);
                startButton.setVisible(false);

                box.setVisible(true);
                text.setVisible(true);
                mapButton.setVisible(true);
                previousButton.setVisible(true);
                showGameBackground.setVisible(true);
                break;
            case 3:
                box.setVisible(false);
                text.setVisible(false);
                mapButton.setVisible(false);
                previousButton.setVisible(false);
                showGameBackground.setVisible(false);

                endButton.setVisible(true);
                showGameOver.setVisible(true);
                break;
            case 4:
                box.setVisible(false);
                text.setVisible(false);
                mapButton.setVisible(false);
                previousButton.setVisible(false);
                showGameBackground.setVisible(false);

                endButton.setVisible(true);
                showGameEnd.setVisible(true);
        }
    }

    public static void main(String[] args) {
        launch();


    }

}


