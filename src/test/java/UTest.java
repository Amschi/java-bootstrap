
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UTest {





    private Application application = new Application();

    @Test
    public void sayHello() {
        // Given
        String expected = "Hello";

        // When
        String result = application.sayHello();

        // Then
        assertThat(result).isEqualTo(expected);
    }

}