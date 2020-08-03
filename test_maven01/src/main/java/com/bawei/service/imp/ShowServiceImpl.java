package com.bawei.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bawei.dao.ShowDao;
import com.bawei.pojo.Show;
import com.bawei.service.ShowService;

@Service
public class ShowServiceImpl implements ShowService{

	@Resource
	private ShowDao showDao;
	@Override
	public List<Show> queryShows() {
		return showDao.queryShows();
	}

}
