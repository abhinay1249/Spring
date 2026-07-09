# Introduction

JDBC refers to Java DataBase Connectivity.

• It is the process where a respective Java application program was executed the resepctive data was stored in RAM which is a temporary storage area. Incase, if the application data need to be stored permanently, then either on hard disk or in a database the data is stored.
• If the resepective application is prefered to store in hard disk then it would I/O, file handling, storing the entire data in file which is stored in the hard disk itself.
• In order to store application in the database, JDBC is essential to perform the CRUD operations.

# Steps Involved in Developed JDBC Application

1. Import the required package (Also download & Add Database specific jar into the project).
2. Load and Register the respective database driver.
3. Establish a connection.
4. Create a statement.
5. Execute the query.
6. Process the Result.
7. Close the Connection.


# References from the Code

• Class.forName("net.snowflake.client.api.driver.SnowflakeDriver");
