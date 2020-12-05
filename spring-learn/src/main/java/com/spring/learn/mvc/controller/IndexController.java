package com.spring.learn.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author machenggong
 * @date 2020/12/05
 */
@Controller
public class IndexController {

	@GetMapping("index")
	@ResponseBody
	public String index(){
		return "index";
	}

}
