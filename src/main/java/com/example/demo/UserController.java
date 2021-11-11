package com.example.demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.services.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	// 使用 query String return index頁面
	// 進入 /MyFirstPage 會看到 "我的第一個頁面QQ"
	// 進入 /MyFirstPage?title=呱呱 會看到 "呱呱"
	@RequestMapping("/MyFirstPage")
	public String greeting(@RequestParam(value="title", required=false, defaultValue="我的第一個頁面QQ") String title, Model model) {
		model.addAttribute("name", title);
		return "index";
	}
	
	// 使用 controller 呼叫 service 的 function 範例
	// 同樣是 return index 頁面	
	@GetMapping("/")
		public String index(Map<String, Object> model) {
		model.put("ID", userService.getUserId());
		return "index";
	}
	
}
