package trie;

/**
 * Created by ZhangYulong on 2019/5/12
 *
 * @param <Value> the type parameter
 */
public interface StringST<Value> {

    /**
     * 向表中插入键值对（如果值为null时则删除key）
     *
     * @param key the key
     * @param val the val
     */
    void put(String key, Value val);

    /**
     * 键key所对应的值（如果间不存在则返回null）
     *
     * @param key the key
     * @return the value
     */
    Value get(String key);

    /**
     * 删除键key（和它的值）
     *
     * @param key the key
     */
    void delete(String key);

    /**
     * 表中是否保存着key的值
     *
     * @param key the key
     * @return the boolean
     */
    boolean contains(String key);

    /**
     * 符号表是否为空
     *
     * @return the boolean
     */
    boolean isEmpty();

    /**
     * s的前缀中最长的键
     *
     * @param s the s
     * @return the string
     */
    String longestPrefixOf(String s);

    /**
     * 所有以s为前缀的键
     *
     * @param s the s
     * @return the iterable
     */
    Iterable<String> keyWithPrefix(String s);

    /**
     * 所有和s匹配的键（其中“.” 能够匹配任意字符）
     *
     * @param s the s
     * @return the iterable
     */
    Iterable<String> keysThatMatch(String s);

    /**
     * 键值对的数量
     *
     * @return the int
     */
    int size();

    /**
     * 符号表中的所有键
     *
     * @return the iterable
     */
    Iterable<String> keys();

}
