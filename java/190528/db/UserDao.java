package db;

public class UserDao extends Dao {
	
	public UserDao() {
		
	}
	public UserDao(String ip) {
		super(ip);
	}
	@Override
	public void insert(Object object) {
		connection();
		User user = (User)object;
		System.out.println(user.getId()+" " +user.getName()+" "+user.getPwd()+ " Inserted..object.");
		close();
		
	}

	@Override
	public Object select(Object object) {
		User user = null;
		String str = (String)object;
		//DB에서 SELECT해서 데이터를 가지고 온다.
		connection();
		user = new User("id01","Tom","pwd01");
		close();
		
		return user;
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
