package com.spring.myexam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.myexam.dao.BookDAO;
import com.spring.myexam.entity.Book;

@Controller
public class BookController 
{
	BookDAO bdao;
	@Autowired
	BookController(BookDAO bdao)
	{
		this.bdao=bdao;
	}
	@GetMapping("/bookPage")
	public String getEmpPage(Model model)
	{
		model.addAttribute("book",new Book(0,"",0.0,""));
		return "DisplayBook";
	}
	@GetMapping("/bookCRUD")
	public String bookCRUD(@RequestParam("sub")String sub,@RequestParam("bid")int bid,@RequestParam("btitle")String btitle,@RequestParam("price")double price,@RequestParam("author")String author,RedirectAttributes ra)
	{
		ra.addFlashAttribute("book",new Book(bid,btitle,price,author));
		String val="";
		if(sub.equals("Add_Book")) val="addBook";
		else if(sub.equals("Del_Book")) val="deleteBook";
		else if(sub.equals("Mod_Book")) val="modifyBook";
		else val="getBook";
		return "redirect:"+val;
	}
	@GetMapping("/addBook")
	public String addBook(@ModelAttribute("book")Book b)
	{
		bdao.insertBook(new Book(b.getBid(),b.getBtitle(),b.getPrice(),b.getAuthor()));
		return "DisplayBook";	
	}
	@GetMapping("/modifyBook")
	public String modifyEmployee(@ModelAttribute("book")Book b)
	{
		bdao.modifyBook(new Book(b.getBid(),b.getBtitle(),b.getPrice(),b.getAuthor()));
		return "DisplayBook";	
	}
	@GetMapping("/deleteBook")
	public String deleteBook(@ModelAttribute("book")Book b)
	{
		bdao.deleteBook(b.getBid());
		return "DisplayBook";
	}
	@GetMapping("/getBook")
	public String getBook(@ModelAttribute("book")Book b,Model model)
	{
		Book b1=bdao.getBook(b.getBid());
		model.addAttribute("book",b1);
		return "DisplayBook";
	}

}
