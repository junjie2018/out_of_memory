// 该实验无法再jdk8上运行
// jdk7 不支持lambda
public class StackOOM {
    public void stackLeakByThread() {
        while (true) {
            {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (true) {

                        }
                    }
                }).start();
            }
        }
    }

    public static void main(String[] args) {
        new StackOOM().stackLeakByThread();
    }
}
