import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

public class TestPrint {
    public static final Log LOG = LogFactory.getLog(TestPrint.class.getName());

    @Test
    public void printTest(){
        LOG.info("中文");
    }

}
