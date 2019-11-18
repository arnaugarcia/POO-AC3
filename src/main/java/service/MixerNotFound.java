package service;

public class MixerNotFound extends RuntimeException {

    public MixerNotFound() {
        super("Mixer not found");
    }
}
