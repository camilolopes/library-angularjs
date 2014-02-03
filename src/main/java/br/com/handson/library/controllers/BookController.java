package br.com.handson.library.controllers;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import br.com.handson.library.interfaces.services.BookService;
import br.com.handson.library.modal.domain.Book;

@Controller
@Path("/book")
public class BookController {
	
	@Autowired
	@Qualifier("bookServiceImpl")
	private BookService bookServiceImpl;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void save(Book book){
		bookServiceImpl.save(book);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Book> getListBooks(){
		return bookServiceImpl.listAll();
	}
	public BookService getBookServiceImpl() {
		return bookServiceImpl;
	}
	
}
