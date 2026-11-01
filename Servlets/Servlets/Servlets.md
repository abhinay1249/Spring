# Introduction

Fundamentals [Client-Server Architecture]

• Client - Is a user or system that request a specific resource or service from another entity known as Server.
• Internet - Is a global communication system that links together thousands of individual networks. It allows exchange of information between two or more computers on a network.
• Server - Is responsible to process a single request or more than one request at a time.
• Web Server - Software program or server computer equipped to offer World Wide Web access.

• There are two types of responses:-
    • Static Response - A response that is fixed irrespective of the users that are using the webpage.
    • Dynamic Response - A repsonse that is flexible and showcase dynamic results for multiple users accordingly on the webpage.

# Servlets

• Servelts are defined as software program that are residing on the server machine.
• They are used to generate dynamic responses to the client request.

<img width="743" height="356" alt="Screenshot 2026-11-05 130220" src="https://github.com/user-attachments/assets/8b3feb25-9cd8-450d-8cb1-c6dbdca843ed" />

• Usually, for Java programs holds a main() method such that the JVM can access it run the program but for Servlets there is no requirement for the main() method since the servlet container within the server will execute the Servlet program.

• The server that holds the Servlet Container and is responsible for executing the Servlet Programs is known as "Apache TomCat" Server.

## From here the entire implementation is done in Eclipse IDE JEE Version.

# Static Web Page

    • Install Apache Tom Cat Server with the latest version on your local machine.
    • Click on New, Select Dynamic Web Project.
    • Select the Apache Tom Cat Server that is installed on your machine.
    • While Confguring the project, you shall have a content Directory where utilize the path that is present or replace it with "WebApp".
    • Then from the Package Explorer Navigate to the WebApp folder, Right Click upon it.
    • Select New and then select HTML file, name it as index.html
    • In the HTML file, you shall create a marquee tag and then save it.
    • Right Click on the HTML file and then run it through the Server it shall redirect you to the webpage running on that Server.
    • After the respective checks are done, dont forget to stop the server as it shouldn't perform any conflicts to the upcoming        WebApplication that to be runned on the server.

# Dynamic Web Page

    • Create a Project known as Dynamic Web Page and then configure it with the content directory.
    • Build an HTML file that includes a form that holds a username, city and sign in button.
    • Using Servlet when a user clicks Sign in then it should dynamically produce the output.
    • In order to perform like the above point, hover to src and create a servlet program that handles only POST request.
    • Take a refernce of the Program from the source code.

# Servlet Life Cycle

    • A Servlet Life Cycle does hold various methods to perform its operation.
    • A very first thing is that, An object will be created internally for the class by the Servlet Container itself.
    • The LifeCycle holds three crucial methods, they are init(), service(), destroy()
        • First, the class will be loaded and then instantiated.
        • Second, the init() method will be executed by the Servlet Container internally and whatever the intializations that need to be done for the data will be performed and included in this method.
    

 