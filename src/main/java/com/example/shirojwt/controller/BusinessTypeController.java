package com.example.shirojwt.controller;

import com.example.shirojwt.entity.BusinessType;
import com.example.shirojwt.result.ResponseData;
import com.example.shirojwt.result.ResponseDataUtil;
import com.example.shirojwt.service.IBusinessTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xuwei
 * @since 2019-11-29
 */
@RestController
@RequestMapping("/business-type")
public class BusinessTypeController {

    @Autowired
    private IBusinessTypeService businessTypeService;

    @PostMapping("/saveBusinessType")
    @ResponseBody
    public ResponseData saveBusinessType(@RequestBody BusinessType businessType){
        businessTypeService.save(businessType);
        return ResponseDataUtil.success("保存成功");
    }

    @GetMapping("/getById")
    @ResponseBody
    public ResponseData<BusinessType> getById(@RequestParam Long id){
        BusinessType businessType = businessTypeService.getById(id);
        return ResponseDataUtil.success("查询成功", businessType);
    }

    @PutMapping("/updateById")
    @ResponseBody
    public ResponseData<BusinessType> updateById(@RequestBody BusinessType businessType){
        businessType.setUpdateTime(LocalDateTime.now());
        businessTypeService.updateByPrimary(businessType);
        return ResponseDataUtil.success("修改成功");
    }
}
