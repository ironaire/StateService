import edu.osumc.bmi.ird.state.service.State
import grails.rest.render.json.JsonRenderer

// Place your Spring DSL code here
beans = {
    stateJsonRenderer(JsonRenderer, State) {
        excludes = ['class', 'dateCreated']
    }
    stateXmlRenderer(JsonRenderer, State) {
        excludes = ['class', 'dateCreated']
    }
}
