package sample;

import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import sample.sprites.Skeleton;

/**
 * Created by david_000 on 6/25/2015.
 */
public class Sprites extends ScrollPane
{
    Sprites()
    {

            GridPane grid = new GridPane();
            this.getChildren().add(grid);
            this.setContent(grid);
            //Dragon
            ImageView dragonView = new ImageView();
            dragonView.setFitHeight(75);
            dragonView.setFitWidth(75);
            Image dragon = new Image("dragons.jpg");
            dragonView.setImage(dragon);
            Button dragonText = new Button("dragon");
            dragonText.setPrefWidth(125);
            dragonText.setPrefHeight(75);
            grid.add(dragonView, 0, 0);
            grid.add(dragonText, 1, 0);

            //Skeleton
            ImageView skeletonView = new ImageView();
            skeletonView.setFitHeight(75);
            skeletonView.setFitWidth(75);
            Image skeleton = new Image(sprites/Skeleton.getImage());
            skeletonView.setImage(skeleton);
            Button skeletonText = new Button("skeleton");
            skeletonText.setPrefWidth(125);
            skeletonText.setPrefHeight(75);
            grid.add(skeletonView, 0, 1);
            grid.add(skeletonText, 1, 1);




    }
}
