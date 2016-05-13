# Sample Groovy-Java Maven modules joint compilation

This project consists of 2 Maven sub-modules:

* test-groovy
* test-java

`test-java` depends on `test-groovy`.

`test-groovy` contains a simple class with a `@Builder`. The magic this AST does is visible from Java!

`test-java` uses the builder created automagically by Groovy.

Here's the Groovy class:

```groovy
package groovy_pkg

import groovy.transform.Canonical
import groovy.transform.builder.Builder
import groovy.transform.builder.SimpleStrategy

@Builder(builderStrategy = SimpleStrategy, prefix = 'with')
@Canonical
class GroovyWithBuilder {
    int a
}
```

And the Java class that uses it:

```java
package java_pkg;

import groovy_pkg.GroovyWithBuilder;

public class MainJavaClass
{

    public static void main(String[] args)
    {
        System.out.println("Java Class got Groovy Object: " + new GroovyWithBuilder().withA(5));
    }
}
```

To compile everything:

```
mvn clean install
```

To run the Java class:

```
cd test-java
mvn exec:java
```
