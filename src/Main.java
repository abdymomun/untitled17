public class Main {
    public static void main(String[] args) {
        Animal eagle = new Eagle();
        Animal parrot = new Parrot();
        Animal bee = new Bee();
        FlyTrans helicopter = new Helicopter();
       FlyTrans airplane = new Airplane();
        FlyTrans aerostat = new Aerostat();
Helicopter helicopter1 = new Helicopter();
helicopter1.takeOff();

        Animal[] zoo = {eagle, parrot, bee};
        FlyTrans[] hangar = {helicopter, airplane,aerostat };

        for (Animal animal : zoo) {
            animal.ani();
        }

        for (FlyTrans aircraft : hangar) {
            aircraft.chirp();


        }
    }

    }