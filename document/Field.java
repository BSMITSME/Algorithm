package document;

// 클래스 변수 : 클래스가 메모리에 올라갈 때 생성, 프로그램이 종료될 떄 종료, 메소드 영역에 위치 (초기화를 하지 않아도 변수의 타입에 맞게 자동 초기화)
// 인스턴스 변수 : 인스턴스 생성 시 생성, 인스턴스가 종료되면 종료, 힙 영역에 위치 (초기화를 하지 않아도 변수의 타입에 맞게 자동 초기화)
// 지역 변수 : 블록 내에서 변수의 선언문이 실행될 때 생성, 블록을 벗어날 때 종료, 스택에 위치

class ClassField{
    static int classVar = 10; // 클래스 변수 선언
    int instanceVar = 20; // 인스턴스 변수 선언
}

public class Field {
    public static void main(String[] args){
        int var = 30; // 지역 변수 선언
        System.out.println(var + '\n');

        ClassField myField1 = new ClassField();
        ClassField myField2 = new ClassField();

        System.out.println(ClassField.classVar);
        System.out.println(myField1.classVar);
        System.out.println(myField2.classVar + "\n");

        myField1.classVar = 100;            // 클래스 변수의 값을 변경

 

        System.out.println(ClassField.classVar); // 클래스 변수 참조

        System.out.println(myField1.classVar);

        System.out.println(myField2.classVar + "\n");

 

        System.out.println(myField1.instanceVar); // 인스턴스 변수 참조

        System.out.println(myField2.instanceVar + "\n");

 

        myField1.instanceVar = 200;               // 인스턴스 변수의 값을 변경

 

        System.out.println(myField1.instanceVar); // 인스턴스 변수 참조

        System.out.println(myField2.instanceVar);
    }
}
