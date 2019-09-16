package com.api.pelly.model.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.api.pelly.util.PageInfo;

import lombok.Data;

/**
 * 페이징처리된 response 객체
 * @author hyr
 *
 */

@Data
public class CommonPageResponse {

	List<?> list;
	PageInfo pageInfo;
	Map<String, Object> map = new HashMap<String, Object>();
	
}
