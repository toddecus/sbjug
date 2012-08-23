import org.sbjug.UserGroup
class BootStrap {

    def init = { servletContext ->
    UserGroup ug = new UserGroup(name:"South Bay JVM User Group",domain:"www.sbjug.org",signupURL: "http://www.sbjug.org/#community", logo: "http://www.sbjug.org/assets/MobileLogo125x60.png",contactEmail:"toddecus@yahoo.com",topic:"JVM languages, applications, and technologies",description:"The The south bay Java and JVM user group is a group of software developers who get together the third thursday of every month to share ideas, best practices, and learn about new technology running on a Java Virtual Machine.", slogan:"Java is hammer, but not everything that runs on the JVM is a nail.", acronym:"SBJUG")
    if(!ug.save()) log.error "failed to save initial user group test object"
    }
    def destroy = {
    }
}
