package builderpattern.demo2;

/**
 * Created by ZhangYulong on 2018/7/19
 */
public interface Builder {
    public Product create(String choice);
    public Product createA();
    public Product createB();
}
