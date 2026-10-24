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

• R

