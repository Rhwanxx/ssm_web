package com.rhwan.test;

import com.rhwan.dao.ItemsDao;
import com.rhwan.domain.Items;
import com.rhwan.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.ws.Service;

/**
 * @author wanrh@jurassic.com.cn
 * @date 2018/11/14 18:50
 */
public class ItemsTest {

    /**
     * DAO代码测试
     */
    @Test
    public void daoTest(){
        //得到spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从spring容器中得到dao接口的代理对象
        ItemsDao itemsDao = applicationContext.getBean(ItemsDao.class);
        //调用方法
        Items items = itemsDao.findItemById(1);
        System.out.println(items.toString());
    }

    /**
     * service代码测试
     */
    @Test
    public void serviceTest(){
        //得到spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从spring容器中得到service接口的代理对象
        ItemsService itemsService = applicationContext.getBean(ItemsService.class);
        //调用方法
        Items items = itemsService.findItemById(1);
        System.out.println(items.toString());
    }

}
