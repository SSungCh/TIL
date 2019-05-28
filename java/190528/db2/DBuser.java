package db2;

public class DBuser extends DB {
	
	public DBuser() {
		
	}
	
	public DBuser(String ip) {
		super(ip);
	}

	@Override
	public void insert(Object obj) {
		connection();
		User u = (User)obj;
		System.out.println(u.getId()+"Inserted");
		close();

	}

	@Override
	public Object select(Object obj) {
		User user =null;
		String str = (String)obj;
		connection();
		user = new User("id02","tom","pwd02");
		close();
		return user;
	}

}
