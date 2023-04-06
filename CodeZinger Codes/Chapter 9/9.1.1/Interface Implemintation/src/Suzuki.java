class Suzuki implements Car {
    private int currentSpeed;

    public Suzuki(int speed) {
        this.currentSpeed = speed;
    }

    public void increaseSpeed(int speed) {
        this.currentSpeed += speed;
    }

    public void displaySpeed() {
        System.out.println(this.currentSpeed);
    }

}
