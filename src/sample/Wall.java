package sample;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Created by naelitz on 6/29/15.
 */
public class Wall extends Sprite
{
    Button btn = new Button("Wall");
    Image pic = new Image("blackbox.jpg");
    ImageView view = new ImageView(pic);
    ImageView mapView = new ImageView(pic);

    Wall()
    {
        view.setFitHeight(75);
        view.setFitWidth(75);
        mapView.setFitHeight(25);
        mapView.setFitWidth(25);
        mapView.setOpacity(0);

    }

    @Override
    ImageView getImage() {
        return view;
    }

    @Override
    ImageView getMapImage() {
        return null;
    }

    @Override
    void newSprite() {

    }

    @Override
    String color() {
        return "-fx-base: #000000";
    }
}
