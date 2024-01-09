package document;
class Car {

    private String modelName;

    private int modelYear;

    private String color;

    private int maxSpeed;

    private int currentSpeed;

 
    // 기본생성자, 접근 제어자를 명시하지 않으면 package-private, 같은 패키지 내에서만 접근 가능
    Car(String modelName, int modelYear, String color, int maxSpeed) {

        this.modelName = modelName;

        this.modelYear = modelYear;

        this.color = color;

        this.maxSpeed = maxSpeed;

        this.currentSpeed = 0;

    }

 

    public String getModel() {

        return this.modelYear + "년식 " + this.modelName + " " + this.color;

    }

}
public class Constructor {
    public static void main(String[] args) {
        Car myCar = new Car("아반떼", 2016, "흰색", 200);
        System.out.println(myCar.getModel());
    }
    
}
