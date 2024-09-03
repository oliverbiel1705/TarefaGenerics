public class Honda <T> extends CarAbstract<T> {
    private T nameEngineEletric;

    public T getNameEngineEletric() {
        return nameEngineEletric;
    }

    public void setNameEngineEletric(T nameEngineEletric) {
        this.nameEngineEletric = nameEngineEletric;
    }

    @Override
        public String toString() {
            return "Fabricante Toyota{"+ "Cor: " + this.getColor()+ ", Tipo: " + this.getTransmission() +
                    ", Motor a combustão tipo= " + nameEngineEletric + '\'' +
                    '}';
        }
}
