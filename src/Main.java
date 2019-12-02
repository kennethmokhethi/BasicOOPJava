public class Main {

    public static void main(String[] args){
        //Created the Bantam object from Bakkie class
       Bakkie Bantam = new Bakkie("Red");
       Bantam.drive();
       System.out.println("Colour of car: "+Bantam.colour +", Position: "+ Bantam.position);

       //Created the Austine_Martic_Valkyrie object from the Race Car class
        RaceCar Austine_Martic_Valkyrie = new RaceCar("Silver",20);
        Austine_Martic_Valkyrie.drive();
        System.out.println("Colour of car "+Austine_Martic_Valkyrie.colour+" ,Position"+Austine_Martic_Valkyrie.position);


    }
}
