package sample;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

/**
 * Created by naelitz on 6/29/15.
 */
public class SpriteGrid extends GridPane
{
    SpriteGrid(ImageView pic, Button btn)
    {
        this.add(pic, 0, 0);
        this.add(btn, 1,0);
    }
}
