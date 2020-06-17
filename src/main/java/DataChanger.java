import processing.core.PApplet;
import processing.core.PImage;

public class DataChanger {

    float i=0;
    boolean backHead = false;

    Database HD;
    PApplet p;
    PImage[] imageList;
    PImage scissors;


    DataChanger(PApplet p,Database HD){
        this.p = p;
        this.HD = HD;
    }


    void scissors(){

    if(i>p.mouseY/5&& p.mouseY>0)
    i=p.mouseY/5;

}

void imageListLoader(){

    this.imageList =  HD.imageList;
    this.scissors = HD.scissors;

    }

    void checkHairLenght(){

        i+= 0.05;
        if(i >99)
            i= 99;

    }

boolean changeBackhead(boolean mouseNotPressed){

    if( mouseNotPressed == true) {
    if(backHead == false){
    backHead = true;
    imageList = HD.imageList2;
} else{
    backHead = false;
    imageList=HD.imageList;
}
  }
return false;

}
    }