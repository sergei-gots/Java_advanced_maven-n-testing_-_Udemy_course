package org.udemy.java_advanced.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class L44_ReflectionAPI {
    @SuppressWarnings("unchecked")
    public static void main(String[] args)
            throws ClassNotFoundException,
            NoSuchMethodException,
            //Next exceptions can be thrown with
            //  Constructor<T> public T newInstance(Object initParam ...)
            InvocationTargetException, InstantiationException, IllegalAccessException {
        //We will read from the console a name of a class,
        // a name of another class which will be a class identifying a parameter of a method,
        // and then we will read a name of this method of the class-1
        //and invoke this method of the class
        Scanner scanner = new Scanner(System.in);
        //We will read the class name-1, then - the class name-2, and the method name.
        System.out.println("Enter names of a class1, class2 and method of the class1 to be invoked:");
        //Test inputs:
        //  1: org.udemy.java_advanced.reflection.Person java.lang.String setName
        //  2: java.lang.Thread java.lang.String setName
        Class class1 = Class.forName(scanner.next());
        Class class2 = Class.forName(scanner.next());
        Method method = class1.getMethod(scanner.next(), class2);

        //Let's create corresponding objects:
        Object instance1 = class1.getDeclaredConstructor().newInstance();
        Object instance2 = class2.
                getDeclaredConstructor(String.class).
                newInstance("String value");

        //Let's perform an invocation:
        method.invoke(instance1, instance2);

        System.out.println(instance1);
        //And our outputs corresponding to the test inputs will be:
        //  1: Person{id=-1, name='String value'}
        //  2: Thread[String value,5,main]
    }
}
