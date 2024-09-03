public abstract class CarAbstract<T> {

    private T color;
    private T transmission;

    public T getColor() {
        return color;
    }

    public void setColor(T color) {
        this.color = color;
    }

    public String getTransmission() {
        if(this.transmission.equals(true)){
            return "Automatic";
        }
        return "Manual";
    }

    public void setTransmission(T transmission) {
        this.transmission = transmission;
    }

}
