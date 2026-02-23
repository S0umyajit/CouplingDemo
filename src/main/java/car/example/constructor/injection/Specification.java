package car.example.constructor.injection;

public class Specification {

    private String type;

    private String model;

    public void setType(String type) {
        this.type = type;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "type='" + type + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
