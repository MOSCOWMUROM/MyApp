package org.example.database;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConnectionPool {
    private final String user;
    private final String password;
    private final String url;

    public ConnectionPool(@Value("${hibernate.connection.user}") String user,
                          @Value("${hibernate.connection.password}") String password,
                          @Value("${hibernate.connection.url}") String url) {
        this.user = user;
        this.password = password;
        this.url = url;
    }
}
