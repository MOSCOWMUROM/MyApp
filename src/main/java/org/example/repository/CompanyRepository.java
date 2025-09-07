package org.example.repository;

import org.example.database.ConnectionPool;
import org.example.models.Company;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.random.RandomGenerator;
@Repository
@Transaction
public class CompanyRepository implements CrudRepository<Company> {
    private final ConnectionPool connectionPool;

    public CompanyRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    @Override
    public Optional<Company> findById(Long id) {
        System.out.println("findById...");
        return Optional.of(new Company());
    }

    @Override
    public Long delete(List<Company> entity) {
        return RandomGenerator.ArbitrarilyJumpableGenerator.of("name").nextLong();
    }
}
