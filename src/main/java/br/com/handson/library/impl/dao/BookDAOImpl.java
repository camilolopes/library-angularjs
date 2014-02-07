package br.com.handson.library.impl.dao;

import org.springframework.stereotype.Repository;

import br.com.handson.library.interfaces.dao.BookDAO;
import br.com.handson.library.modal.domain.Book;
@Repository
public class BookDAOImpl extends GenericHibernateDAO<Book> implements BookDAO {

	public BookDAOImpl() {
		super(Book.class);		
	}

	public Book getById(int id) {
			Book book = (Book) getCurrentSession().get(Book.class, id);
		return book;
	}

	
}
