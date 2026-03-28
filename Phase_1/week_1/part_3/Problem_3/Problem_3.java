package Phase_1.week_1.part_3.Problem_3;

public class Problem_3 {
    public static void main(String[] args) {
        DatabaseConnector databaseConnector = new MySQLConnector("sql.com", "aditya@gupta", "983515");
        databaseConnector.testConnection();
    }
}

abstract class DatabaseConnector {

    String url;
    String username;
    String password;

    public DatabaseConnector(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    abstract void connect();

    abstract void disconnect();

    final void testConnection() {
        connect();
        System.out.println("checking is compelete : connected sucessfully");
        disconnect();
    }
}

class MySQLConnector extends DatabaseConnector {


    public MySQLConnector(String username, String url, String password) {
        super(url, username, password);

    }

    public void connect() {
        System.out.println("going to Mysql url" + url);
        System.out.println("matching username in mysql : " + username);
        System.out.println("checking you password : " + password);
        System.out.println("Connection Establised with mysql");
    }

    public void disconnect() {
        System.out.println("disconnecting connection to mysql server");
        System.out.println("Disconnected");
    }
}

class PostgresConnector extends DatabaseConnector {


    public PostgresConnector(String username, String url, String password) {
        super(url, username, password);
    }

    public void connect() {
        System.out.println("going to postgres url " + url);
        System.out.println("matching username in postgresconnector: " + username);
        System.out.println("checking you password : " + password);
        System.out.println("Connection Establised with postgresconnector");
    }

    public void disconnect() {
        System.out.println("disconnecting connection to postgres server");
        System.out.println("Disconnected");
    }
}

class MongoConnector extends DatabaseConnector {

    public MongoConnector(String username, String url, String password) {
        super(url, username, password);
    }

    public void connect() {
        System.out.println("going to mongo url " + url);
        System.out.println("matching username in mongoconnector: " + username);
        System.out.println("checking you password : " + password);
        System.out.println("Connection Establised with mongoconnector");
    }

    public void disconnect() {
        System.out.println("disconnecting connection to mongo server");
        System.out.println("Disconnected");
    }
}
