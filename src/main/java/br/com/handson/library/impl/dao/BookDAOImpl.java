package br.com.handson.library.impl.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.handson.library.interfaces.dao.BookDAO;
import br.com.handson.library.modal.domain.Book;
@Repository
public class BookDAOImpl extends GenericHibernateDAO<Book> implements BookDAO {

	public BookDAOImpl() {
		super(Book.class);		
	}

	@Transactional
	public Book searchbook(String titleBook) {
			Session currentSession = getCurrentSession();
			Criteria criteria = currentSession.createCriteria(Book.class);
			criteria.add(Restrictions.ilike("title", titleBook));
		Book book = (Book) criteria.uniqueResult();
		return book;
	}
	
}
