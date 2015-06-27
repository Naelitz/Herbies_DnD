package sample;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

/**
 * Created by david_000 on 6/25/2015.
 */
public class Sprites extends Pane
{
    Sprites(String string)
    {
        if(string == "dragon")
        {
            GridPane grid = new GridPane();
            this.getChildren().add(grid);
            ImageView spriteView = new ImageView();
            spriteView.setFitHeight(75);
            spriteView.setFitWidth(75);
            Image sprite = new Image("dragons.jpg");
            spriteView.setImage(sprite);
            Button spriteText = new Button("dragon");
            spriteText.setPrefWidth(125);
            spriteText.setPrefHeight(75);
            grid.add(spriteView, 0, 0);
            grid.add(spriteText, 1, 0);

        }

        if(string.equals("skeleton"))
        {
            GridPane grid = new GridPane();
            this.getChildren().add(grid);
            ImageView spriteView = new ImageView();
            spriteView.setFitHeight(75);
            spriteView.setFitWidth(75);
            Image sprite = new Image("skeletonbonecrusher.jpg");
            spriteView.setImage(sprite);
            Button spriteText = new Button("skeleton");
            spriteText.setPrefWidth(125);
            spriteText.setPrefHeight(75);
            grid.add(spriteView, 1, 0);
            grid.add(spriteText, 1, 1);

        }


    }
}
