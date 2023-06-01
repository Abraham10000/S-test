package TestSingleton;


import Singleteon.ClassUniqueInstance;


public class ClassUniqueInstanceTest {
    public static void main(String[]args){
        ClassUniqueInstance enumSingleton1 = ClassUniqueInstance.INSTANCE.getInstance();

        System.out.println(enumSingleton1.getClick());

        ClassUniqueInstance enumSingleton2 = ClassUniqueInstance.INSTANCE.getInstance();
        enumSingleton2.setClick(99);

        System.out.println(enumSingleton2.getClick());
    }
}
