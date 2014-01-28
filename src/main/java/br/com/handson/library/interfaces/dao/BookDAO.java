package br.com.handson.library.interfaces.dao;

import org.springframework.transaction.annotation.Transactional;

import br.com.handson.library.modal.domain.Book;

public interface BookDAO extends GenericDAO<Book> {
	@Transactional
	Book searchbook(String titleBook);

}
