package br.com.handson.library.interfaces.dao;

import java.util.List;

import br.com.handson.library.modal.domain.Book;

public interface BookDAO extends GenericDAO<Book> {

	Book getById(int id);

	List<Book> searchBook(String description);

}
