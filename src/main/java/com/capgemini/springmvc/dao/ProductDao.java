package com.capgemini.springmvc.dao;

import java.util.List;
import com.capgemini.springmvc.bean.ProductInfoBean;

public interface ProductDao {
	
	public ProductInfoBean getProduct(int prodcutId);

	public boolean addProduct(ProductInfoBean productInfoBean);

	public boolean deleteProduct(int productId);

	public boolean updateProduct(ProductInfoBean productInfoBean);

	public List<ProductInfoBean> getAllProducts();

}
