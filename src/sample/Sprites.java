package sample;

import javafx.scene.control.*;
import javafx.scene.control.cell.CheckBoxListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

/**
 * Created by david_000 on 6/25/2015.
 */
public class Sprites extends ScrollPane
{
    CheckBox dragonBox;
    DungeonMaster master;
    Sprites(DungeonMaster master)
    {
        this.master = master;
            GridPane grid = new GridPane();
            this.getChildren().add(grid);
            this.setContent(grid);

            //Dragon
            ImageView dragonView = new ImageView();
            dragonView.setFitHeight(75);
            dragonView.setFitWidth(75);
            Image dragon = new Image("dragons.jpg");
            dragonView.setImage(dragon);
            Label dragonText = new Label("dragon");
            this.dragonBox = new CheckBox();

            dragonBox.setPrefWidth(10);
            dragonText.setPrefWidth(100);
            dragonText.setPrefHeight(75);
            grid.add(dragonView, 0, 0);
            grid.add(dragonText, 1, 0);
            grid.add(dragonBox, 2, 0);

            //Skeleton
            ImageView skeletonView = new ImageView();
            skeletonView.setFitHeight(75);
            skeletonView.setFitWidth(75);
            Image skeleton = new Image("skeletonbonecrusher.jpg");
            skeletonView.setImage(skeleton);
            Button skeletonText = new Button("skeleton");


            skeletonText.setPrefWidth(125);
            skeletonText.setPrefHeight(75);
            grid.add(skeletonView, 0, 1);
            grid.add(skeletonText, 1, 1);


            skeletonText.setOnAction(e -> {
                master.setSprite(new Skeleton());
            });

    }

    void checkBoxStatus()
    {
        if (dragonBox.isSelected())
        {
            master.setSprite(new Dragon());
        }
    }
}
