package com.api.pelly.model.cms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * CMS 게시글 조회 로그
 * @author hyr
 *
 */

@Getter @Setter
@Builder
@AllArgsConstructor @NoArgsConstructor
public class CmsArticleReaderDto {

	/* 게시글 번호 */
	private int articleSeq;
	
	/* 유저 번호 */
	private int agentSeq;
	
	/* 등록일 */
	private String regDate;
	
	/* 조회수 */
	private int cnt;
	
}
