package cn.evilcoder.singleton;

import cn.evilcoder.model.TestClass;

/**
 * 枚举单例
 * Created by huangshanqi on 2016/8/2.
 */
public enum  EnumSingleton {
    INSTANCE;

    private TestClass testClass;


    EnumSingleton() {
        // 可以进行属性的初始化
        testClass = new TestClass();
        testClass.setUsername("evilcoder");
        testClass.setPassword("cn");
    }

    public TestClass getTestClass() {
        return testClass;
    }

    public void setTestClass(TestClass testClass) {
        this.testClass = testClass;
    }
}
