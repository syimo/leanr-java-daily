package org.example.learnbasic;

/**
 * 接口中的成员变量 都是public static final. 方法都是public abstract
 * 可以全部省略
 * 接口无法创建对象，只能去实现类
 * <p>
 * 接口之间可以多继承，只存在于接口之间
 */
public interface Tes {
    /**
     * 默认final
     */
    public static final String TAG = "123";

    public abstract void getNumber();


}
//public interface Tes2 {
//    /**
//     * 默认final
//     */
//    public static final String TAG = "123";
//
//    public abstract void getNumber();
//
//
//}
