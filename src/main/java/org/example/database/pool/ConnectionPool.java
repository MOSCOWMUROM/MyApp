package org.example.database.pool;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ConnectionPool {
    @Value("#{environment['hibernate.connection.user']}")
    private final String user;

    @Value("#{environment['hibernate.connection.password']}")
    private final String password;

    @Value("#{environment['hibernate.connection.url']}")
    private final String url;
}
