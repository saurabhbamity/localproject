package com.test.annotation;
import java.lang.reflect.Method;
import java.lang.annotation.Annotation;

public class TestRuntimeAnnotation {
    public static void main(String args[]) throws SecurityException,
    ClassNotFoundException {
        for (Method method : Class.forName("com.test.MyClassImpl").getMethods()) {
            if(method.isAnnotationPresent(Developer.class)){
                try {
                    for (Annotation anno : method.getDeclaredAnnotations())  {
                        System.out.println("Annotation in Method '" + method + "' : " + anno);

                        Developer a = method.getAnnotation(Developer.class);
                        System.out.println("Developer Name:" + a.value());
                    }
                } catch (Throwable ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}