package Interface;

public class Main {
    public static void main(String[] args) {
       Engine car = new Car();
//        car.start();
//        car.stop();
//        car.acc();

//        Media carMedia = new Car();
//        carMedia.stop();

        NiceCar car1 = new NiceCar();
        car1.start();
        car1.StartMusic();
        car1.upgradeEngine();
        car1.start();

    }
}
