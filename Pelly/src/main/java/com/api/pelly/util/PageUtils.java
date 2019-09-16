package com.api.pelly.util;

import lombok.extern.java.Log;

/**
 * 페이징 처리시 필요한 변수 계산
 * @author hyr
 *
 */
@Log
public class PageUtils {

	
	/**
	 * js에서 필요한 페이징에대한 값들을 세팅해준다.
	 * @param pageNo
	 * @param Count
	 * @return
	 */
	public static PageInfo makePage(int pageNo, int Count) {
		
		int pagePerSize = PageSizeEnum.DEFAULT.getPageSize(); 
		
		log.info("@@@@@ Count%pagePerSize > " + Count%pagePerSize);
		int totalPage = Count%pagePerSize != 0? (Count/pagePerSize) + 1 : Count/pagePerSize;
		log.info("@@@@@ totalPage > " + totalPage);
		log.info("@@@@@ pageNo > " + pageNo);
		
		boolean isFirst = pageNo != 0 ? false : true;
		boolean isLast = pageNo != totalPage-1 ? false : true ; 
		
		if(Count == 0) {
			isLast = true;
		}
		log.info("@@@@@ isFirst > " + isFirst);
		log.info("@@@@@ isLast > " + isLast);
		
		return PageInfo.builder()
						.number(pageNo)
						.totalPages(totalPage)
						.first(isFirst)
						.last(isLast)
						.totalRowCount(Count)
						.pagePerSize(pagePerSize)
						.build();
	}
}
