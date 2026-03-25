package Phase_1.week_1.part_1.problem_1;
class Car{
    String brand;
    String model;
    int year;
    Car(){
        this.brand = "";
        this.model = "";
        this.year = 0;
    }
    Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    void displayInfo(){
        System.out.println("Brand: " + this.brand +"," + " model: " +  this.model +"," + " year: " + this.year);
    }
    @Override
    public String toString(){
        return "Brand: " + this.brand +"," + " model: " +  this.model +"," + " year: " + this.year;
    }
}
public class Problem_1 {
    public static void main(String[] args) {
        Car car1 = new Car("toyota" , "second" , 2020);
        car1.displayInfo();
        System.out.println(car1);

    }
}
