package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
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
    Stage stage = new Stage();
    CharacterCreator(Main main) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //BorderPane border = new BorderPane();
        //border.setStyle("-fx-background-color: #B89470");
        stage.setTitle("character creator");
        Scene scene = new Scene(root);
        stage.setScene(scene);

    }

    void display()
    {
        stage.show();
    }
}
