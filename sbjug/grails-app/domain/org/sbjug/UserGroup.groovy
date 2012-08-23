package org.sbjug

class UserGroup {
    Long id
    Long version
    Date dateCreated
    Date lastUpdated

    String name
    String domain
    String signupURL 
    String logo
    String contactEmail
    String topic
    String description
    //optional
    String slogan
    String acronym
    
    // some people who run it 
    // TODO: choose a security project

    static constraints = {
        name()
        acronym(nullable:true)
        domain()
        topic()
        description()
        signupURL()
        contactEmail()
        logo()
        slogan(nullable:true)
        lastUpdated(nullable:true)
    }
}
