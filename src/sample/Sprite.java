package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Created by david_000 on 6/29/2015.
 */
public abstract class Sprite
{


    abstract ImageView getImage();

    abstract ImageView getMapImage();

    abstract void newSprite();

    abstract String color();
}
