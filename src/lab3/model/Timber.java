package lab3.model;

//Цей клас реалізує сутность «брус».

public class Timber extends AbstractForm {
    private float length;
    private float width;
    private float height;

    public Timber(Wood wood, float length, float width, float height) {
        super(wood);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public float volume() {
        return length * height * width;
    }

    @Override
    public String toString() {
        return "Timber{" +
                "wood=" + wood +
                "weight=" + weight() +
                "volume=" + volume() +
                "}";
    }
}
