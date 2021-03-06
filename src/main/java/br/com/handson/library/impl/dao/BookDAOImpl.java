package br.com.handson.library.impl.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import br.com.handson.library.enums.StatusBookEnum;
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

	public List<Book> searchBook(String description) {
			Criteria criteria = getCurrentSession().createCriteria(Book.class);
			criteria.add(Restrictions.eq("status", StatusBookEnum.PUBLISHED));
				Criterion title = Restrictions.ilike("title", description,MatchMode.ANYWHERE);
				Criterion author = Restrictions.ilike("author", description,MatchMode.ANYWHERE);
				LogicalExpression orExpression = Restrictions.or(title,author);
				criteria.add(orExpression);		
				
		return criteria.list();
	}

	
}
