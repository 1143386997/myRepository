package com.bawei.dao;

import org.apache.ibatis.annotations.Param;

public interface Dian_showDao {
	//新增
	int addDian_Show(@Param("did")int did,@Param("sids")String[] sids);
}
