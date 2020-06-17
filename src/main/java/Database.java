import processing.core.PApplet;
import processing.core.PImage;

public class Database {
    PApplet p;
    PImage[] imageList=new PImage[100];
    PImage[] imageList2=new PImage[100];
    PImage scissors;

    Database(){}
    Database(PApplet p){
        this.p = p;

    }


    void initialize() {
        int i = 0;
        while (i < 100) {
            imageList[i] = p.loadImage("Face" + i + ".png");
            imageList2[i] = p.loadImage("Backhead" + i + ".png");
            i++;
            scissors = p.loadImage("Saks.png");
        }


    }}