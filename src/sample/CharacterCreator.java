package sample;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.*;
import javafx.stage.Stage;

import javax.swing.border.Border;
import java.awt.*;
import java.awt.Color;

/**
 * Created by naelitz on 6/30/15.
 */
public class CharacterCreator
{
    Stage stage;
    CharacterCreator(Main main)
    {
        BorderPane border = new BorderPane();
        border.setStyle("-fx-background-color: #B89470");
        Scene scene = new Scene(border, 800, 800);
        stage = new Stage();
        stage.setScene(scene);

    }

    void display()
    {
        stage.show();
    }
}
