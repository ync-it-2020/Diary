package org.zero.mapper;

import java.util.List;


import org.zero.domain.Board_listVO;
import org.zero.domain.Criteria;

public interface Board_listMapper {
	//@Select("select * from list_baord where num > 0")
	public List<Board_listVO> getList();
	
	public List<Board_listVO> getListWithPaging(Criteria cri);
	
	public Board_listVO getread();
	
	public void insert(Board_listVO board_list);
	
	public void insertSelectkey(Board_listVO board_list);
	
	public Board_listVO read(Long num);
	
	public int remove(Long num);
	
	public int update(Board_listVO board_list);

}
