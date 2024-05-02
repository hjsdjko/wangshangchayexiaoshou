package com.entity.view;

import com.entity.ChayeEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 茶叶
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("chaye")
public class ChayeView extends ChayeEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 茶叶类型的值
		*/
		private String chayeValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public ChayeView() {

	}

	public ChayeView(ChayeEntity chayeEntity) {
		try {
			BeanUtils.copyProperties(this, chayeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 茶叶类型的值
			*/
			public String getChayeValue() {
				return chayeValue;
			}
			/**
			* 设置： 茶叶类型的值
			*/
			public void setChayeValue(String chayeValue) {
				this.chayeValue = chayeValue;
			}
			/**
			* 获取： 是否上架的值
			*/
			public String getShangxiaValue() {
				return shangxiaValue;
			}
			/**
			* 设置： 是否上架的值
			*/
			public void setShangxiaValue(String shangxiaValue) {
				this.shangxiaValue = shangxiaValue;
			}











}
