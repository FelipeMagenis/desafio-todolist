package br.com.felipemagenis.desafiotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.felipemagenis.desafiotodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
