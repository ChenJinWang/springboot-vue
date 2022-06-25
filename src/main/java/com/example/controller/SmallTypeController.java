package com.example.controller;
import com.example.entity.SmallType;
import com.example.entity.R;
import com.example.service.ISmallTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 商品小类Controller
 */
@RestController
@RequestMapping("/smallType")
public class SmallTypeController {

    @Autowired
    private ISmallTypeService smallTypeService;

    /**
     * 查询所有商品大类
     * @return
     */
    @GetMapping("/findAll")
//    public R findAll(){
//        List<SmallType> swiperSmallTypeList = smallTypeService.list(new QueryWrapper<SmallType>().eq("isSwiper", true).orderByAsc("swiperSort"));
//        Map<String,Object> map=new HashMap<>();
//        map.put("message",swiperSmallTypeList);
//        return R.ok(map);
//    }

    public R findAll(){
        List<SmallType> smallTypeList = smallTypeService.list();
        Map<String,Object> map=new HashMap<>();
        map.put("message",smallTypeList);
        return R.ok(map);
    }

}
