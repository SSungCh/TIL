package db;

public class App2 {

	public static void main(String[] args) {
		User user = new User("id01","james","pwd01");
		Biz biz = new UserBiz("192.168.111.100");		
		biz.register(user);
		biz.remove("id01");
		
		User dbuser = null;
		dbuser = (User)biz.get("id01");
		System.out.println(dbuser);
		
		System.out.println("ÇÁ·Î´öÆ®");
		
		Product product = new Product("id03","money",1000);
		Biz biz2 = new ProductBiz("192.168.111.101");		
		biz2.register(product);
		biz2.remove("id03");
		
		Product dbproduct = null;
		dbproduct = (Product)biz2.get("id03");
		System.out.println(dbproduct);
	}

}
