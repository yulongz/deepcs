package hash;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ZhangYulong on 2018/5/10
 */
public class HashFunctionTest {

    @Test
    public void myHashCodeTest() {
        int myHashCode = HashFunction.myHashCode("ZhangYulong");
        int hashCode = "ZhangYulong".hashCode();
        Assert.assertEquals(myHashCode, hashCode);
    }

    @Test
    public void myHash() {
        int myHashValue = HashFunction.myHash("ZhangYulong", 101);
        Assert.assertEquals(25, myHashValue);
    }
}
