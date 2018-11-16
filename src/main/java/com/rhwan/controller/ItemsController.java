package com.rhwan.controller;

import com.rhwan.domain.Items;
import com.rhwan.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wanrh@jurassic.com.cn
 * @date 2018/11/16 16:20
 */
@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    ItemsService itemsService;

    /**
     * 根据id查询项目
     */
    @RequestMapping("/showDetail")
    public String getItemsById(Model model){
        Items items = itemsService.findItemById(1);
        model.addAttribute("item",items);
        return  "itemDetail";
    }
}
