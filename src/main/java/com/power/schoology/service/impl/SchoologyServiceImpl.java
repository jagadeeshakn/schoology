package com.power.schoology.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.power.schoology.model.ResponseData;
import com.power.schoology.service.SchoologyService;

/**
 * 
 * @author jkn
 */
@Service
public class SchoologyServiceImpl implements SchoologyService {

	@Override
	public ResponseData getSearchResult(String searchKey) {
		ResponseData data = new ResponseData();
		if (!StringUtils.isEmpty(searchKey)) {
			data.setResponse("Search key found");
		} else {
			data.setResponse("Search key not found");
		}

		return data;
	}

}
