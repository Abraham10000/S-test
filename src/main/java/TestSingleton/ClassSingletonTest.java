package TestSingleton;

import Singleteon.ClassiSingleton;

public class ClassSingletonTest {
    public static void main(String[] args) {
        ClassiSingleton classSingleton1 = ClassiSingleton.getInstance();

        System.out.println(classSingleton1.getDescription());

        ClassiSingleton classiSingleton2= ClassiSingleton.getInstance();
        classiSingleton2.setDescription("The new description");
        System.out.println(classiSingleton2.getDescription()); //New class info
    }
}
