package ua.zp.bracad.bratchvv.lab7.test;

public class TestB extends TestA{
    void test() {
        System.out.println("Test B");
    }

    public static void main(String[] args) {
        TestA itsB = new TestB();
        // itsB.check();
    }

    void check() {
        test();
    }
}
