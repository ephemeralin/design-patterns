package GoF.behavior;

import GoF.behavior.strategy.Encryptor;
import GoF.behavior.strategy.SpecificEncryptionStrategy;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class StrategyTest {

    @Test
    public void whenSpecifyStrategyThenUseSpecifiedMethodTest() {
        SpecificEncryptionStrategy encryptionStrategy = new SpecificEncryptionStrategy();
        Encryptor encryptor = new Encryptor(encryptionStrategy);
        String data = "test data";
        encryptor.setPlainText(data);

        assertNull(encryptor.getEncodedText());
        encryptor.encrypt();
        assertThat(encryptor.getEncodedText(), is("test data encrypted"));
    }
}