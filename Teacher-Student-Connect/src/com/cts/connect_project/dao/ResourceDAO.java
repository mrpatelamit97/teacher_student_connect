package com.cts.connect_project.dao;

import java.util.List;

import com.cts.connect_project.bean.Resource;

public interface ResourceDAO {
	
	public int addResource(Resource resource);
	public List<Resource> getAllResource();

}
