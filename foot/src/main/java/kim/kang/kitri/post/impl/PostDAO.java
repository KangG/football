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
	
	
	//�׳���ȸ
	private final String POST_List ="select * from POST";
	
	//�˻� ��ȸ
	private final String POST_Search_List = "select * from POST where writer like '%'||?||'%' order by id desc";
	
	//
	private final String POST_Insert 
	="insert into POST(ID,WRITER,DATETIME,PER,CONTENT,STATUS,ZIP_CODE,ADDRESS,ADDRESS_DETAIL) "
			+ "values(POST_SEQ.NEXTVAL,?,?,?,?,'Y',?,?,?)";
	
	
	public List<PostVO> getPostSearchList(PostVO vo)
	{
		System.out.println("springjdbc�� ���� -�� ��� ��ȸ getSearchList �Լ� ����");
		Object[] args = {vo.getSearchKeyword()};
		if(vo.getSearchCondition().equals("writer"))
		{
			return jdbcTemplate.query(POST_Search_List,args, new PostRowMapper());
			
		}
		
		return null;
	}
	
	
	public List<PostVO> getPostList(PostVO vo)
	{
		System.out.println("dfdfdfdfdfdfdf");

			return jdbcTemplate.query(POST_List, new PostRowMapper());
			
			
	}
	
	
	
	public void PostInsertList(PostVO vo)
	{
	
			jdbcTemplate.update(POST_Insert,vo.getWriter(),vo.getDATETIME(),vo.getPER(),vo.getCONTENT()
					,vo.getZIP_CODE(),vo.getADDRESS(),vo.getADDRESS_DETAIL());
			
	}
	
	

}
