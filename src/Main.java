public class Main {

    public static void main(String[] args){
        //Created the Bantam object from Bakkie class
       Bakkie Bantam = new Bakkie("Red");

       String carInfor=Bantam.drive();
        System.out.println(carInfor);


       //Created the Austine_Martin_Valkyrie object from the Race Car class
        RaceCar Austine_Martin_Valkyrie = new RaceCar("Silver");
       String carInfo2= Austine_Martin_Valkyrie.drive();
        System.out.println(carInfo2);



    }
}
