package com.bawei.service.imp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bawei.dao.Dian_showDao;
import com.bawei.service.Dian_showService;

@Service
public class Dian_showServiceImpl implements Dian_showService{

	@Resource
	private Dian_showDao dian_showDao;
	@Override
	public int addDian_Show(int did, String[] sids) {
		return dian_showDao.addDian_Show(did, sids);
	}

}
