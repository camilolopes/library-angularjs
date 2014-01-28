package br.com.handson.library.impl.services;

import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import br.com.handson.library.interfaces.dao.BookDAO;
import br.com.handson.library.interfaces.services.BookService;
import br.com.handson.library.interfaces.services.GenericServiceImpl;
import br.com.handson.library.modal.domain.Book;

@Service
public class BookServiceImpl extends GenericServiceImpl<Book, BookDAO> implements BookService {

	@Autowired
	@Qualifier("bookDAOImpl")
	@Override
	public void setDao(BookDAO dao) {
		super.setDao(dao);
	}

	@Override
	public void save(Book entity) {
		String titleBook=entity.getTitle();
		Book book= getDao().searchbook(titleBook);
		if(book!=null){
			throw new HibernateException("Title already exists");
		}
		getDao().saveOrUpdate(book);
	}
}
