package com.dao;

import com.entity.CaipinLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.CaipinLiuyanView;

/**
 * 餐厅菜品留言 Dao 接口
 *
 * @author 
 */
public interface CaipinLiuyanDao extends BaseMapper<CaipinLiuyanEntity> {

   List<CaipinLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
