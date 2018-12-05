
public class fclass1 {
    protected int t=10;
    public void talk(){
        System.out.println("Я метод класса fclass1. Суперкласс.");
    }
    public static void main(String[] args) {
        fclass1 Class1 = new fclass1();
        fclass2 Class2 = new fclass2();
        fclass3 Class3 = new fclass3();
        System.out.println("Вот t: "+ Class2.getT());
        Class2.setT(40);
        System.out.println("Вот t теперь: "+ Class2.getT());
        Class1.talk(); Class2.talk(); Class3.talk();
    }
}
