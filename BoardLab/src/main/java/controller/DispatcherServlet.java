package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
      private HandlerMapping mapping;
         
    public DispatcherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public void init() throws ServletException {
       mapping = new HandlerMapping();
    }
    
   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      process(request, response);
   
   }

   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      request.setCharacterEncoding("utf-8");
      process(request, response);   
   }
   protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String uri = request.getRequestURI();
      String path = uri.substring(uri.lastIndexOf("/"));  // 추출
      
      Controller ctrl = mapping.getController(path);
      String viewPage = ctrl.handleRequest(request, response); //login.html 리턴받으면 뷰페이지로 넘어감 그게 다시 rd로 가서 포워드받고 login.html이 켜지는구조
      
      if(viewPage.startsWith("redirect:")) {
    	response.sendRedirect(viewPage.substring("redirect:".length()));  
      } else {
      RequestDispatcher rd = request.getRequestDispatcher(viewPage);
      rd.forward(request, response);
      }
      
   }
}