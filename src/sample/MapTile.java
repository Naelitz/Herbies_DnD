package sample;


import javafx.scene.control.Button;

/**
 * Created by david_000 on 6/25/2015.
 */
public class MapTile extends Button
{
    DungeonMaster master;
    MapTile(DungeonMaster master)
    {
        this.master = master;
        this.minHeight(25);
        this.minWidth(25);
        this.setWidth(25);
        this.setWidth(25);

        this.setOnAction(e -> {
            System.out.println("clicked");
        });
    }
}
