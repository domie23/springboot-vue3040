package com.entity.view;

import com.entity.CaipinCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 餐厅菜品收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("caipin_collection")
public class CaipinCollectionView extends CaipinCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String caipinCollectionValue;



		//级联表 caipin
			/**
			* 菜品名称
			*/
			private String caipinName;
			/**
			* 菜品图片
			*/
			private String caipinPhoto;
			/**
			* 菜品类型
			*/
			private Integer caipinTypes;
				/**
				* 菜品类型的值
				*/
				private String caipinValue;
			/**
			* 价格
			*/
			private Double caipinMoney;
			/**
			* 赞
			*/
			private Integer zanNumber;
			/**
			* 踩
			*/
			private Integer caiNumber;
			/**
			* 菜品详情
			*/
			private String caipinContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public CaipinCollectionView() {

	}

	public CaipinCollectionView(CaipinCollectionEntity caipinCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, caipinCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getCaipinCollectionValue() {
				return caipinCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setCaipinCollectionValue(String caipinCollectionValue) {
				this.caipinCollectionValue = caipinCollectionValue;
			}




				//级联表的get和set caipin

					/**
					* 获取： 菜品名称
					*/
					public String getCaipinName() {
						return caipinName;
					}
					/**
					* 设置： 菜品名称
					*/
					public void setCaipinName(String caipinName) {
						this.caipinName = caipinName;
					}

					/**
					* 获取： 菜品图片
					*/
					public String getCaipinPhoto() {
						return caipinPhoto;
					}
					/**
					* 设置： 菜品图片
					*/
					public void setCaipinPhoto(String caipinPhoto) {
						this.caipinPhoto = caipinPhoto;
					}

					/**
					* 获取： 菜品类型
					*/
					public Integer getCaipinTypes() {
						return caipinTypes;
					}
					/**
					* 设置： 菜品类型
					*/
					public void setCaipinTypes(Integer caipinTypes) {
						this.caipinTypes = caipinTypes;
					}


						/**
						* 获取： 菜品类型的值
						*/
						public String getCaipinValue() {
							return caipinValue;
						}
						/**
						* 设置： 菜品类型的值
						*/
						public void setCaipinValue(String caipinValue) {
							this.caipinValue = caipinValue;
						}

					/**
					* 获取： 价格
					*/
					public Double getCaipinMoney() {
						return caipinMoney;
					}
					/**
					* 设置： 价格
					*/
					public void setCaipinMoney(Double caipinMoney) {
						this.caipinMoney = caipinMoney;
					}

					/**
					* 获取： 赞
					*/
					public Integer getZanNumber() {
						return zanNumber;
					}
					/**
					* 设置： 赞
					*/
					public void setZanNumber(Integer zanNumber) {
						this.zanNumber = zanNumber;
					}

					/**
					* 获取： 踩
					*/
					public Integer getCaiNumber() {
						return caiNumber;
					}
					/**
					* 设置： 踩
					*/
					public void setCaiNumber(Integer caiNumber) {
						this.caiNumber = caiNumber;
					}

					/**
					* 获取： 菜品详情
					*/
					public String getCaipinContent() {
						return caipinContent;
					}
					/**
					* 设置： 菜品详情
					*/
					public void setCaipinContent(String caipinContent) {
						this.caipinContent = caipinContent;
					}






















				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
