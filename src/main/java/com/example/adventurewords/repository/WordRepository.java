package com.example.adventurewords.repository;

import com.example.adventurewords.model.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing Word entities.
 *
 * This interface extends JpaRepository, which provides
 * built-in CRUD operations such as:
 * - save()
 * - findById()
 * - findAll()
 * - deleteById()
 *
 * Spring Data JPA will automatically generate the implementation
 * at runtime using proxy objects and reflection.
 */
@Repository
public interface WordRepository extends JpaRepository<Word, Long> {

    /**
     * You can define custom query methods here if needed.
     *
     * Example:
     * List<Word> findByText(String text);
     */

}
