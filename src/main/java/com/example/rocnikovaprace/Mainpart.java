package com.example.rocnikovaprace;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


import java.io.IOException;

import static com.example.rocnikovaprace.UserInput.newStage;

// tato třída je hlavní část celé hry, hlavně z grafického hlediska
public class Mainpart extends Application {
    public static Button buttons[];
    public static Label text;
    public  static Button mapButton;
    public static Button previousButton;
    @Override
    public void start(Stage stage) throws IOException {
        UserInput userInput = new UserInput();

        text = new Label("cau");
        text.setFont(new Font("Arial", 18)); // změní font a velikost písma
        text.setWrapText(true); // zapne zarovnávání textu v labelu


        buttons = new Button[3];
        // vytvoří a přiřadí tlačítka k poli "buttons"
        buttons[0] = new Button("A");
        buttons[1] = new Button("B");
        buttons[2] = new Button("C");
        buttons[0].setStyle("-fx-border-color: #F7DA09; -fx-faint-focus-color: #F7DA09; -fx-focus-color: transparent");
        buttons[1].setStyle("-fx-border-color: #7C09F7; -fx-faint-focus-color: #7C09F7; -fx-focus-color: transparent");
        buttons[2].setStyle("-fx-border-color: #F709BA; -fx-faint-focus-color: #F709BA; -fx-focus-color: transparent");

        mapButton = new Button("otevřít mapu");
        mapButton.setPrefSize(100, 50);
        mapButton.relocate(800,800);
        mapButton.setStyle("-fx-border-color: #F16915; -fx-faint-focus-color: #F16915; -fx-focus-color: transparent");
        mapButton.setOnAction(event -> userInput.showMap(stage.getX(), stage.getY()));

        previousButton = new Button("předchozí text");
        previousButton.setPrefSize(100, 50);
        previousButton.relocate(100,800);
        previousButton.setStyle("-fx-border-color: #8AD910; -fx-faint-focus-color: #8AD910; -fx-focus-color: transparent");
        previousButton.setOnAction(event -> userInput.showPreviousAnswer());

        HBox box = new HBox();
        box.relocate(350, 800);
        box.setStyle("-fx-background-color: #FFFFFF;");

        // nastaví vzhled a pozici všem tlačítkům
        for (int i = 0; i < buttons.length; i++) {
            int number = i;
            box.getChildren().add(buttons[i]);
            buttons[i].setPrefSize(100, 50);

            /*
             * přiřadí všem tlačítkům funkci , že když jsou zmáčknuta,
             * tak zavolají metodu "processResponse" s jejich indexem v pořadí v poli "buttons"
             */
            buttons[i].setOnAction(event -> userInput.processResponse(number));
        }
        stage.setOnCloseRequest(event -> newStage.close());

        //vytvoří okno a nastaví jeho velikost okna
        Pane freeSpace = new Pane(box, text,mapButton,previousButton);
        Scene scene = new Scene(freeSpace, 1000, 1000);
        stage.setTitle("Plague Lands");
        stage.setScene(scene);
        text.setMaxHeight(800);
        text.setMaxWidth(950);
        stage.setMaxHeight(1000);
        stage.setMaxWidth(1000);
        stage.setMinHeight(1000);
        stage.setMinWidth(1000);
        stage.show();


    }

    public static void main(String[] args) {
        launch();


    }

}


