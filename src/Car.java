public class Car {
    //Class attributes that are accessible to the base class
    protected String colour;
    protected int position = 0;

    //Constructor
    public Car(String colour){
        this.colour = colour;

    }

    //A void method that increments the position
    public String drive()
    {

        this.position++;
        return ("Colour of car :" +this.colour +" ,position:"+this.position);

    }

}
