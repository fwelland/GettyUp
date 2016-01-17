package fhw

import spock.lang.Specification

class PrivilegeSpecification
    extends Specification
{

    def "validate CRUD for EditTransaction"()
    {
        given:      "setup a priv instance of edit view transaction"
            def p = Privilege.EditTransaction

        when:       "ask a boolean question about the privilege"
            def b = p.isCrudPrivilege()

        then:       "assert that condition is expected; that the privilege is a CRUD privilege"
            b
    }

    def "validate categories for privileges"(Privilege p, Boolean expected)
    {
        expect:
            expected == p.isCrudPrivilege()

        where:
                        p               |  expected
            Privilege.ViewAccount       | Boolean.FALSE
            Privilege.EditAccount       | Boolean.TRUE
            Privilege.ViewTransaction   | Boolean.FALSE
            Privilege.EditTransaction   | Boolean.TRUE
    }
}

