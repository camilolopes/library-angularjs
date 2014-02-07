package br.com.handson.library.impl.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	public Book getById(int id) {
		
		return getDao().getById(id);
	}


}
