package com.api.pelly.util;

import lombok.Getter;
import lombok.Setter;

/**
 * 페이징 한페이지에 보여줄 숫자 공통
 * @author hyr
 *
 */

public enum PageSizeEnum {

	PAGE3(3),
	PAGE5(5),
	PAGE10(10),
	PAGE15(15),
	PAGE20(20),
	DEFAULT(10)
	;
	
	@Getter @Setter
	private int pageSize;
	
	private PageSizeEnum(int pageSize) {
		this.pageSize = pageSize;
	}
}

