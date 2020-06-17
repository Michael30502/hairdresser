import processing.core.PApplet;


public class Visualizer {
    boolean mouseNotPressed = false;
DataChanger DC;
    PApplet p;

    Visualizer(PApplet p,DataChanger DC){
        this.p = p;
this.DC = DC;
    }

    void checkMousePressed(){

        if(p.mousePressed) {
            if (p.mouseButton == p.RIGHT)
                mouseNotPressed= DC.changeBackhead(mouseNotPressed);
            if(p.mouseButton==p.LEFT)
                DC.scissors();
        }
        else mouseNotPressed= true;
    }

void showHair(){

    p.image(DC.imageList[(int)DC.i],0,0);

    p.imageMode(3);
    p.image(DC.scissors,240,p.mouseY);
    p.imageMode(0);
}


}