package org.sbjug

class Speaker {
     Long id 
     Long version
     Date dateCreated
     Date lastUpdated

     String name
     String email
     String phone
     String twitterHandle
     String blogURL
     String resume
     //TODO: think about privacy preferences for speaker info

    static constraints = {
        name()
        email()
        resume(nullable:true)
        phone(nullable:true)
        twitterHandle(nullable:true)
        blogURL(nullable:true)
    }
}
