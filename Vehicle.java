public abstract class Vehicle {
    //attributes
    private String brand;
    private  int kilometers;

   //constructor
    public Vehicle( String brand) {
        this.brand = brand;
        this.kilometers =0;
    }

    //getters

    public String getBrand() {
        return this.brand;
    }

    public int getKilometers() {
        return this.kilometers;
    }

    //setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public abstract String doStuff();
}

class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }
    @java.lang.Override
    public String doStuff() {
        return "Je suis " + this.getBrand() + " et je fais vroum vroum !";
    }
}

class Boat extends Vehicle {
 public Boat(String brand){
     super(brand);
 }

    @java.lang.Override
    public String doStuff() {
        return "Je suis " + this.getBrand() + " et je fais glou glou !";
    }
}

class Hangar {
    public static void main(String[] args){
        Car clio = new Car("Clio");
        System.out.println(clio.doStuff());
        Boat titanic = new Boat("Titanic");
        System.out.println(titanic.doStuff());
    }


}