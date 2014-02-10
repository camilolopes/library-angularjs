package br.com.handson.library.interfaces.services;

import java.util.List;

import br.com.handson.library.modal.domain.Book;

public interface BookService extends GenericService<Book> {

	Book getById(int id);

	List<Book> search(String description);

}
