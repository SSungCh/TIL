package db;

public class ProductDao extends Dao {
	
	public ProductDao() {
		
	}
	public ProductDao(String ip) {
		super(ip);
	}
	@Override
	public void insert(Object object) {
		connection();
		Product product = (Product)object;
		System.out.println(product.getId()+" " +product.getName()+" "+product.getPrice()+ " Inserted..object.");
		close();
		
	}

	@Override
	public Object select(Object object) {
		Product product  = null;
		String str = (String)object;
		//DB에서 SELECT해서 데이터를 가지고 온다.
		connection();
		product = new Product("id01","box",1000);
		close();
		
		return product;
	}

	@Override
	public Object delete(Object object) {
		String str =(String)object;
		connection();
		System.out.println(str+" Deleted ....");
		close();
		return null;
	}

	
	
}
