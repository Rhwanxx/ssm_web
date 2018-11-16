package com.rhwan.service.impl;

import com.rhwan.dao.ItemsDao;
import com.rhwan.domain.Items;
import com.rhwan.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author wanrh@jurassic.com.cn
 * @date 2018/11/16 16:10
 */
@Service
@Transactional
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    ItemsDao itemsDao;
    /**
     * 根据id查询items
     *
     * @param id
     */
    @Override
    public Items findItemById(Integer id) {
        return itemsDao.findItemById(id);
    }
}
