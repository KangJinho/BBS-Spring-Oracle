package com.bbs.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bbs.board.service.BoardService;
import com.webjjang.util.PageObject;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	@GetMapping("/list.do")
	//model 안에 request가 있다 model에 데이터를 저장하면 request에 저장된다
	public String list(PageObject pageObject, Model model) {
		System.out.println("BoardContoller.list()");
		model.addAllAttributes(service.list(pageObject));
		
		return "board/list";
	}
}
