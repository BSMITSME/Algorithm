package document;
import java.util.*;

class Car implements Cloneable {

    private String modelName;
    private ArrayList<String> owners = new ArrayList<String>();

    public String getModelName() { return this.modelName; }                    // modelName의 값을 반환함
    public void setModelName(String modelName) { this.modelName = modelName; } // modelName의 값을 설정함

    public ArrayList getOwners() { return this.owners; }                      // owners의 값을 반환함
    public void setOwners(String ownerName) { this.owners.add(ownerName); }   // owners의 값을 추가함


    public Object clone() {
    try {
        Car clonedCar = (Car) super.clone();
        clonedCar.owners = (ArrayList<String>) this.owners.clone(); // owners 필드를 복제하여 새 ArrayList로 할당
        return clonedCar;
    } catch (CloneNotSupportedException ex) {
        ex.printStackTrace();
        return null;
    }
}

}

public class ObjectClone {
    public static void main(String[] args) {
        Car car01 = new Car();
        car01.setModelName("아반떼");
        car01.setOwners("홍길동");
        System.out.println("Car01 : " + car01.getModelName() + ", " + car01.getOwners() + "\n");

        Car car02 = (Car)car01.clone();
        car02.setOwners("이순신");
        System.out.println("Car01 : " + car01.getModelName() + ", " + car01.getOwners());
        System.out.println("Car02 : " + car02.getModelName() + ", " + car02.getOwners());
    }
}
