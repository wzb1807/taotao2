package com.ithezebin.service.impl;


import com.ithezebin.mapper.ItemMapper;
import com.ithezebin.pojo.Item;
import com.ithezebin.pojo.TaoResult;
import com.ithezebin.service.ItemService;

public class ItemServiceImpl implements ItemService {

    private ItemMapper itemMapper;

    @Override
    public TaoResult<Item> findByPage(Integer page, Integer rows) {
        return null;
    }
}
