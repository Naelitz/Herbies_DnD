package sample.DungeonObjects;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import sample.Characters.Sprite;
import sample.DungeonMaster;

/**
 * Created by naelitz on 6/29/15.
 */
public class Wall extends Sprite
{
    public Button btn = new Button("Wall");
    public Image pic = new Image("blackbox.jpg");
    public Image mapPic = new Image("blackbox.jpg");
    public ImageView view = new ImageView(pic);
    public ImageView mapView = new ImageView(mapPic);
    DungeonMaster master;

    public Wall(DungeonMaster master)
    {
        this.master = master;
        view.setFitHeight(75);
        view.setFitWidth(75);
        mapView.setFitHeight(25);
        mapView.setFitWidth(25);
        mapView.setOpacity(0);

        this.btn.setOnAction(e -> {
            master.setSprite(new Wall(master));
        });

    }

    @Override
    public ImageView getImage() {
        return view;
    }

    @Override
    public ImageView getMapImage() {
        return mapView;
    }

    @Override
    public void newSprite() {
        master.setSprite(new Wall(master));
    }

    @Override
    public String color() {
        return "-fx-base: #000000";
    }
}
