package com.ithezebin.service;

import com.ithezebin.pojo.Item;
import com.ithezebin.pojo.TaoResult;


public interface ItemService {

//    商品表数据太多了，所以我们要分页查询

    /**
     * 分页查询商品
     * @param page 查询第几页
     * @param rows 每页显示几条
     * @return
     */
    TaoResult<Item> findByPage(Integer page, Integer rows);
}
