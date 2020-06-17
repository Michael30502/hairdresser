import processing.core.PApplet;


public class hairdresser extends PApplet {


    public static void main(String[] args ) {
        PApplet.main("hairdresser");
    }

// Setup af objekter til brug i programmet, objekterne, representere trelags struktur


    Database hairDatabase = new Database(this);
    DataChanger hairCalculator = new DataChanger(this,hairDatabase);
    Visualizer visualize = new Visualizer(this,hairCalculator);


        @Override
public void settings(){
super.settings();

    size(480,490);

    hairDatabase.initialize();
    hairCalculator.imageListLoader();
            }



    @Override
    public void draw(){
    background(100);
    hairCalculator.checkHairLenght();
    visualize.checkMousePressed();
    visualize.showHair();

        }
}