package com.bawei.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bawei.pojo.Show;
import com.bawei.service.ShowService;

@Controller
public class ShowController {

	@Resource
	private ShowService showService;
	
	@RequestMapping("show")
	public @ResponseBody List<Show> show(){
		List<Show> queryShows = showService.queryShows();
		return queryShows;
	}
}
