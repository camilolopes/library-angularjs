package br.com.handson.library.impl.services;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.handson.library.dbunit.config.DBUnitConfiguration;
import br.com.handson.library.enums.StatusBookEnum;
import br.com.handson.library.interfaces.services.BookService;
import br.com.handson.library.modal.domain.Book;

@RunWith(SpringJUnit4ClassRunner.class)
public class BookServiceImplATest extends DBUnitConfiguration {
	
	@Autowired
	@Qualifier("bookServiceImpl")
	private BookService bookServiceImpl;
	
	@Before
	public void setUp() throws Exception {
		getSetUpOperation().execute(getConnection(), getDataSet());
	}

	@Test
	public void testSaveBookWithSuccessAnyExceptionThrow() {
		Book bookAngularJS = getInstanceBook();
		try{
			bookServiceImpl.save(bookAngularJS);
		}catch(Exception e){
			e.printStackTrace();
			fail("Not expected result");
		}
	}
	
	@Test
	public void testGetBookById(){
		int id=1;
		Book book = bookServiceImpl.getById(id);
		assertNotNull(book);
	}
	

	private Book getInstanceBook() {
		Book bookAngularJS = new Book();
		bookAngularJS.setTitle("AngularJS na Prática");
		bookAngularJS.setAuthor("Camilo Lopes");
		bookAngularJS.setCoverUrl("http://www.bookshandson.com.br/bookcover.png");
		bookAngularJS.setStatus(StatusBookEnum.PUBLISHED);
		bookAngularJS.setTotalPage(150);
		bookAngularJS.setYearPublished("2014");
		return bookAngularJS;
	}

	public BookService getBookServiceImpl() {
		return bookServiceImpl;
	}

}
