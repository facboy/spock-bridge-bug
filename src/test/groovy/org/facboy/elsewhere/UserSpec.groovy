package org.facboy.elsewhere

import org.facboy.Child

import spock.lang.Specification

class UserSpec extends Specification{
    def child = Mock(Child)

    def user = new User()

    def "should invoke doSomething"() {
        when:
        user.use(child)

        then:
        1 * child.doSomeThing(_ as List<Integer>)
    }
}
