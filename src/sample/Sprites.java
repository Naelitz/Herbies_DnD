package sample;

import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import sample.Characters.Dragon;
import sample.Characters.Skeleton;
import sample.DungeonObjects.Wall;

/**
 * Created by david_000 on 6/25/2015.
 */
public class Sprites extends ScrollPane
{
    CheckBox dragonBox;
    DungeonMaster master;
    Dragon dragon;
    Skeleton skeleton;
    Wall wall;
    VBox box = new VBox();
    Sprites(DungeonMaster master)
    {

        this.master = master;
        this.wall = new Wall(master);
        this.dragon = new Dragon(master);
        this.skeleton = new Skeleton(master);
        //GridPane grid = new GridPane();
        //this.getChildren().add(grid);
        this.setContent(box);
        box.getChildren().add(new SpriteGrid(this.wall.getImage(), this.wall.btn));
        box.getChildren().add(new SpriteGrid(this.dragon.view, this.dragon.name));
       // grid.add(this.dragon.view, 0, 0);
        //grid.add(this.dragon.name, 1, 0);


            //Skeleton
            ImageView skeletonView = new ImageView();
            skeletonView.setFitHeight(75);
            skeletonView.setFitWidth(75);
            Image skeleton = new Image("skeletonbonecrusher.jpg");
            skeletonView.setImage(skeleton);
            Button skeletonText = new Button("skeleton");


            skeletonText.setPrefWidth(125);
            skeletonText.setPrefHeight(75);
            box.getChildren().add(new SpriteGrid(this.skeleton.view, this.skeleton.name));
         //   grid.add(skeletonView, 0, 1);
         //   grid.add(skeletonText, 1, 1);



            skeletonText.setOnAction(e -> {
                master.setSprite(new Skeleton(master));
            });

    }
}
