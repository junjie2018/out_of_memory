package chap_01;

import java.lang.reflect.Method;

// 这部分没有办法实验，缺少这部分的知识储备

/*
    值得特别注意的是，我们在这个例子中模拟的场景并非纯粹是一个实验，类似这样的代码确实可能会出现在实
    际应用中：当前的很多主流框架，如Spring，Hibernate对类进行增强时，都会使用到CGLib这类字节码技术，
    当增强的类越多，就需要越大的方法区以保证动态生成的新类型可以载入内存。另外，很多运行于Java虚拟机
    上的动态语言（例如Groovy等）通常都会持续创建新类型来支撑语言的动态性，随着这类动态语言的流行，与
    代码清单2-9相似的溢出场景也越来越容易遇到。

    -XX:MaxMetaspaceSize        ：设置元空间最大值，默认是1，即不限制，或者说只受限于本地内存大小。
    -XX:MetaspaceSize           ：指定元空间的初始空间大小，以字节为单位，达到该值就会触发垃圾收集
                                  进行类型卸载，同时收集器会对该值进行调整：如果释放了大量的空间，
                                  就适当降低该值；如果释放了很少的空间，那么在不超过-XX:MaxMetaspaceSize
                                  （如果设置了的话）的情况下，适当提高该值。
    -XX:MinMetaspaceFreeRatio   ：作用是在垃圾收集之后控制最小的元空间剩余容量的百分比，可减少因为元
                                  空间不足导致的垃圾收集的频率。类似的还有-XX:Max-MetaspaceFreeRatio，
                                  用于控制最大的元空间剩余容量的百分比。
 */

public class MethodAreaOOM {
    public static void main(String[] args) {
//        while (true) {
//            Enhancer enhancer = new Enhancer();
//            enhancer.setSuperclass(OOMObject.class);
//            enhancer.setUseCache(false);
//            enhancer.setCallback(new MethodInterceptor() {
//                public Object intercept(Object obj, Method method, Object[] area, MethodProxy proxy) throws Throwable {
//                    return proxy.invokeSuper(obj, args);
//                }
//            });
//            enhancer.create();
//        }
    }
}
