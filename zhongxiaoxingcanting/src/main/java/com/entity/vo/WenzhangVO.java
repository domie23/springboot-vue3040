package com.entity.vo;

import com.entity.WenzhangEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 餐厅菜品文章
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("wenzhang")
public class WenzhangVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 餐厅菜品
     */

    @TableField(value = "caipin_id")
    private Integer caipinId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 文章标题
     */

    @TableField(value = "wenzhang_name")
    private String wenzhangName;


    /**
     * 文章类型
     */

    @TableField(value = "wenzhang_types")
    private Integer wenzhangTypes;


    /**
     * 文章内容
     */

    @TableField(value = "wenzhang_content")
    private String wenzhangContent;


    /**
     * 审核状态
     */

    @TableField(value = "wenzhang_yesno_types")
    private Integer wenzhangYesnoTypes;


    /**
     * 审核结果
     */

    @TableField(value = "wenzhang_yesno_text")
    private String wenzhangYesnoText;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：餐厅菜品
	 */
    public Integer getCaipinId() {
        return caipinId;
    }


    /**
	 * 获取：餐厅菜品
	 */

    public void setCaipinId(Integer caipinId) {
        this.caipinId = caipinId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：文章标题
	 */
    public String getWenzhangName() {
        return wenzhangName;
    }


    /**
	 * 获取：文章标题
	 */

    public void setWenzhangName(String wenzhangName) {
        this.wenzhangName = wenzhangName;
    }
    /**
	 * 设置：文章类型
	 */
    public Integer getWenzhangTypes() {
        return wenzhangTypes;
    }


    /**
	 * 获取：文章类型
	 */

    public void setWenzhangTypes(Integer wenzhangTypes) {
        this.wenzhangTypes = wenzhangTypes;
    }
    /**
	 * 设置：文章内容
	 */
    public String getWenzhangContent() {
        return wenzhangContent;
    }


    /**
	 * 获取：文章内容
	 */

    public void setWenzhangContent(String wenzhangContent) {
        this.wenzhangContent = wenzhangContent;
    }
    /**
	 * 设置：审核状态
	 */
    public Integer getWenzhangYesnoTypes() {
        return wenzhangYesnoTypes;
    }


    /**
	 * 获取：审核状态
	 */

    public void setWenzhangYesnoTypes(Integer wenzhangYesnoTypes) {
        this.wenzhangYesnoTypes = wenzhangYesnoTypes;
    }
    /**
	 * 设置：审核结果
	 */
    public String getWenzhangYesnoText() {
        return wenzhangYesnoText;
    }


    /**
	 * 获取：审核结果
	 */

    public void setWenzhangYesnoText(String wenzhangYesnoText) {
        this.wenzhangYesnoText = wenzhangYesnoText;
    }
    /**
	 * 设置：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
