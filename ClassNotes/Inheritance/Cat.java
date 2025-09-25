public class Cat extends Animal {
    private String hairType;

    public String getHairType() {
        return hairType;
    }


    public void setHairType(String hairType) {
        this.hairType = hairType;
    }


    public Cat(String petName, boolean hasFur, String hairType){
        super(petName,hasFur);
        this.hairType=hairType;


    }
    @Override
    public void speak() {
       System.out.println("Meow");
    }

    

    
}
