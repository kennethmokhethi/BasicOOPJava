public class Bakkie extends Car {

    //Constructor that calls the base constructor
    public Bakkie(String colour){
        super(colour);
    }

    //Overriding
   public void drive(){
        position=+2;
   }
}
