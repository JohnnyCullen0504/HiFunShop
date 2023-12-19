package com.shop.service;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.shop.dao.ProductDao;
import com.shop.pojo.Product;
import com.shop.utils.C3P0Utils;
import com.shop.utils.PageBean;

public class ProductService {
	
	ProductDao productDao = new ProductDao();
	/**
	 * 获得热门商品
	 * @return
	 */
	public List<Product> getHotProduct(){
		try {
			return productDao.getHotProduct();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	/**
	 * 获得最新商品
	 * @return
	 */
	public List<Product> getNewProduct(){
		try {
			return productDao.getNewProduct();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	/**
	 * 通过pid查询商品
	 * @param pid
	 * @return
	 */
	public Product getProductById(String pid) {
		try {
			return productDao.getProductById(pid);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 根据分类cid查询商品列表
	 * @param cid
	 * @return
	 */
	public List<Product> getProductListByCid(int cid,PageBean pageBean){
		try {
			return productDao.getProductListByCid(cid,pageBean);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	/**
	 * 
	 * @param cid
	 * @return
	 * @throws SQLException 
	 */
	public int getTotal(int cid) {
		try {
			return productDao.getTotal(cid);
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}
	
}
