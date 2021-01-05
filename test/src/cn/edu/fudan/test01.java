package cn.edu.fudan;

public class test01 {

    public class test01Inner {
        public void method01() {
            System.out.println("innerMethod");
        }
    }

    @Deprecated
    public void method04() {
        System.out.println("outerMethod1");
    }

    @Deprecated
    public void method03() {
        System.out.println("outerMethod2");
    }

    public static void main(String[] args) {
        System.out.println("test01");
        test01 object = new test01();
        test01Inner obj = object.new test01Inner();
        obj.method01();
        object.method04();
        object.method03();

    }

}
