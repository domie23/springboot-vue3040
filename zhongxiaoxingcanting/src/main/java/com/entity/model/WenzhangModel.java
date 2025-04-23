package com.entity.model;

import com.entity.WenzhangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 餐厅菜品文章
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class WenzhangModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 餐厅菜品
     */
    private Integer caipinId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 文章标题
     */
    private String wenzhangName;


    /**
     * 文章类型
     */
    private Integer wenzhangTypes;


    /**
     * 文章内容
     */
    private String wenzhangContent;


    /**
     * 审核状态
     */
    private Integer wenzhangYesnoTypes;


    /**
     * 审核结果
     */
    private String wenzhangYesnoText;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：餐厅菜品
	 */
    public Integer getCaipinId() {
        return caipinId;
    }


    /**
	 * 设置：餐厅菜品
	 */
    public void setCaipinId(Integer caipinId) {
        this.caipinId = caipinId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：文章标题
	 */
    public String getWenzhangName() {
        return wenzhangName;
    }


    /**
	 * 设置：文章标题
	 */
    public void setWenzhangName(String wenzhangName) {
        this.wenzhangName = wenzhangName;
    }
    /**
	 * 获取：文章类型
	 */
    public Integer getWenzhangTypes() {
        return wenzhangTypes;
    }


    /**
	 * 设置：文章类型
	 */
    public void setWenzhangTypes(Integer wenzhangTypes) {
        this.wenzhangTypes = wenzhangTypes;
    }
    /**
	 * 获取：文章内容
	 */
    public String getWenzhangContent() {
        return wenzhangContent;
    }


    /**
	 * 设置：文章内容
	 */
    public void setWenzhangContent(String wenzhangContent) {
        this.wenzhangContent = wenzhangContent;
    }
    /**
	 * 获取：审核状态
	 */
    public Integer getWenzhangYesnoTypes() {
        return wenzhangYesnoTypes;
    }


    /**
	 * 设置：审核状态
	 */
    public void setWenzhangYesnoTypes(Integer wenzhangYesnoTypes) {
        this.wenzhangYesnoTypes = wenzhangYesnoTypes;
    }
    /**
	 * 获取：审核结果
	 */
    public String getWenzhangYesnoText() {
        return wenzhangYesnoText;
    }


    /**
	 * 设置：审核结果
	 */
    public void setWenzhangYesnoText(String wenzhangYesnoText) {
        this.wenzhangYesnoText = wenzhangYesnoText;
    }
    /**
	 * 获取：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：发布时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show2 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
