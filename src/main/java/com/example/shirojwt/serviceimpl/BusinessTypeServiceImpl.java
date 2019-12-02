package com.example.shirojwt.serviceimpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.shirojwt.dao.BusinessTypeDao;
import com.example.shirojwt.entity.BusinessType;
import com.example.shirojwt.service.IBusinessTypeService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private BusinessTypeDao businessTypeDao;

    @Override
    public void updateByPrimary(BusinessType businessType) {
        businessTypeDao.updateBy(businessType);
        //this.updateById(businessType);
    }
}
