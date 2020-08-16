package chap_03;

public class Test03 {
    private static final int _1MB = 1024 * 1024;

    public static void testTenuringThreshold() {
        byte[] allocation1, allocation2, allocation3;

        allocation1 = new byte[_1MB / 4];
        allocation2 = new byte[_1MB * 4];
        allocation3 = new byte[_1MB * 4];
        allocation3 = null;
        allocation1 = new byte[_1MB * 4];
    }

    public static void main(String[] args) {
        testTenuringThreshold();
    }
}
