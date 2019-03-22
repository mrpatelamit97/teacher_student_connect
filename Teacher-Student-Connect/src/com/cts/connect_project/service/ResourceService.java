package com.cts.connect_project.service;

import java.util.List;

import com.cts.connect_project.bean.Resource;

public interface ResourceService {
	public int addResource(Resource resource);
	public List<Resource> getAllResource();

}
