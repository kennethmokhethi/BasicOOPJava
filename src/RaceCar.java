public class RaceCar extends Car {

    //Constructor
    public RaceCar(String colour,int position){
        super(colour);
        this.position =position;
    }


    //Override the main method in the base class
    public void drive() {
        super.drive();
    }
}
