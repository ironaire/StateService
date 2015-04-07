import edu.osumc.bmi.ird.state.service.State
import grails.util.Environment

class BootStrap {

    def init = { servletContext ->
        println "Application starting ... "
        switch (Environment.current) {
            case Environment.DEVELOPMENT:
                seedDevData()
                break;
        }
    }
    def destroy = {
        println "Application shutting down... "
    }

    private void seedDevData() {
        State.findByName("OH") ?: new State(name: "OH", fullName: "Ohio")
                .save(flush: true, failOnError: true)
        State.findByName("MI") ?: new State(name: "MI", fullName: "Michigan")
                .save(flush: true, failOnError: true)
        State.findByName("CA") ?: new State(name: "CA", fullName: "California")
                .save(flush: true, failOnError: true)

        assert State.count == 3
        println "Finished loading $State.count states into database"
    }

}
