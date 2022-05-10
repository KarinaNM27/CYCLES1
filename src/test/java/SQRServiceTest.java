import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SQRService;


public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = {"/test_square.csv"})
  public void shouldfindcount(int min, int max, int expected) {
        SQRService service = new SQRService();
        int actual = service.squarecount(min, max);


        assertEquals(expected, actual);
    }
}
