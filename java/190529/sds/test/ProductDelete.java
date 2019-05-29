package com.sds.test;

import com.sds.component.ProductBiz;
import com.sds.frame.Biz;
import com.sds.vo.Product;

public class ProductDelete {

	public static void main(String[] args) {
		Biz<Integer,Product> biz = new ProductBiz();
		Product p1 = new Product(01, "jame", 10000);
		try {
			biz.remove(2);
		} catch (Exception e) {
			System.out.println("Delete Error");
			System.out.println(e.getMessage());
		}

	}

}
