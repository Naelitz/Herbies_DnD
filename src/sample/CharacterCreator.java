package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;
import javafx.stage.Stage;
import sample.Players.Player;

import javax.swing.border.Border;

import java.awt.Color;

/**
 * Created by Kayla on 6/30/15.
 */
public class CharacterCreator
{
    GridPane character = new GridPane();
    GridPane stats = new GridPane();
    Stage stage = new Stage();
    Image toon = new Image("wizard.jpg");
    ImageView view = new ImageView(toon);

    CharacterCreator(Main main) throws Exception
    {
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //BorderPane border = new BorderPane();
        //border.setStyle("-fx-background-color: #B89470");
        GridPane pane = new GridPane();
        pane.add(character, 0, 0, 2, 1);
        character.add(view, 0, 0);
        //character.prefWidthProperty().bind(pane.widthProperty().multiply(2 / 3));
        //character.prefHeightProperty().bind(pane.heightProperty().multiply(1 / 3));

        GridPane bio = new GridPane();
        character.add(bio, 1, 0);

        TextField name = new TextField("Name here");
        name.minWidth(200);
        bio.add(name, 0, 0);

        Button create = new Button("Create");
        bio.add(create, 0, 1);

        pane.add(stats, 0, 1, 2, 2);
        stats.prefHeightProperty().bind(pane.heightProperty().multiply(2 / 3));
        stats.prefWidthProperty().bind(pane.widthProperty().multiply(2 / 3));

        //Label nameLbl = new Label("Name:");
        //TextField name = new TextField("enter name here");
        //Stat name = new Stat();
        //name.setText("Name: ");

        Stat health = new Stat();
        health.setText("Health: ");

        Stat attack = new Stat();
        attack.setText("Attack: ");

        Stat armor = new Stat();
        armor.setText("Armor: ");

        Stat luck = new Stat();
        luck.setText("Luck: ");

        stats.add(health, 0, 0);

        stats.add(attack, 0, 1);

        stats.add(armor, 0, 2);

        stats.add(luck, 0, 3);



        stats.setStyle("-fx-background-color: #000000");

        //nameLbl.setStyle("-fx-background-color: #000000");
        //nameLbl.setTextFill(javafx.scene.paint.Color.WHITE);
        name.setStyle("-fx-text-box-border: black");
        name.setStyle("-fx-focus-color: black");


        stage.setTitle("character creator");
        Scene scene = new Scene(pane);
        stage.setScene(scene);

        create.setOnAction(e -> {
            //Player person = new Player();
            //person.setHealth(3);
        });

    }

    void display()
    {
        stage.show();
    }
}
