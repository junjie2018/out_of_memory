// 该实验无法再jdk8上运行
public class StackOOM {
    public void stackLeakByThread() {
        while (true) {
            {
                new Thread(() -> {
                    while (true) {

                    }
                }).start();
            }
        }
    }

    public static void main(String[] args) {
        new StackOOM().stackLeakByThread();
    }
}
