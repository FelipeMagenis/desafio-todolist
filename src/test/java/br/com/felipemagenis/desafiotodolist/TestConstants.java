package br.com.felipemagenis.desafiotodolist;

import java.util.ArrayList;
import java.util.List;

import br.com.felipemagenis.desafiotodolist.entity.Todo;

public class TestConstants {
	  public static final List<Todo> TODOS = new ArrayList<>() {
	    {
	      add(new Todo(9995L, "Prova", "Fazer", false, 1));
	      add(new Todo(9996L, "Trabalho", "Terminar", false, 1));
	      add(new Todo(9997L, "Documentar APIs e endpoints", "Hoje", false, 1));
	      add(new Todo(9998L, "Refatorar código para melhorar a performance", "Final de Semana", false, 1));
	      add(new Todo(9999L, "Atualizar bibliotecas e dependências", "Testes", false, 1));
	    }
	  };

	  public static final Todo TODO = TODOS.get(0);
	}
