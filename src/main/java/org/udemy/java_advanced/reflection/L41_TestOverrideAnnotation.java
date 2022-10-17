package org.udemy.java_advanced.reflection;

public class L41_TestOverrideAnnotation {
    public static void main(String[] args) {
        MyThread myThread = new MyThread ();
        myThread.start();
    }
}

class MyThread extends Thread {
    @SuppressWarnings("unused")
    public void run(int n) {
        System.out.println("This isn't an overriding method for 'run' - there is a difference in its signature");
    }
    public void run() {
        System.out.println("""
                Hello from myThread.run():))
                It is a correctly declared overriding method for 'run' - it is called
                as an overridden version of 'Thread.run'""");
    }
}
class A {
    @SuppressWarnings("unused")
    public void BeingOverridden(boolean flag, int n) {
        System.out.println("This is a method to override");
        deprecatedMethod();
        actualMethod();
    }
    @Deprecated
    public void deprecatedMethod() {
        System.out.println("""
            This is a very old method...
            Normally ('@SuppressWarnings("deprecation") however doesn't seem to be effective)
            causes a compiler warning "Deprecated member 'deprecatedMethod' is still used"
            """);
    }

    public void actualMethod(){
        System.out.println("This is an actual version of a 'deprecatedMethod'");
    }
}

@SuppressWarnings("unused")
class B extends A {
    @Override
    public void BeingOverridden(boolean flag, int n) {
        System.out.println("an overriding method");
    }

    //@Override
    @SuppressWarnings("unused")
    public void BeingOverridden(boolean flag, double a) {
        System.out.println("Can't be an overriding method because of difference in arguments ");
    }
}

