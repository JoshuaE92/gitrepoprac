public class Dog extends Animal{
    int size;
    public Dog(String name, boolean hasfur,int size){
        super(name,hasfur);
        this.size=size;

    }

    public int getSize(){
        return size;
    }

    public void SetSize(int size){
        this.size=size;
    }

    @Override
    public void speak(){
        System.out.println("Awooo");
    }

    
}
