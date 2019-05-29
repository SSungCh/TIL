package com.sds.component;

import java.util.ArrayList;

import com.sds.frame.Dao;
import com.sds.vo.Product;

public class ProductDao extends Dao<Integer, Product> {

	@Override
	public void insert(Product v) throws Exception {

		if (v.getId()==2) {
			throw new Exception("E0001");
		}
		System.out.println(v + "Inserted.");

	}

	@Override
	public void delete(Integer k) throws Exception {
		if (k==2) {
			throw new Exception("E0002");
		}
		System.out.println(k + "Deleted.");

	}

	@Override
	public void update(Product v) throws Exception {
		if (v.getId()==2) {
			throw new Exception("E0003");
		}
		System.out.println(v + "Updated.");

	}

	@Override
	public Product select(Integer k) throws Exception {
		Product Product = new Product(k, "james", 2000);

		return Product;
	}

	@Override
	public ArrayList<Product> select() throws Exception {
		ArrayList<Product> list = new ArrayList<>();
		list.add(new Product(01, "t1", 1000));
		list.add(new Product(02, "t2", 2000));
		list.add(new Product(03, "t3", 3000));
		list.add(new Product(04, "t4", 4000));
		list.add(new Product(05, "t5", 5000));
		
		return list;
	}

}
