package sample;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Created by naelitz on 6/29/15.
 */
public class Dice
{
    Stage window;
    StackPane d4Stack = new StackPane();
    StackPane d6Stack = new StackPane();

    Image d4Image = new Image("die.png");
    Image d10Image = new Image("die.png");
    Image d6Image = new Image("die.png");
    Image d8Image = new Image("die.png");
    Image percentiled10 = new Image("die.png");
    Image d12Image = new Image("die.png");
    Image d20Image = new Image("die.png");

    ImageView d4View = new ImageView(d4Image);
    ImageView d6View = new ImageView(d6Image);

    Label d4Text = new Label("d4");
    Label d6Text = new Label("d6");

    Dice(DungeonMaster master)
    {
        HBox box = new HBox();
        box.getChildren().add(d4Stack);
        d4Stack.getChildren().add(d4View);
        d4View.setFitWidth(125);
        d4View.setFitHeight(125);
        d4Stack.getChildren().add(d4Text);
        d4Text.setFont(Font.font(22));

        box.getChildren().add(d6Stack);
        d6Stack.getChildren().add(d6View);
        d6View.setFitHeight(125);
        d6View.setFitWidth(125);
        d6Stack.getChildren().add(d6Text);
        d6Text.setFont(Font.font(22));


        Scene scene = new Scene(box, 800, 125);
        scene.setFill(Color.LIGHTGRAY);
        box.setStyle("-fx-background-color: #808080");
        d4View.setStyle("-fx-fill: #808080");
        d4Stack.setStyle("-fx-background-color: #808080");
        window = new Stage();
        window.setScene(scene);


    }

    void displayDice()
    {
        window.show();
    }
}
