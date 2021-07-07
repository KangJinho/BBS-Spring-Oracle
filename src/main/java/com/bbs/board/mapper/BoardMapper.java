package com.bbs.board.mapper;

import java.util.List;

import com.bbs.board.vo.BoardVO;
import com.webjjang.util.PageObject;

public interface BoardMapper {
	public List<BoardVO> list(PageObject pageObject);
}
