package org.udemy.java_advanced.reflection;

@SuppressWarnings("unused")
public class L42_AnnotationTest {
    @MethodInfo(author = "Sergei", dateOfCreation = 2022, purpose = "to print 'Hello world'")
    public void printHelloWorld() {
        System.out.println("Hello world:)");
    }
}
