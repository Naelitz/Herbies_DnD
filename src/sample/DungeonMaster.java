package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class DungeonMaster {

        public static void display(Main main)
        {
            // This is the menu that gets displayed if the help button is clicked.
            // Just displays a new window when the help button is clicked.
            // Also holds the focus until the window is closed so they can not
            // go back to playing until the window is closed.
            BorderPane layout = new BorderPane();
            StackPane top = new StackPane();
            Rectangle header = new Rectangle();
            Rectangle background = new Rectangle();
            Label help = new Label();
            Label instruction = new Label();
            Sprites list = new Sprites();
            GridPane center = new GridPane();
            ScrollPane centerScroll = new ScrollPane(center);
            layout.setLeft(list);


            Stage window = new Stage();
            list.prefWidthProperty().bind(window.widthProperty().divide(4));
            window.initModality(Modality.APPLICATION_MODAL);

            layout.setCenter(centerScroll);
            for(int i = 0 ; i < 50 ; i++)
            {
                for (int j = 0 ; j < 50 ; j++)
                {
                    center.add(new MapTile(this), i, j);
                }
            }

            Scene scene = new Scene(layout, 800, 800);
            window.setScene(scene);
            window.showAndWait();
        }
    }