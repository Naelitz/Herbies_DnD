package sample;

import javafx.scene.image.Image;


public class Controller
{
    Main main;
    Image image = new Image("wrinkled-paper.jpg");
        Controller(Main main) {
            this.main = main;

        }
    Image getImage()
    {
        return image;
    }
}
