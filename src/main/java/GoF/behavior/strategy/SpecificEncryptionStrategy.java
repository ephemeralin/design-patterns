package GoF.behavior.strategy;

public class SpecificEncryptionStrategy implements EncryptionStrategy {

    @Override
    public String encrypt(String data) {
        return data + " encrypted";
    }
}
