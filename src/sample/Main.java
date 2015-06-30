package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    Controller info = new Controller(this);
    BorderPane border = new BorderPane();
    StackPane stack = new StackPane();
    DungeonMaster master;
    CharacterCreator character;
    Dice dice;
    Scene scene = new Scene(stack, 800, 800);

    @Override
    public void start(Stage primaryStage) throws Exception{
       // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        master = new DungeonMaster(this);
        character = new CharacterCreator(this);
        ImageView imageview = new ImageView(new Image("vintage_tan2.jpg"));
        stack.getChildren().add(imageview);
        imageview.setFitHeight(800);
        imageview.setFitWidth(900);

        stack.getChildren().add(border);
        TitleScreen title = new TitleScreen(this);
        border.setCenter(title);
        Tools tools = new Tools(this);
        border.setTop(tools);
        tools.setAlignment(Pos.CENTER);
        primaryStage.setTitle("Herbie's D&D");

        primaryStage.setScene(scene);
        primaryStage.show();

        tools.dungeonMaster.setOnAction(e -> {
            displayDungeonMaster();
        });

        tools.play.setOnAction(e -> {
            displayPlay();
        });

        tools.dice.setOnAction(e -> {
            displayDice();
        });

        tools.character.setOnAction(e -> {
            displayCharacter();
        });
    }


    public static void main(String[] args) {
        launch(args);
    }

    Controller getInfo()
    {
        return info;
    }

    void displayDungeonMaster()
    {
        master.display();
    }

    void displayPlay()
    {
        Play.display(this);
    }

    void displayDice()
    {
        dice = new Dice(master);
        dice.displayDice();
    }

    void displayCharacter()
    {
        character.display();
    }
}
