package com.bawei.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bawei.dao.DianpuDao;
import com.bawei.pojo.Dianpu;
import com.bawei.pojo.Show;
import com.bawei.service.DianpuService;
import com.github.pagehelper.PageHelper;

@Service
public class DianpuServiceImpl implements DianpuService{

	@Resource
	private DianpuDao dianpuDao;
	@Override
	public List<Dianpu> queryDianpus(Dianpu dianpu, Show show,int page,int size,String[] snames) {
		PageHelper.startPage(page, size);
		return dianpuDao.queryDianpus(dianpu, show,snames);
	}
	@Override
	public int addDianpu(Dianpu dianpu) {
		return dianpuDao.addDianpu(dianpu);
	}
	@Override
	public Dianpu queryDianpuById(int id) {
		return dianpuDao.queryDianpuById(id);
	}

}
