package kim.kang.kitri.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kim.kang.kitri.post.PostService;
import kim.kang.kitri.post.PostVO;


@Controller
public class PostController {


	@Autowired
	private PostService postservice;
	
	
	// ���� ���� ����Ʈ 
	@RequestMapping("/home.do")
	public String getPostList(PostVO vo, Model model){ // handleRequest(HttpServletRequest request, HttpServletResponse response) 
		
	
		model.addAttribute("postlist", postservice.getPostList(vo));
		
		return "index.jsp";
	}
	
	
	// �˻� ã�� ���� 
	@RequestMapping("/PostSearchList.do")
	public String getPostSearchList(@RequestParam(value = "searchCondition", defaultValue = "writer", required = false)
	String contition,@RequestParam(value = "searchKeyword", defaultValue = "", required = false) String keyword, 
	PostVO vo, Model model){ // handleRequest(HttpServletRequest request, HttpServletResponse response) 
		
		System.out.println("postlist.do ");
		if(vo.getSearchCondition() ==null) vo.setSearchCondition("writer");
		if(vo.getSearchKeyword()==null) vo.setSearchKeyword("");
		
		System.out.println(keyword);
		System.out.println(contition);
		model.addAttribute("postlist", postservice.getPostSearchList(vo));
		
		return "index.jsp";
	}	
	
	
	
	@RequestMapping("/PostInsertPage.do")
	public String InsertListPage() {
		
	
		
		
		return "post/postInsert.jsp";
	}
	
	
	
	//�Խñ� ����ϱ� -> ����ϰ� �������� �Ѿ�� 
	@RequestMapping("/PostInsert.do")
	public String InsertList(HttpServletRequest request,PostVO vo) {
		
	
		HttpSession session = request.getSession();
		System.out.println(session.getAttribute("userID"));
		vo.setWRITER((String)session.getAttribute("userID"));
		
		postservice.InsertList(vo);
		
		return "home.do";
	}
	
	
	
	
	
	
}
