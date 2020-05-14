package lab3.model;

public class Cilinder extends AbstractForm {
    private float length;
    private float diameter;

    public Cilinder(Wood wood, float length, float width) {
        super(wood);
        this.length = length;
        this.diameter = width;
    }


    public float getLength() {
        return length;
    }

    public float getDiametr() {
        return diameter;
    }

    @Override
    public String toString() {
        return "Cilinder{" +
                "length=" + length +
                ", diameter=" + diameter +
                ", wood=" + wood +
                '}';
    }

    @Override
    public float volume() {
        return (float) (Math.PI * Math.pow(diameter/2, 2) * length);
    }

}
