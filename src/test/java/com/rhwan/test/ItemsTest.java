package com.rhwan.test;

import com.rhwan.dao.ItemsDao;
import com.rhwan.domain.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wanrh@jurassic.com.cn
 * @date 2018/11/14 18:50
 */
public class ItemsTest {

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

}
