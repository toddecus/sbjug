package org.sbjug

class Sponsor {
    Long id
    Long version 
    Date dateCreated
    Date lastUpdated

    String companyName
    String logoURL
    String followedLinkURL
    String slogan
    SponsorType = type
    ArrayList<Sponsorship> sponsorships

    static constraints = {
        companyName()
        type()
        followedLinkURL()
        logoURL(nullable:true)
        slogan(nullable:true)
        sponsorships()
    }
}
public enum SponsorType {
    Staffing('Staffing'),Vendor('Vendor'),Consulting('Consulting'),Employer('Employer'),Member('Member')
    private String type
    SponsorType(String sType) {
        this.type=sType
    }
}
