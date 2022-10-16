package org.udemy.java_advanced;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

import static java.lang.System.out;

public class L43_TestReflection {
    public static void main(String[] args) {
        Class personClass = Person.class;
        Person person = new Person();
        Class personClass1 = person.getClass();
        Class personClass2 = null;
        try {
            personClass2 = Class.forName("org.udemy.java_advanced.Person");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Annotation[] annotations = personClass.getAnnotations();
        Field[] fields = personClass.getDeclaredFields();
        Constructor[] constructors = personClass.getDeclaredConstructors();
        Method[] methods = personClass.getDeclaredMethods();

        out.println();

        if(annotations.length == 0) {
            out.println("""
                There haven't been found any annotations within the class Person...?!
                Context suggestion: try to add an annotating annotation @Retention(RetentionPolicy.RUNTIME
                """);
        }
        for (Annotation annotation : annotations) {
            out.println(annotation);
            if(annotation instanceof Author) {
                out.println("//The annotation above is an instance of Author.");
            }
        }

        out.print(Modifier.toString(personClass.getModifiers()));
        out.print(" class " + personClass.getName());
        out.println("\textends " + personClass.getSuperclass().getName() + " {");

        for (Field field : fields) {
            out.print("\t" + Modifier.toString(field.getModifiers()));
            out.println(" " + field.getType() + ' ' + field.getName() + ';');
        }
        out.println();

        for(Constructor constructor: constructors) {
            printMethodInfo(constructor.getModifiers(),
                    personClass.getSimpleName(),
                    constructor.getParameters(),
                    "");
        }
        out.println();

        for (Method method : methods) {
            printMethodInfo(method.getModifiers(),
                    method.getName(),
                    method.getParameters(),
                    method.getReturnType().toString());
        }

        out.println("}\n");
    }

    static void printMethodInfo(int modifiers, String name, Parameter[] parameters, String returnType) {
        out.print("\t" + Modifier.toString(modifiers));
        if(returnType!=null && returnType.length()>0) {
            out.print(" " + returnType);
        }
        out.print(" " + name +  '(');

        for (Parameter parameter : parameters) {
            out.print(parameter.getType().toString() + ' ');
            out.print(parameter.getName() + ',');
        }
        if (parameters.length > 0) {
            out.print('\b'); //to remove the last comma
        }
        out.println(");");
    }
}
