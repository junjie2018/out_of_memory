package chap_01;

import sun.misc.Unsafe;

/*
    直接内存（ Direct Memory ）的容量大小可通过－XX:MaxDirectMemorySize 参数来指
    定，如果不去指定，则默认与Java 堆最大值（由－Xmx 指定） 一致，


    由直接内存导致的内存溢出，一个明显的特征是在Heap Dump文件中不会看见有什么明显的
    异常情况，如果读者发现内存溢出之后产生的Dump文件很小，而程序中又直接或司接使用了
    DirectMemory（典型的间接使用就是NIO），那就可以考虑重点检查一下直接内存方面的原
    因了。
 */

import java.lang.reflect.Field;

public class DirectMemoryOOM {
    public static final int _1MB = 1024 * 1024;

    public static void main(String[] args) throws IllegalAccessException {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while (true) {
            unsafe.allocateMemory(_1MB);
        }
    }
}
