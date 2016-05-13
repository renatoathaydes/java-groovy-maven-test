package groovy_pkg

import groovy.transform.Canonical
import groovy.transform.builder.Builder
import groovy.transform.builder.SimpleStrategy

@Builder(builderStrategy = SimpleStrategy, prefix = 'with')
@Canonical
class GroovyWithBuilder {
    int a
}
