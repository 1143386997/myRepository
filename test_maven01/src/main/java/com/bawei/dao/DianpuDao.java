package com.bawei.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bawei.pojo.Dianpu;
import com.bawei.pojo.Show;

public interface DianpuDao {
	//查询+分页+模糊
	List<Dianpu> queryDianpus(@Param("dianpu")Dianpu dianpu,@Param("show")Show show,@Param("snames")String[] snames);
	//新增
	int addDianpu(Dianpu dianpu);
	//根据id查询
	Dianpu queryDianpuById(@Param("did")int id);
}
