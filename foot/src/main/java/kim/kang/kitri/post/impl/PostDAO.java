package kim.kang.kitri.post.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kim.kang.kitri.post.PostVO;

@Repository
public class PostDAO {

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//���� ����Ʈ ���� 
	private final String POST_List = "select * from POST where writer like '%'||?||'%' order by id desc";
	
	public List<PostVO> getPostList(PostVO vo)
	{
		System.out.println("springjdbc�� ���� -�� ��� ��ȸ getBoradList �Լ� ����");
		Object[] args = {vo.getSearchKeyword()};
		if(vo.getSearchCondition().equals("writer"))
		{
			return jdbcTemplate.query(POST_List,args, new PostRowMapper());
			
		}
		
		return null;
	}
	
	
	
	

}