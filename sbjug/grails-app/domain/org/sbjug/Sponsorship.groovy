package org.sbjug

class Sponsorship {
    Long id
    Long version 
    Date dateCreated
    Date lastUpdated

    Long sponsor
    SponsorshipType sponsorshipType
    Long userGroup
    Long meeting
    
    static constraints = {
        sponsor()
        sponsorshipType()
        userGroup(nullable:true)
        meeting(nullable:true)
    }

}
public enum SponsorshipType {
    Group('Group Sponsor'), Meeting('Meeting Sponsor'), RaffleItem('Raffle Items'),SharedMeeting('Shared Meeting Sponsor') 
    private String sponsorshipType
    SponsorshipType(String sShipType){
        this.sponsorshipType=sShipType
    }
}
