package edu.osumc.bmi.ird.state.service

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@ToString(includeNames = true, includeFields = true,
        excludes = 'dateCreated, lastUpdated, metaClass')
@EqualsAndHashCode
class State {

    // gorm default attributes
    Long id
    Long version

    // gorm timestamp
    Date dateCreated
    Date lastUpdated

    String name
    String fullName

    static constraints = {
        name blank: false, nullable: false, unique: true, minSize: 2, maxSize: 2
        fullName blank: false, nullable: false, minSize: 3, maxSize: 32
    }
}
