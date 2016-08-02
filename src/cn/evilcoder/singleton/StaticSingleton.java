package cn.evilcoder.singleton;

/**
 * 静态内部类单例
 * Created by huangshanqi on 2016/8/2.
 */
public class StaticSingleton {

    private StaticSingleton(){

    }
    private static class SingletonHolder {
        private static final StaticSingleton INSTANCE = new StaticSingleton();
    }

    public StaticSingleton getSingleton() {
        return SingletonHolder.INSTANCE;
    }
}
