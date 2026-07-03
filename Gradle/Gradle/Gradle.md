# Introduction

Gradle is a build automation tool which is more flexible to automate the process.

• A build tool is a software that automates the process of building your project. 
• Building refers to:-
    • Compiling source code (Java -> ByteCode)
    • Packaging code into JAR/WAR files.
    • Managing dependencies (external libraries like Hibernate, Spring etc)
    • Running tests
    • Deploying the application
    • When you build your projects, the output can be packaged in JAR(Java Archive)/ WAR(Web Archive)
    • Bundle your code plus all dependencies.
    • Can be run directly without extra setup.

• What is the major difference between Maven and Gradle?
    • Maven does suppot java itself as the implementation language.
    • Gradle does supports multiple implementation lanaguages such as Java, Kotlin, Scala, Swift, Groovy, C++ etc.

• However if we work on Maven then we try to communicate more with the pom.xml file, but here in Gradle there is a build script 
in the similar pattern to maven which is used communicate with it.
• With respect to Maven, the entire thing itself is xml but here in Gradle it holds build scripts.
• It holds gradle wrapper which holds the runtime in it, and by using this wrapper we can simply run this file on any computer, just by running the scripts rather than installing gradle on the other device.


