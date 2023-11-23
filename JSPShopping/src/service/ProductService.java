package service;

import dao.ProductDao;
import domain.ProductClass;
import utils.MySpring;

import java.util.ArrayList;

public class ProductService {

    private ProductDao productDao = MySpring.getBean("dao.ProductDao");
    public ArrayList<ProductClass> showProductByCid(Integer cid) {
        System.out.println("根据产品分类ID查询产品信息");
        // 调用数据库，查找cid对应的商品
        ArrayList<ProductClass> productArr = productDao.selectProductByCid(cid);
        return productArr;
    }

    public ProductClass selectProductByPid(Integer pid) {
        System.out.println("根据产品ID查询产品信息");
        // 调用数据库，查找pid对应的商品
        ProductClass product = productDao.selectOne(pid);
        return product;
    }
}
