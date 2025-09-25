package ClassNotes;
public class MethodTest {
    /*Mehtods  */
    public static final double pi=3.14;
   
    public static double calculateCirc(double raidus){
        return pi*raidus;
        

    }

    public static double calculatePercentArea(double radius,double percentage){
        double area=calculateCirc(radius);
        return percentage*area;
    }


    public static void main(String[] args){

        double radius;
        System.out.println("What is the radius of da cir");
        radius=input.nextDouble();

        double area=calculateCirc(radius);

    }


    
}
