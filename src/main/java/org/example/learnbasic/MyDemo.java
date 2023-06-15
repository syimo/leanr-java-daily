package org.example.learnbasic;

public class MyDemo {
    int num;

    @Override
    public String toString() {
        return "MyDemo";
    }


    /**
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MyDemo))
            return false;

        return this.num == ((MyDemo) obj).num;
    }
}
