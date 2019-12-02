package com.example.shirojwt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.shirojwt.entity.BusinessType;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xuwei
 * @since 2019-11-29
 */
@Repository
public interface BusinessTypeDao extends BaseMapper<BusinessType> {

    void updateBy(BusinessType businessType);
}
