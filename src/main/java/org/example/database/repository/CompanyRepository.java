package org.example.database.repository;

import lombok.RequiredArgsConstructor;
import org.example.bpp.Transaction;
import org.example.database.pool.ConnectionPool;
import org.example.database.entity.Company;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.random.RandomGenerator;

@Repository
@Transaction
@RequiredArgsConstructor
public class CompanyRepository implements CrudRepository<Company>{
    private final ConnectionPool connectionPool;

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
