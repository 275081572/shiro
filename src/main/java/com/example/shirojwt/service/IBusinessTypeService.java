package com.example.shirojwt.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.shirojwt.entity.BusinessType;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xuwei
 * @since 2019-11-29
 */
public interface IBusinessTypeService extends IService<BusinessType> {

    void updateByPrimary(BusinessType businessType);
}
