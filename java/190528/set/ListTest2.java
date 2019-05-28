package set;

import java.util.ArrayList;
import java.util.Random;

public class ListTest2 {

	public static void main(String[] args) {

		ArrayList<User> list = new ArrayList<>();
		list.add(new User("id01","james","pwd01"));
		list.add(new User("id02","james","pwd02"));
		list.add(new User("id03","james","pwd03"));
		list.add(new User("id04","james","pwd04"));
		list.add(new User("id05","james","pwd05"));
		
		System.out.println(list.size());
		list.remove(3);
		list.set(1, new User("id02","jam22es","pwd02"));
		for(User u :list) {
			System.out.println(u);
		}
		
	}

}
