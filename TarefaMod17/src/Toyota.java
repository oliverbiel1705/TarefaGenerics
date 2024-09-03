public class Toyota<T> extends CarAbstract<T> {
    private T nameEngineFuel;

    public T getNameEngineFuel() {
        return nameEngineFuel;
    }

    public void setNameEngineFuel(T nameEngineFuel) {
        this.nameEngineFuel = nameEngineFuel;
    }

    @Override
    public String toString() {
        return "Fabricante Toyota{"+ "Cor: " + this.getColor()+ ", Tipo: " + this.getTransmission() +
                ", Motor a combustão tipo= " + nameEngineFuel + '\'' +
                '}';
    }
}
