package Singleteon;

public enum ClassUniqueInstance {
    INSTANCE(0);

    private int click;

    ClassUniqueInstance(int click) {
        this.click = click;
    }

    public ClassUniqueInstance getInstance() {
        return INSTANCE;
    }

    public int getClick() {
        return click;
    }

    public void setClick(int click) {
        this.click = click;
    }
}
