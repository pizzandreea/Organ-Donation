package service;

import service.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import service.Connection;

public final class DBConnection {
    private final String userName;
    private final String password;
    private final String url;
    private final Connection connection;

    public DBConnection(String userName, String password, String url) {
        this.userName = userName;
        this.password = password;
        this.url = url;
        this.connection = new Connection(userName, password, url);
    }

    public Connection getConnection(){
        return connection;
    }
}
