package org.sbjug

class Meeting {
  long id
  long version
  Date dateCreated
  Date lastUpdated

  String title
  Date dateScheduled


    static constraints = {
        title()
        dateScheduled(nullable:true)
        lastUpdated(nullable:true)

       
    }
}
