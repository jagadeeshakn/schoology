package com.power.schoology.service;

import com.power.schoology.model.ResponseData;

/**
 * 
 * @author jkn
 */
public interface SchoologyService {

	/**
	 * @param searchKey
	 * @return
	 */
	ResponseData getSearchResult(String searchKey);

}
