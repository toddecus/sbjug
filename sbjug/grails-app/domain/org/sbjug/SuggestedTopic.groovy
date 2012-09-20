package org.sbjug

class SuggestedTopic {
    Long id
    Long version
    Date dateCreated
    Date lastUpdated

    String suggestion
    ArrayList<Vote> votes
    // add reference to user who suggested topic
    static constraints = {
        suggestion()
        votes(nullable:true)
    }
}
Public enum TopicVote {
    ThumbsUp(1),ThumbsDown(-1),Neutral(0)   
    private Integer vote 
    TopicVote(Integer i){
        this.vote = i
    }
    
}
