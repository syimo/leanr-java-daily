package org.example.learnbasic;

/**
 * 单例涉及模式,最简单的模式
 */
public class Single {
    private static Single mSingle = null;

    private Single() {
    }

    /**
     * 双重判断
     *
     * @return
     */
    public static Single getInstance() {
        if (mSingle == null) {
            synchronized (Single.class) {
                if (mSingle == null) {
                    mSingle = new Single();
                }
            }
        }
        return mSingle;
    }

}
