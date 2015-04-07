package edu.osumc.bmi.ird.state.service

import grails.rest.RestfulController

class StateController extends RestfulController<State> {

    static responseFormats = ['json', 'xml']

    StateController() {
        super(State)
    }

    def index() {
        respond listAllResources(params), formats: ['json', 'xml']
    }
}
