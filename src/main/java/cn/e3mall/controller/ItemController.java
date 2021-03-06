package cn.e3mall.controller;

import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemController {
    @Autowired
    private ItemService itemService;
    @RequestMapping(value = "/{id}")
    @ResponseBody
    public TbItem getItem(@PathVariable Long id){
        TbItem item = itemService.getItemById(id);
        return item;
    }
    @RequestMapping(value = "/hello")
    public String showIndex(){
        return "hello";
    }
}
