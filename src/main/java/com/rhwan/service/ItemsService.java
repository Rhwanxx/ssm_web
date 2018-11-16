package com.rhwan.service;

import com.rhwan.domain.Items;

/**
 * @author wanrh@jurassic.com.cn
 * @date 2018/11/16 16:09
 */
public interface ItemsService {

    /**
     * 根据id查询items
     */
    public Items findItemById(Integer id);
}
