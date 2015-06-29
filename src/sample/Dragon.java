package sample;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


/**
 * Created by david_000 on 6/29/2015.
 */
public class Dragon extends Sprite
{
    Image image = new Image("dragons.jpg");
    ImageView view = new ImageView();
    Button name = new Button("Dragon");
    int health = 0;
    int hitPoints = 0;
    int numberOfDice = 1;
    int sidesOfDie = 12;
    int AC = 0;
    int speed = 0;

    Dragon()
    {
        this.view.setImage(image);
    }

    ImageView getImage()
    {
        return this.view;
    }
}
