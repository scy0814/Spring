package controller.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.board.BoardDAO;
import biz.board.BoardVO;
import controller.Controller;

public class GetBoardListController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		BoardVO vo= new BoardVO();
		BoardDAO dao = new BoardDAO();
		List<BoardVO> boardList = dao.getBoardList(vo);
		request.setAttribute("boardList", boardList);
		
		return "GetBoardList.jsp" ;
	}

}
