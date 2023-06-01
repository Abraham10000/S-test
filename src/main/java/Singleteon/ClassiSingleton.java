package Singleteon;

public class ClassiSingleton {
    private static ClassiSingleton INSTANCE;
    private String description = "Initial description";

    private void ClassSingleton() {
    }

    public static ClassiSingleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ClassiSingleton();
        }

        return INSTANCE;
    }

    public static ClassiSingleton getINSTANCE() {
        return INSTANCE;
    }

    public static void setINSTANCE(ClassiSingleton INSTANCE) {
        ClassiSingleton.INSTANCE = INSTANCE;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
