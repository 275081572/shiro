package com.example.shirojwt.serviceimpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.shirojwt.dao.ProductDao;
import com.example.shirojwt.entity.Product;
import com.example.shirojwt.service.IProductService;
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
public class ProductServiceImpl extends ServiceImpl<ProductDao, Product> implements IProductService {

}
