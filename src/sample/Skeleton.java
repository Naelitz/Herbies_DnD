
    package sample;

    import javafx.scene.control.Button;
    import javafx.scene.image.Image;
    import javafx.scene.image.ImageView;

    /**
     * Created by david_000 on 6/29/2015.
     */
    public class Skeleton extends Sprite
    {
        //Skeleton
        Image skeleton = new Image("skeletonbonecrusher.jpg");
        ImageView view = new ImageView(skeleton);
        String name = "Skeleton";
        int health = 0;
        int hitPoints = 0;
        int numberOfDice = 1;
        int sidesOfDie = 12;
        int AC = 0;
        int speed = 0;

        Skeleton()
        {

        }

        ImageView getImage()
        {
            return view;
        }
    }


