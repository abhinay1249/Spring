# Introduction

JDBC refers to Java DataBase Connectivity.

• It is the process where a respective Java application program was executed with the resepctive data was stored in RAM which is a temporary storage area. Incase, if the application data need to be stored permanently, then either on hard disk or in a database the data is stored.
• If the resepective application is prefered to store in hard disk then it would I/O, file handling, storing the entire data in file which is stored in the hard disk itself.
• In order to store application in the database, JDBC is essential to perform the CRUD operations.

# Steps Involved in Developing JDBC Application

1. Import the required package (Also download & Add Database specific jar into the project).
2. Load and Register the respective database driver.
3. Establish a connection.
4. Create a statement.
5. Execute the query.
6. Process the Result.
7. Close the Connection.

# References from the Code

• Class.forName("net.snowflake.client.api.driver.SnowflakeDriver");

• Why Class.forName is used? Intially When you are create a class and then create one static and non-static block. Once you create a object for it and then the respective print statements, both the methods are executed successfully.

class Demo{
    static{
        System.out.println("Static Block");
    }

    {
        System.out.println("Non-Static Block");
    }
}

public class LaunchClass{
    public static void main(String[] args){
        Demo demo = new Demo();
    }
}

Output:-
Static Block
Non-Static Block

• Rather than creating a object from the above structure it is simpler enough to load the class into application by using Class.forName("Demo");

class Demo{
    static{
        System.out.println("Static Block");
    }

    {
        System.out.println("Non-Static Block");
    }
}

public class LaunchClass{
    public static void main(String[] args){
        Class.forName("Demo");
    }
}

Output:-
Static Block

• In this pattern the respective Class.forName() is used to execute the respective static block information of it.

• When you perform a non select query then the method need to perform is executeUpdate();

• When you perform a select query then the method that need to perform is executeQuery(). The return type for this is a "ResultSet".

• Result set is used to hold the data in the java application just as how the database holds the tables and its records.

• Using Result Set there are few set of operations that need to perform to obtain the data in readable format. The operation specified are .getInt, .next()

• To ensure both the respective executeUpdate() and executeQuery() neeed to handled at once rather than two methods, we can simply use execute() method itself which returns a boolean type.

• For this respective execute() methods there shall be two methods that need to be understood before we proceed ahead they are, getUpdateCount() and getResultSet() these methods ensure that the respective two ways of handling CRUD is done with a single statement.

• Creating a Util for the boilerplate Code to ensure that the methods can be invoked by the Class. Make sure the methods are created by static keyword.

• Create a seperate java file for the Util and make sure these methods in it are invoked by other Java Applications.

• To ensure the data that need to be inserted into the database and has to be dynamically given by the user we need to implement Prepared Statement rather than using Statement.

• Prepared Statement shall allow you to take the respective inputs from the user and perform the ingestion into the database.

• Statement is a Parent object whereas PreparedStatement is a child object. 
    --> For a Statement, it holds a connection object and a method entitled as createStatement();
    --> For a Prepared Statement, it holds a connection object and method entitled as prepareStatement(query);
    --> For a Statement, it is static and need to compile and execute for each CRUD operation to be performed.
    --> For a Prepared Statement, it is dynamic once the respective query is compiled then the input from the user is executed all the time.

• Until now, The operations that are made to the database shall perform each at a time, which causes a lot of performance issues on the database. Such as if you want to perform multiple updates then for the current scenario, the code that was written will be connecting to the database depending upon the number of updates that need to be performed. 