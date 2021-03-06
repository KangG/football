package kim.kang.kitri.apply.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kim.kang.kitri.apply.ApplyService;
import kim.kang.kitri.apply.ApplyVO;

@Service
public class ApplyServiceImpl implements ApplyService{
	@Autowired
	ApplyDAO applyDAO;
	@Override
	public List<ApplyVO> myApplyPostList(ApplyVO vo, String PostIdSql) {
		return applyDAO.myApplyPostList(vo, PostIdSql);
	}
	@Override
	public void applyUser(ApplyVO vo) {
		applyDAO.applyUser(vo);
	}
	@Override
	public String myApplyPostIdSql(ApplyVO vo) {
		// TODO Auto-generated method stub
		return applyDAO.myApplyPostIdSql(vo);
	}
	@Override
	public List<ApplyVO> PostApplyUsers(ApplyVO vo) {
		
		return applyDAO.PostApplyUsers(vo);
	}
	@Override
	public void applyStatus_O(int id) {
		applyDAO.applyStatus_O(id);
	}
	
	@Override
	public void applyStatus_N(String id) {
		
		applyDAO.applyStatus_N(id);
	}
	
	
	
	@Override
	public int flag_apply(String id,ApplyVO vo) {
		// TODO Auto-generated method stub
		return applyDAO.flag_apply(id,vo);
	}
	@Override
	public void applyStatus_D(int postID, String applyUserID) {
		applyDAO.applyStatus_D(postID, applyUserID);
	}
	@Override
	public void applyStatus_N(int postID, String applyUserID) {
		applyDAO.applyStatus_N(postID, applyUserID);
	}
	@Override
	public void applyStatus_C(int postID, String applyUserID) {
		applyDAO.applyStatus_C(postID, applyUserID);
	}
}
