public class RaceCar extends Car {

    //Constructor
    public RaceCar(String colour){
        super(colour);

    }


    //Override the main method in the base class

    @Override
    public String drive() {
        this.position += 20;
        return ("Colour of car :" +this.colour +" ,position:"+this.position);
    }
}
