package com.wcl.demo.dao.mybatis;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IDataMapper {

	public List<Map<String, Object>> getStudent();
}
