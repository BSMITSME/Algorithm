package document;

interface Animal{
    public abstract void cry();
}
interface Pet{
    public abstract void play();
}

class Cat implements Animal, Pet{

    @Override
    public void cry() {
        // TODO Auto-generated method stub
        System.out.println("야옹");
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        System.out.println("Catch the mouse");
    }
    
}

class Dog implements Animal, Pet{
    @Override
    public void cry(){
        System.out.println("멍멍");
    }

    @Override
    public void play() {
        System.out.println("Catch the Ball");
    }
}

public class InterfaceEx {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();

        c.cry();
        d.cry();

        c.play();
        d.play();

    }
}
