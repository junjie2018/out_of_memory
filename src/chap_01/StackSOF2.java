package chap_01;/*
    定义了大量的本地变量，增大此方法帧中本地变量表的长度。
 */

public class StackSOF2 {
    private static int stackLength = 0;

    public static void test() {
        // region
        long test0, test1, test2, test3, test4, test5, test6, test7, test8, test9, test10, test11, test12, test13, test14, test15, test16, test17, test18, test19, test20, test21, test22, test23, test24, test25, test26, test27, test28, test29, test30, test31, test32, test33, test34, test35, test36, test37, test38, test39, test40, test41, test42, test43, test44, test45, test46, test47, test48, test49, test50, test51, test52, test53, test54, test55, test56, test57, test58, test59, test60, test61, test62, test63, test64, test65, test66, test67, test68, test69, test70, test71, test72, test73, test74, test75, test76, test77, test78, test79, test80, test81, test82, test83, test84, test85, test86, test87, test88, test89, test90, test91, test92, test93, test94, test95, test96, test97, test98, test99, test100;
        stackLength++;
        test();
        test0 = test1 = test2 = test3 = test4 = test5 = test6 = test7 = test8 = test9 = test10 = test11 = test12 = test13 = test14 = test15 = test16 = test17 = test18 = test19 = test20 = test21 = test22 = test23 = test24 = test25 = test26 = test27 = test28 = test29 = test30 = test31 = test32 = test33 = test34 = test35 = test36 = test37 = test38 = test39 = test40 = test41 = test42 = test43 = test44 = test45 = test46 = test47 = test48 = test49 = test50 = test51 = test52 = test53 = test54 = test55 = test56 = test57 = test58 = test59 = test60 = test61 = test62 = test63 = test64 = test65 = test66 = test67 = test68 = test69 = test70 = test71 = test72 = test73 = test74 = test75 = test76 = test77 = test78 = test79 = test80 = test81 = test82 = test83 = test84 = test85 = test86 = test87 = test88 = test89 = test90 = test91 = test92 = test93 = test94 = test95 = test96 = test97 = test98 = test99 = test100 = 0;
        // endregion

    }


    public static void main(String[] args) {
        try {
            test();
        } catch (Error e) {
            System.out.println("stack length" + stackLength);
            throw e;
        }
    }
}