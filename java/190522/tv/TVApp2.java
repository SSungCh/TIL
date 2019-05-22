package tv;

public class TVApp2 {

	public static void main(String[] args) {
		TV tv = new TV();
		System.out.println(tv.toString());
		TV tv2 = new TV("blue",false,9);
		System.out.println(tv2.toString());
		TV tv3 = new TV("green",false,9);
		System.out.println(tv2.toString());
	}

}
