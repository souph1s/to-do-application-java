package com.sophia.to_do_application.repository;

import com.sophia.to_do_application.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
