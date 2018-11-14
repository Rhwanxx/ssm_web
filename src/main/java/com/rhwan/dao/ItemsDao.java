package com.rhwan.dao;

import com.rhwan.domain.Items;
import org.apache.ibatis.annotations.Select;

/**
 * @author wanrh@jurassic.com.cn
 * @date 2018/11/14 18:07
 */
public interface ItemsDao {

    /**
     * 根据主键查询项目
     * @param id
     * @return
     */
    @Select("select * from items where id = #{id}")
    public Items findItemById(Integer id);
}
