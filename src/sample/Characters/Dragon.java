package sample.Characters;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import sample.DungeonMaster;


/**
 * Created by david_000 on 6/29/2015.
 */
public class Dragon extends Sprite
{
    Image image = new Image("dragons.jpg");
    public ImageView view = new ImageView();
    public ImageView mapView = new ImageView(image);
    public Button name = new Button("Dragon");
    DungeonMaster master;
    int health = 0;
    int hitPoints = 0;
    int numberOfDice = 1;
    int sidesOfDie = 12;
    int AC = 0;
    int speed = 0;

    public Dragon(DungeonMaster master)
    {
        this.master = master;
        this.view.setImage(image);
        this.view.setFitHeight(75);
        this.view.setFitWidth(75);
        this.name.setMaxWidth(125);
        this.name.setMaxHeight(75);
        this.mapView.setFitWidth(25);
        this.mapView.setFitHeight(25);

        this.name.setOnAction(e -> {
            master.setSprite(new Dragon(master));
        });
    }

    public ImageView getImage()
    {
        return this.view;
    }

    public ImageView getMapImage()
    {
        return this.mapView;
    }

    public void newSprite()
    {
        master.setSprite(new Dragon(master));
    }

    @Override
    public String color() {
        return "-fx-base: #7A0000";
    }
}
