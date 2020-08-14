package com.yxgy.weixin.utils;

import lombok.Data;

import java.util.List;

/**
 * @Description: 封装分页后的数据格式
 */
@Data
public class PagedResult {
	
	private int page;			// 当前页数
	private int total;			// 总页数	
	private long rows;		// 总记录数
	private List<?> records;		// 每行显示的内容
	


}
