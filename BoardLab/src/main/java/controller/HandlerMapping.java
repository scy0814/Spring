package controller;

import java.util.HashMap;
import java.util.Map;

import controller.board.BoardMainPageController;
import controller.board.DeleteBoardController;
import controller.board.GetBoardController;
import controller.board.GetBoardListController;
import controller.board.InsertBoardController;
import controller.board.LoginProcessController;
import controller.board.MainPageController;
import controller.board.MyInfoController;
import controller.board.SearchBoardController;
import controller.board.UpdateBoardController;
import controller.book.GetBookListController;
import controller.book.SearchBookController;
import controller.manager.DeleteBookController;
import controller.manager.DeleteBookProcessController;
import controller.manager.DeleteUserProcessController;
import controller.manager.GetUserListController;
import controller.manager.GetUserRentalListController;
import controller.manager.InsertBookController;
import controller.manager.InsertBookProcessController;
import controller.user.ChangeInfoController;
import controller.user.InsertUserController;
import controller.user.InsertUserProcessController;
import controller.user.LoginController;
import controller.user.LogoutController;
import controller.user.MyPageMainPageController;
import controller.user.RentBookController;
import controller.user.GetRentalListController;
import controller.user.RentBookProcessController;
import controller.user.ReturnBookController;
import controller.user.ReturnBookProcessController;
import controller.user.UpdateInfoController;
import controller.user.UserOutController;
import controller.user.UserOutProcessController;

public class HandlerMapping {

	private Map<String, Controller> mappings;
	public HandlerMapping() {
		mappings = new HashMap<String, Controller>();
		mappings.put("/insertUser.do", new InsertUserController());
		mappings.put("/insertUserProcess.do", new InsertUserProcessController());
		mappings.put("/Login.do", new LoginController());
		mappings.put("/LoginProcess.do", new LoginProcessController());
		mappings.put("/logout.do", new LogoutController());
		mappings.put("/insertBoard.do", new InsertBoardController());
		mappings.put("/insertBook.do", new InsertBookController());
		mappings.put("/insertBookProcess.do", new InsertBookProcessController());
		mappings.put("/getBoardList.do", new GetBoardListController());
		mappings.put("/getBookList.do", new GetBookListController());
		mappings.put("/updateBoard.do", new UpdateBoardController());
		mappings.put("/deleteBoard.do", new DeleteBoardController());
		mappings.put("/getBoard.do", new GetBoardController());
		mappings.put("/searchBoard.do", new SearchBoardController());
		mappings.put("/mainPage.do", new MainPageController());
		mappings.put("/myPageMainPage.do", new MyPageMainPageController());
		mappings.put("/myInfo.do", new MyInfoController());
		mappings.put("/changeInfo.do", new ChangeInfoController());
		mappings.put("/updateInfo.do", new UpdateInfoController());
		mappings.put("/boardMainPage.do", new BoardMainPageController());
		mappings.put("/userOutProcess.do", new UserOutProcessController());
		mappings.put("/userOut.do", new UserOutController());
		mappings.put("/searchBook.do", new SearchBookController());
		mappings.put("/getUserList.do", new GetUserListController());
		mappings.put("/deleteBook.do", new DeleteBookController());
		mappings.put("/deleteBookProcess.do", new DeleteBookProcessController());
		mappings.put("/deleteUserProcess.do", new DeleteUserProcessController());
		mappings.put("/rentBook.do", new RentBookController());
		mappings.put("/rentBookProcess.do", new RentBookProcessController());
		mappings.put("/getRentalList.do", new GetRentalListController());
		mappings.put("/returnBook.do", new ReturnBookController());
		mappings.put("/returnBookProcess.do", new ReturnBookProcessController());
		mappings.put("/getUserRentalList.do", new GetUserRentalListController());
		
	}
	public Controller getController(String path) {
		return mappings.get(path); 
	}
}
