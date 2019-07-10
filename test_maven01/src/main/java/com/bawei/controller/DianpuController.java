package com.bawei.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bawei.pojo.Dianpu;
import com.bawei.pojo.Show;
import com.bawei.service.Dian_showService;
import com.bawei.service.DianpuService;
import com.bawei.service.ShowService;
import com.github.pagehelper.PageInfo;

@Controller
public class DianpuController {

	@Resource
	private DianpuService dianpuService;
	@Resource
	private ShowService showService;
	@Resource
	private Dian_showService dian_showService;
	@RequestMapping("queryDianpu")
	public ModelAndView queryDianpu(Dianpu dianpu,Show show,@RequestParam(value="page",required=false,defaultValue="1")int page,
			@RequestParam(value="size",required=false,defaultValue="3")int size){
		ModelAndView modelAndView = new ModelAndView();
		List<Dianpu> queryDianpus = dianpuService.queryDianpus(dianpu, show, page, size);
		//查询所有商品
		List<Show> queryShows = showService.queryShows();
		modelAndView.addObject("dianpuList", new PageInfo<Dianpu>(queryDianpus));
		modelAndView.addObject("dianpu", dianpu);
		modelAndView.addObject("show", show);
		modelAndView.addObject("showList", queryShows);
		modelAndView.setViewName("list");
		return modelAndView;
	}
	/**
	 *	新增 
	 */
	@RequestMapping("add")
	public ModelAndView add(Dianpu dianpu,String[] sids){
		ModelAndView modelAndView = new ModelAndView();
		//新增店铺
		int addDianpu = dianpuService.addDianpu(dianpu);
		//新增中间表
		Integer did = dianpu.getDid();
		int addDian_Show = dian_showService.addDian_Show(did, sids);
		if(addDianpu>0&&addDian_Show>0){
			modelAndView.setViewName("redirect:/queryDianpu");
		}else{
			modelAndView.addObject("meg", "新增失败,请重新添加");
			modelAndView.setViewName("add");
		}
		return modelAndView;
	}
}
