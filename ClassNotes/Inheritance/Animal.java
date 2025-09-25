public class Animal{
    private String petName;
    private boolean hasFur;

    public Animal(String petName, boolean hasFur){
        this.petName=petName;
        this.hasFur=hasFur;
    }

    public String getPetName(){
        return petName;
    }

    public boolean getHasFur(){
        return hasFur;
    }

    public void setPetName(String petName){
        this.petName=petName;
    }
    
    public void setHasFur(boolean hasFur){
        this.hasFur=hasFur;
    }

    public void speak(){
        System.out.println("out");
    }

}