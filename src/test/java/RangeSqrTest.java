import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SQRService;

public class RangeSqrTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")
    public void testRangeSqr(int minLimit, int maxLimit, int expected) {
        SQRService service = new SQRService();
        int actual = service.numberOfSquares(minLimit, maxLimit);
        Assertions.assertEquals(expected, actual);
    }
}
