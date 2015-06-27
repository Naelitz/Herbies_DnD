package sample;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 * Created by david_000 on 6/25/2015.
 */
public class Tools extends HBox
{
    Button dice = new Button("Dice");
    StackPane diceStack = new StackPane();
    ImageView dicePng = new ImageView();
    Image diceP = new Image("dice.png");

    Button dungeonMaster = new Button("Dungeon Master");
    StackPane dungeonMasterStack = new StackPane();
    ImageView dungeonMasterPng = new ImageView();
    Image dMP = new Image("dungeonMaster.png");

    Button character = new Button("Characters");
    StackPane characterStack = new StackPane();
    ImageView characterPng = new ImageView();
    Image cP = new Image("characters.png");

    Button play = new Button("Play");
    StackPane playStack = new StackPane();
    ImageView playPng = new ImageView();
    Image pP = new Image("play.png");


    Main main;
    Tools(Main main)
    {
        this.main = main;
        this.getChildren().addAll(playStack, characterStack, diceStack, dungeonMasterStack);
        this.setHeight(100);
        dungeonMasterStack.getChildren().add(dungeonMasterPng);
        dungeonMasterPng.setImage(dMP);
        dungeonMasterStack.getChildren().add(dungeonMaster);
        dungeonMaster.setOpacity(0);

        diceStack.getChildren().add(dicePng);
        diceStack.getChildren().add(dice);
        dicePng.setImage(diceP);
        dice.setOpacity(0);

        characterStack.getChildren().add(characterPng);
        characterStack.getChildren().add(character);
        character.setOpacity(0);
        characterPng.setImage(cP);

        playStack.getChildren().add(playPng);
        playStack.getChildren().add(play);
        play.setOpacity(0);
        playPng.setImage(pP);


        //this.setSpacing(20);
        dice.prefWidthProperty().bind(main.scene.widthProperty().divide(4));
        dicePng.fitWidthProperty().bind(main.scene.widthProperty().divide(4));
        dicePng.setFitHeight(60);

        dungeonMaster.prefWidthProperty().bind(main.scene.widthProperty().divide(4));
        dungeonMasterPng.fitWidthProperty().bind(main.scene.widthProperty().divide(4));
        dungeonMasterPng.setFitHeight(60);


        character.prefWidthProperty().bind(main.scene.widthProperty().divide(4));
        characterPng.fitWidthProperty().bind(main.scene.widthProperty().divide(4));
        characterPng.setFitHeight(60);

        play.prefWidthProperty().bind(main.scene.widthProperty().divide(4));
        playPng.fitWidthProperty().bind(main.scene.widthProperty().divide(4));
        playPng.setFitHeight(60);

    }
}
