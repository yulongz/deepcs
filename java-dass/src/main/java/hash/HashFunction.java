package hash;

/**
 * Created by ZhangYulong on 2018/5/10
 * @author hadoop
 */
public class HashFunction {

    private HashFunction() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * A hash routine for String objects.
     *
     * @param key       the key the String to hash.
     * @param tableSize the size of the hash table.
     * @return the hash value.
     */
    public static int myHash(String key,int tableSize){
        int hashVal = 0;
        hashVal = myHashCode(key);
        hashVal %= tableSize;
        if(hashVal < 0){
            hashVal += tableSize;
        }
        return hashVal;
    }

    public static int myHashCode(String key,int weight){
        int myHashCodeValue=0;
        for(int i = 0;i < key.length();i++){
            myHashCodeValue = myHashCodeValue * weight+key.charAt(i);
        }
        return myHashCodeValue;
    }

    public static int myHashCode(String key){
        return myHashCode(key,31);
    }
}
