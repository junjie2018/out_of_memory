package chap_01;/*
    使用Xss参数减少栈内存容量
 */

public class StackSOF {
    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        StackSOF javaVMStackOverflow = new StackSOF();
        try {
            javaVMStackOverflow.stackLeak();
        } catch (Error e) {
            System.out.println("stack lenght:" + javaVMStackOverflow.stackLength);
            throw e;
        }
    }
}
