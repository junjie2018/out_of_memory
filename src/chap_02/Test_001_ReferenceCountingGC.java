package chap_02;

public class Test_001_ReferenceCountingGC {
    public Object instance = null;
    private static final int _1mb = 1024 * 1024;
    private byte[] bigSiznew = new byte[2 * _1mb];


    public static void main(String[] args) {
        Test_001_ReferenceCountingGC objA = new Test_001_ReferenceCountingGC();
        Test_001_ReferenceCountingGC objB = new Test_001_ReferenceCountingGC();

        objA.instance = objB;
        objB.instance = objA;

        System.gc();
    }
}
