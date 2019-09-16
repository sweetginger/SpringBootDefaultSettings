package com.api.pelly.model.cms;

import com.api.pelly.model.common.CommonDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * CMS 게시글
 * @author hyr
 *
 */

@Getter @Setter
@Builder
@AllArgsConstructor @NoArgsConstructor
public class CmsArticleDto extends CommonDto {

	/* 게시글번호 */
	private int articleSeq;
		
	/* 게시글 제목 */
	private String title;
	
	/* 게시글 내용 */
	private String content;
	
	/* 부모게시글 번호 */
	private int parentArticleSeq;
	
	/* CMS 번호 */
	private int cmsSeq;
	
	/* 게시글 유형 */
	private int articleType;
	
	/* 공지 여부 */
	private String noticeYn;
	
	/* 조회수 */
	private int hit;
	
	/* 작성자 */
	private int regUser;
	
	/* 수정자 */
	private int updUser;
	
	private String extVal1;
	
	private String extVal2;
	
	private String extVal3;
	
	private String extVal4;
	
	private String extVal5;
	
}
