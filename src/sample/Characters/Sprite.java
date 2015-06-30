package sample.Characters;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Created by david_000 on 6/29/2015.
 */
public abstract class Sprite
{
    public Button name;


    abstract public ImageView getImage();

    abstract public ImageView getMapImage();

    abstract public void newSprite();

    abstract public String color();
}
