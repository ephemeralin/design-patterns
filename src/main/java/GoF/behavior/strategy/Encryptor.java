package GoF.behavior.strategy;

public class Encryptor {

    private EncryptionStrategy strategy;
    private String plainText;
    private String encodedText;

    public Encryptor(EncryptionStrategy strategy) {
        this.strategy = strategy;
    }

    public void encrypt() {
        encodedText = strategy.encrypt(plainText);
    }

    public String getPlainText() {
        return plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    public String getEncodedText() {
        return encodedText;
    }

}
