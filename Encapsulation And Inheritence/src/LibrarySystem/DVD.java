package LibrarySystem;

public class DVD extends Library {

    private int duration;

    public DVD(){}
    public DVD(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "duration=" + duration +
                '}';
    }
}
