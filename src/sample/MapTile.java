package sample;



import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

/**
 * Created by david_000 on 6/25/2015.
 */
public class MapTile extends Button
{
    DungeonMaster master;
    Image icon;
    ImageView iconBack = new ImageView();
    Pane sub = new Pane();
    MapTile(DungeonMaster master)
    {
        this.iconBack.setFitHeight(25);
        this.iconBack.setFitWidth(25);
        this.sub.setPrefWidth(25);
        this.sub.setPrefHeight(25);
        this.setGraphic(sub);

        this.master = master;
        this.minHeight(25);
        this.minWidth(25);
        this.setWidth(25);
        this.setWidth(25);

        this.setOnAction(e -> {
            master.list.checkBoxStatus();
            this.setGraphic(master.getSprite().getImage());
        });
    }
}
