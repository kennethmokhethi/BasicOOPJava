public class Bakkie extends Car {

    //Constructor that calls the base constructor
    public Bakkie(String colour) {
        super(colour);
    }

    //Overriding

    @Override
    public String drive() {
        this.position += 3;
        return ("Colour of car :" +this.colour +" ,position:"+this.position);

    }
}
