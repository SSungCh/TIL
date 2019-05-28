package db;

public class App {

	public static void main(String[] args) {
		
		Biz biz = null;
		Product p = new Product("P01","pants",10000);
		biz.register(p);
		biz.remove("id03");
		
		Product dbproduct = null;
		dbproduct = (Product)biz2.get("id03");
		System.out.println(dbproduct);
	}

}
