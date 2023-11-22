package com.arquimentor.platform.payments.repository;

import com.arquimentor.platform.payments.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
    Optional<Article> findByName(String name);
    boolean existsByName(String name);
}
