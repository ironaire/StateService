package edu.osumc.bmi.ird.state.service

import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(StateController)
@Mock(State)
class StateControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test index returns all states in json format"() {
        given:
        new State(name: "OH", fullName: "Ohio")
                .save(flush: true, failOnError: true)
        new State(name: "MI", fullName: "Michigan")
                .save(flush: true, failOnError: true)
        new State(name: "CA", fullName: "California")
                .save(flush: true, failOnError: true)
        when:
        request.method = 'GET'
        response.format = 'json'
        controller.index()
        then:
        response.status == 200
    }
}
