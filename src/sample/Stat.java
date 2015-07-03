package sample;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 * Created by naelitz on 7/2/15.
 */
public class Stat extends GridPane
{
    public Label label = new Label("");
    public TextField text = new TextField("Enter Value Here");
    Stat()
    {
        this.add(label, 0, 0);
        this.add(text, 1, 0);
        this.label.setPrefHeight(100);
        this.label.setPrefWidth(175);
        this.text.setPrefWidth(200);
        this.text.setPrefHeight(100);
        this.label.setFont(Font.font("Ariel", FontWeight.BOLD, 20));
        this.setStyle("-fx-background-color: #000000");
        this.label.setTextFill(Color.WHITE);
    }

    void setText(String input)
    {
       this.label.setText(input);
    }
}
