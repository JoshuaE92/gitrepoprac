import java.util.ArrayList;

public class AnimalTest{
    public static void main(String[] args){
        ArrayList<Animal> animals=new ArrayList<Animal>();

        animals.add(new Dog("Jasper",true,60));
        animals.add(new Cat("Bo",true,"Tabby"));

        for(Animal temp: animals){
            temp.speak();
        }
    }
}

