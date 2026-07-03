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

• The structure is given below for gradle:- 

    my-project/
    |
    |-- build.gradle                # Main Gradle build script
    |-- settings.gradle             # Multi-Project Settings (if needed)
    |-- gradlew                     # gradle wrapper script (Linux/MAC)
    |-- gradlew.bat                 # gradle wrapper script (Windows)
    |-- gradle/wrapper/             # Wrapper files(keeps Gradle version info)
    |-- src/main/java/              # Your Java source code
    |-- src/main/resources/         # Configs, properties, static files
    |-- src/test/java/              # Unit test code
    |-- src/test/resources/         # Configs, properties, static files
    |-- build/                      # Auto generated build output(clases, jars)

• Gradle Wrapper :- A set of scripts and small jar files that allow you to run gradle without installing gradle manually on your system.

