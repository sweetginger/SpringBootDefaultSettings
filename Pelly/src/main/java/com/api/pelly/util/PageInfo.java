package com.api.pelly.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 페이지 response 유틸
 * @author hyr
 *
 */
@Builder
@Setter @Getter
@AllArgsConstructor @NoArgsConstructor
public class PageInfo {

	private Integer number;
	private Integer totalPages;
	private Boolean first;
	private Boolean last;
	private Integer totalRowCount;
	private Integer pagePerSize;
	
}
