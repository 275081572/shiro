package com.example.shirojwt.serviceimpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.shirojwt.dao.BusinessTypeDao;
import com.example.shirojwt.entity.BusinessType;
import com.example.shirojwt.service.IBusinessTypeService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xuwei
 * @since 2019-11-29
 */
@Service
public class BusinessTypeServiceImpl extends ServiceImpl<BusinessTypeDao, BusinessType> implements IBusinessTypeService {

    @Override
    public void updateByPrimary(BusinessType businessType) {
        this.updateById(businessType);
    }
}
