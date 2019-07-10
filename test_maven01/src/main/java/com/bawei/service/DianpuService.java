package com.bawei.service;

import java.util.List;

import com.bawei.pojo.Dianpu;
import com.bawei.pojo.Show;

public interface DianpuService {
	//查询+分页+模糊
	List<Dianpu> queryDianpus(Dianpu dianpu,Show show,int page,int size);
	//新增
	int addDianpu(Dianpu dianpu);
}
