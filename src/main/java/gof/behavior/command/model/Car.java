package gof.behavior.command.model;

/**
 * Receiver.
 */
public class Car {

    private boolean moving;
    private int currentSpeed;

    public Car() {
        this.moving = false;
        this.currentSpeed = 0;
    }

    public void move() {
        moving = true;
        currentSpeed = currentSpeed + 10;
        System.out.println("Car is moving");
    }

    public void stop() {
        moving = false;
        currentSpeed = currentSpeed - 10;
        System.out.println("Car has stopped");
    }

    public boolean isMoving() {
        return moving;
    }

    public void showCurrentSpeed() {
        System.out.println(String.format("Current speed: %s km/h", currentSpeed));
    }
}
