package com.api.pelly.model.cms;

import com.api.pelly.model.common.CommonDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * CMS 댓글
 * @author hyr
 *
 */

@Getter @Setter
@Builder
@AllArgsConstructor @NoArgsConstructor
public class CmsCommentDto extends CommonDto {

	/* 댓글 번호 */
	private int commentSeq;
	
	/* 게시글 번호 */
	private int articleSeq;
	
	/* 부모댓글 번호 */
	private int parentCommentSeq;
	
	/* 등록자 */
	private int regUser;
	
	/* 수정자 */
	private int updUser;
	
}
