package com.wcl.demo.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wcl.demo.dao.mybatis.IDataMapper;
import com.wcl.demo.service.IWebService;

@Service("webService")
public class WebServiceImpl implements IWebService {

	@Autowired
	private IDataMapper dataMapper;
	
	@Override
	public List<Map<String, Object>> getStudent() {
		// TODO Auto-generated method stub
		return dataMapper.getStudent();
		/*List<Map<String, Object>> list = new ArrayList<>();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "陈独秀");
		list.add(map);
		return list;*/
	}

}
