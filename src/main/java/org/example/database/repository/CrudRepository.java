package org.example.database.repository;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<T> {
    Optional<T> findById(Long id);

    Long delete(List<T> entity);
}
