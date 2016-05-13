package java_pkg;

import groovy_pkg.GroovyWithBuilder;

public class MainJavaClass
{

    public static void main(String[] args)
    {
        System.out.println("Java Class got Groovy Object: " + new GroovyWithBuilder().withA(5));
    }
}
