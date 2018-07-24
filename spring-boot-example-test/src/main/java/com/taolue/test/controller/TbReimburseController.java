package com.taolue.test.controller;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 * 报销表 前端控制器
 * </p>
 *
 * @author baoxiao
 * @since 2018-07-06
 */
@RestController
@RequestMapping("/tbReimburse")
public class TbReimburseController {

    /**
    * 通过ID查询
    *
    * @param id ID
    * @return TbReimburse
    */
    @GetMapping("/{id}")
    public String get(@PathVariable String id) {
        return "1";
    }


    /**
    * 分页查询信息
    *
    * @param params 分页对象
    * @return 分页对象
    */
    @RequestMapping("/page")
    public String page(@RequestParam Map<String, Object> params) {
        System.out.println("=======Map:{"+params.toString() +"}");
        return "2";
    }
    
    /**
     * 分页查询 发票列表 
      @param params 分页对象
    * @return 分页对象
     */
    @RequestMapping("/reimbPage")
    public String  reimbPage(@RequestParam Map<String, Object> params, Map<String,Object> map) {
    	 System.out.println("=======Map2:{"+params.toString() +"}");
        return "3";
    }
    
    
}
