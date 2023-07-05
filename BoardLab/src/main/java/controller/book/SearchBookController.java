package controller.book;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Controller;

public class SearchBookController implements Controller{
@Override
public String handleRequest(HttpServletRequest request, HttpServletResponse response) {

	return "SearchBook.jsp";
}
}
