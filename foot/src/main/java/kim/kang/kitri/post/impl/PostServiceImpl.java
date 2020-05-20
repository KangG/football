package kim.kang.kitri.post.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kim.kang.kitri.post.PostService;
import kim.kang.kitri.post.PostVO;

@Service
public class PostServiceImpl implements PostService {

	
	@Autowired
	private PostDAO postDAO;
	

	
	
	public List<PostVO> getPostSearchList(PostVO vo) {
		
		return postDAO.getPostSearchList(vo);
	}
	
	
   public List<PostVO> getPostList(PostVO vo) {
		
		return postDAO.getPostList(vo);
	}
   
   
   //�۵��
   public void InsertList(PostVO vo)
   {
	   postDAO.PostInsertList(vo);
	  // return postDAO.
   }
   
	
}
