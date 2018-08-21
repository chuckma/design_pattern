package cn.lucasma.design.pattern.creational.singleton;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

/**
 * @author Administrator
 */
public enum  EnumInstance {

    INSTANCE{
        protected void printTest(){
            System.out.println("this is a test");
        }
    };
    protected abstract void printTest();
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}
