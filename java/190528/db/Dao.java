package db;

public abstract class Dao {
	private String ip;
	

	public Dao() {
	}


	public Dao(String ip) {
		this.ip = ip;
	}
	
	public void connection() {
		System.out.println(ip+":connected..");
	}
	
	public void close() {
		System.out.println(ip+":closed..");
	}
	
	public abstract void insert(Object object);
	public abstract Object select(Object object);
	public abstract Object delete(Object object);
	

}
