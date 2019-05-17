package builderpattern.demo3;

/**
 * Created by ZhangYulong on 2018/7/23
 */
public class Circle {
    private final int x;
    private final int y;
    private final int length;
    private final String color;

    public static class Builder{
        private final int x;
        private final int y;
        private final int length;
        private String color = "red";

        public Builder(int x,int y,int length) {
            this.x = x;
            this.y = y;
            this.length = length;
        }

        public Builder setColor (String val){
            this.color = val;
            return this;
        }

        public Circle build(){
            return new Circle(this);
        }
    }

    public Circle(Builder builder) {
        this.x = builder.x;
        this.y = builder.y;
        this.length = builder.length;
        this.color = builder.color;
    }

    @Override
    public String toString(){
        return "x="+x+";y="+y+";length="+length+";color="+color+".";
    }

}
