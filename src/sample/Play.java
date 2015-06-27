package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.shape.Rectangle;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by david_000 on 6/25/2015.
 */
public class Play
{
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
                VBox list = new VBox();
                layout.setLeft(list);
                list.setPrefWidth(200);

                GridPane center = new GridPane();
                Stage window = new Stage();

                window.initModality(Modality.APPLICATION_MODAL);
                layout.setCenter(center);
                for(int i = 0 ; i < 100 ; i++)
                {
                    for (int j = 0 ; j < 100 ; j++)
                    {
                        center.add(new Button(), i, j);
                    }
                }

                Scene scene = new Scene(layout, 800, 800);
                window.setScene(scene);
                window.showAndWait();
            }
        }
