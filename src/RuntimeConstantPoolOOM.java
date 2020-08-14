// 两台机子都没有做出效果
// 书中已经说了jdk7没有效果，没看到，头疼
import java.util.HashSet;
import java.util.Set;

public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        short i = 0;
        while (true) {
            set.add(String.valueOf(i++).intern());
        }
    }
}
