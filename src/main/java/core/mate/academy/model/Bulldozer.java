package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private boolean scoop = false;

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public boolean isScoop() {
        return scoop;
    }

    public void setScoop(boolean scoop) {
        this.scoop = scoop;
    }
}
