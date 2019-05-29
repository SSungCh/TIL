package com.sds.test;

import com.sds.component.ProductBiz;
import com.sds.frame.Biz;
import com.sds.vo.Product;

public class ProductUpdate {

	public static void main(String[] args) {
		Biz<Integer,Product> biz = new ProductBiz();
		Product p1 = new Product(2, "jame", 10000);
		try {
			biz.modify(p1);;
		} catch (Exception e) {
			System.out.println("Update Error");
			System.out.println(e.getMessage());
		}

	}

}
