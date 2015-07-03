package sample.Players;

import javafx.scene.image.Image;
import sample.CharacterCreator;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by naelitz on 6/30/15.
 */
public class Player
{
    public String name;
    public int health;
    public int armor;
    public int hitPoints;
    public int luck;
    public String race;
    public CharacterCreator creator;
    public Image wizardImg = new Image("wizard.jpg");
    public Image femaleImg = new Image("character.jpg");

    public Player(CharacterCreator creator)
    {
        this.creator = creator;
        createToon();

    }

    void createToon()
    {
        switch((String)creator.userClass.getValue())
        {
            case "Wizard": createWizard();
                break;
            case "Female": createFemale();
                break;
        }

        switch((String)creator.raceBox.getValue())
        {
            case "Gnome": this.race = "Gnome"; break;

            case "Human": this.race = "Human"; break;
        }

        setName(creator.name.getText());

        setHealth(Integer.parseInt(creator.health.text.getText()));

        setArmor(Integer.parseInt(creator.armor.text.getText()));

        setAttack(Integer.parseInt(creator.attack.text.getText()));

        setLuck(Integer.parseInt(creator.luck.text.getText()));

        save();
    }

    public void createWizard()
    {
        creator.view.setImage(wizardImg);

    }

    public void createFemale()
    {
        creator.view.setImage(femaleImg);
    }

    public void setName(String n)
    {
        this.name = n;
    }

    public void setHealth(int h)
    {
        this.health = h;
    }

    public void setArmor(int a)
    {
        this.armor = a;
    }

    public void setAttack(int attack)
    {
        this.hitPoints = attack;
    }

    public void setLuck(int l)
    {
        this.luck = l;
    }

    public void save()
    {

        try(DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(name + ".dat"))))
        {
            out.writeChars(name);

            out.writeInt(health);
            out.writeInt(armor);
            out.writeInt(hitPoints);
            out.writeInt(luck);
        }
         catch (IOException e) {
            e.printStackTrace();
        }

    }
}
