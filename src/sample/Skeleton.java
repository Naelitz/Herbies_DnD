
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
        ImageView mapView = new ImageView(skeleton);
        Button name = new Button("Skeleton");
        DungeonMaster master;
        int health = 0;
        int hitPoints = 0;
        int numberOfDice = 1;
        int sidesOfDie = 12;
        int AC = 0;
        int speed = 0;

        Skeleton(DungeonMaster master)
        {
            this.master = master;
            view.setFitHeight(75);
            view.setFitWidth(75);
            mapView.setFitHeight(25);
            mapView.setFitWidth(25);
        }

        ImageView getImage()
        {
            return view;
        }

        ImageView getMapImage()
        {
            return mapView;
        }

        void newSprite()
        {
            master.setSprite(new Skeleton(master));
        }

        @Override
        String color() {
            return "-fx-base: #7A0000";
        }
    }


