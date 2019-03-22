package com.cts.connect_project.service;

import java.util.List;

import com.cts.connect_project.bean.Resource;
import com.cts.connect_project.dao.ResourceDAO;
import com.cts.connect_project.dao.ResourceDAOImpl;

public class ResourceServiceImpl implements ResourceService {

	ResourceDAO resourceDAO = new ResourceDAOImpl(); 
	@Override
	public int addResource(Resource resource) {
		// TODO Auto-generated method stub
		return resourceDAO.addResource(resource);
	}
	
	@Override
	public List<Resource> getAllResource() {
		// TODO Auto-generated method stub
		return resourceDAO.getAllResource();
	}

}
