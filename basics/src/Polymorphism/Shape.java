package Polymorphism;

public class Shape {
    public static void main(String[] args) {
      Shapes s = new circle();//this is called as upcasting
      s.area();//this deciding process is called dynamic methods displacement
    }
}

class Shapes{
    void area(){
        System.out.println("this area belongs to the parent class");
    }
}

class circle extends Shapes{
    void area(){
        System.out.println("this area belongs to the child class");
    }
}






