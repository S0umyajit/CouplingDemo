package car.example.setter.injection;

public class Specification {
    private String name;

    private String model;

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

