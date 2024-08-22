package OOPs.OOPs_05.Interface;

public class Car implements Engine, Brake, Media {

    @Override
    public void start() {
        System.out.println("Engine started");
    }

    @Override
    public void brake() {
        System.out.println("Brake press");
    }

    @Override
    public void stop() {
        System.out.println("Engine stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating");
    }

    @Override
    public void play() {
        System.out.println("Media playing");
    }

    @Override
    public void pause() {
        System.out.println("Media paused");
    }
}
