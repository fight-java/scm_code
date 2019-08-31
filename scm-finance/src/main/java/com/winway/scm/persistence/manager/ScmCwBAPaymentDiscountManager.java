package com.winway.scm.persistence.manager;

import com.hotent.base.manager.Manager;
import com.hotent.base.query.PageList;
import com.hotent.base.query.QueryFilter;
import com.winway.scm.model.ScmCwBAPaymentDiscount;

import javax.servlet.http.HttpServletResponse;

/**
 * 
 * <pre> 
 * 描述：经销商RB核算付款折扣 处理接口
 * 构建组：x7
 * 作者:原浩
 * 邮箱:PRD-jun.he@winwayworld.com
 * 日期:2019-05-09 18:18:05
 * 版权：美达开发小组
 * </pre>
 */
public interface ScmCwBAPaymentDiscountManager extends Manager<String, ScmCwBAPaymentDiscount>{

	PageList<ScmCwBAPaymentDiscount> affirmList(QueryFilter queryFilter);

    void exportCheckSum(QueryFilter queryFilter, HttpServletResponse response);
}