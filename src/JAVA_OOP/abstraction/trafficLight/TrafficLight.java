package JAVA_OOP.abstraction.trafficLight;

public class TrafficLight {
    private Light light;

    public TrafficLight(Light light) {
        this.light = light;
    }

    public Light changeLight() {
        switch (this.light) {
            case RED:
                this.light = Light.GREEN;
                break;
            case GREEN:
                this.light = Light.YELLOW;
                break;
            case YELLOW:
                this.light = Light.RED;
                break;
        }
        return this.light;
    }
}
