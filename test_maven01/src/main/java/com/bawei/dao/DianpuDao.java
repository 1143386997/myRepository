package com.bawei.dao;

import java.util.List;

import com.bawei.pojo.Dianpu;
import com.bawei.pojo.Show;

public interface DianpuDao {
	//查询+分页+模糊
	List<Dianpu> queryDianpus(Dianpu dianpu,Show show);
	//新增
	int addDianpu(Dianpu dianpu);
}
