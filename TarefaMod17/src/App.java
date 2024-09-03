import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Honda car1 = new Honda();
        Toyota car2 = new Toyota();

        car1.setColor("White");
        car1.setTransmission(false);
        car1.setNameEngineEletric("BatterySun");

        car2.setColor("White");
        car2.setTransmission(false);
        car2.setNameEngineFuel("Gas");
        ArrayList<Object> cars = new ArrayList<Object>();

        cars.add(car1);
        cars.add(car2);

        for (Object car: cars) {
            System.out.println(car);
        }

        //System.out.println("Car color: " + car1.getColor() + ", Engine: " + car1.getTransmission() + ", type Engine: "+ car1.getNameEngineEletric());
    }
}