package com.tomassirio.vuejs.springboot.repository;

import com.tomassirio.vuejs.springboot.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TodoRepository extends JpaRepository<Todo, Long> {}