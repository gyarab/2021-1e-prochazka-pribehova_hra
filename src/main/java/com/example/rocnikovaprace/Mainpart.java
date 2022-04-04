package com.example.rocnikovaprace;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


import java.io.IOException;
// tato třída je hlavní část celé hry, hlavně z grafického hlediska
public class Mainpart extends Application {
    public static Button buttons[];
    public static Label text;

    @Override
    public void start(Stage stage) throws IOException {

        UserInput userInput = new UserInput();

        text = new Label("cau");
        text.setFont(new Font("Arial", 20)); // změní font a velikost písma
        text.setWrapText(true); // zapne zarovnávání textu v labelu


        buttons = new Button[5];
        // vytvoří a přiřadí tlačítka k poli "buttons"
        buttons[0] = new Button("A");
        buttons[1] = new Button("B");
        buttons[2] = new Button("C");
        buttons[3] = new Button("D");
        buttons[4] = new Button("E");

        HBox box = new HBox();
        box.relocate(350, 700);
        box.setStyle("-fx-background-color: #FFFFFF;");

        // nastaví vzhled a pozici všem tlačítkům
        for (int i = 0; i < buttons.length; i++) {
            int number = i;
            box.getChildren().add(buttons[i]);
            buttons[i].setPrefSize(40, 40);

            /*
             * přiřadí všem tlačítkům funkci , že když jsou zmáčknuta,
             * tak zavolají metodu "processResponse" s jejich indexem v pořadí v poli "buttons"
             */
            buttons[i].setOnAction(event -> userInput.processResponse(number));
        }
        //nastaví velikost okna
        Pane freeSpace = new Pane(box, text);
        Scene scene = new Scene(freeSpace, 900, 900);
        stage.setTitle("Plague Lands");
        stage.setScene(scene);
        text.setMaxHeight(600);
        text.setMaxWidth(850);
        stage.setMaxHeight(900);
        stage.setMaxWidth(900);
        stage.setMinHeight(900);
        stage.setMinWidth(900);
        stage.show();


    }

    public static void main(String[] args) {
        launch();


    }

}


