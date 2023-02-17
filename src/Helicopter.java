class Helicopter implements FlyTrans {
    @Override
    public void chirp() {
        System.out.println("The helicopter is hovering in the air.");
    }

    public void takeOff() {
        System.out.println("The helicopter is lifting off the ground.");
    }
}