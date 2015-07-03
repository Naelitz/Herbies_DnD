package sample;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
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

import java.awt.*;
import java.awt.Color;
import java.io.File;
import java.io.IOException;

/**
 * Created by Kayla on 6/30/15.
 */
public class CharacterCreator
{
    public GridPane character = new GridPane();
    public GridPane stats = new GridPane();
    public Stage stage = new Stage();
    public Image toon = new Image("wizard.jpg");
    public ImageView view = new ImageView(toon);
    public Button viewButton = new Button();
    public TextField name = new TextField("Name here");
    public ComboBox userClass;
    public ComboBox raceBox;
    public Stat health;
    public Stat armor;
    public Stat luck;
    public Stat attack;

    CharacterCreator(Main main) throws Exception
    {
        view.setFitHeight(250);
        view.setFitWidth(200);
        viewButton.setPrefWidth(200);
        viewButton.setPrefHeight(250);
        viewButton.setGraphic(view);
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //BorderPane border = new BorderPane();
        //border.setStyle("-fx-background-color: #B89470");
        GridPane pane = new GridPane();
        pane.add(character, 0, 0, 2, 1);
        character.add(viewButton, 0, 0);
        //character.prefWidthProperty().bind(pane.widthProperty().multiply(2 / 3));
        //character.prefHeightProperty().bind(pane.heightProperty().multiply(1 / 3));


        // The bio pane will contain the name, class, and race section.
        GridPane bio = new GridPane();
        bio.setPadding(new Insets(5));
        character.add(bio, 1, 0);

        Label nameLbl = new Label("Name: ");
        name = new TextField("Name here");
        name.minWidth(200);
        bio.add(nameLbl, 0, 0);
        bio.add(name, 1, 0);


        Label classLbl = new Label("Class: ");
        userClass = new ComboBox<String>();
        userClass.getItems().addAll("Wizard", "Female");
        bio.add(classLbl, 0, 1);
        bio.add(userClass, 1, 1);

        Label raceLbl = new Label("Race: ");
        raceBox = new ComboBox<String>();
        raceBox.getItems().addAll("Human", "Elf", "Dwarf", "Orc", "Gnome");
        bio.add(raceLbl, 0, 2);
        bio.add(raceBox, 1, 2);

        Button create = new Button("Create");
        bio.add(create, 0, 3);

        pane.add(stats, 0, 1, 2, 2);
        stats.prefHeightProperty().bind(pane.heightProperty().multiply(2 / 3));
        stats.prefWidthProperty().bind(pane.widthProperty().multiply(2 / 3));

        //Label nameLbl = new Label("Name:");
        //TextField name = new TextField("enter name here");
        //Stat name = new Stat();
        //name.setText("Name: ");

        health = new Stat();
        health.setText("Health: ");

        attack = new Stat();
        attack.setText("Attack: ");

        armor = new Stat();
        armor.setText("Armor: ");

        luck = new Stat();
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

        // Button to assign values to the stats of the character created and will save the character to a file
        // that is titled with its name and class.
        create.setOnAction(e -> {
            Player person = new Player(this);
            person.setHealth(Integer.parseInt(health.text.getText()));
            System.out.println(person.health);


        });

        viewButton.setOnAction(e -> {
            try {
                pictureChooser();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });

    }

    void display()
    {
        stage.show();
    }


    void pictureChooser() throws IOException
    {
        try{
        Desktop.getDesktop().open(new File("C:\\")); }
        catch(IllegalArgumentException iae)
        {
            try{
                Desktop.getDesktop().open(new File("/home/"));
            }
            catch(IllegalArgumentException iae2)
            {
                System.out.print("Hell NO!");
            }
        }
    }
}
