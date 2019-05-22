package tv;

public class TVApp {

	public static void main(String[] args) {
		TV tv; // reference type
		tv = new TV();

		System.out.println(tv.toString());
		tv.color = "red";//∞¥√º √ ±‚»≠
		tv.power = true;
		tv.channel = 11;

		System.out.println(tv.toString());
		tv.power();
		tv.channelDown();

		System.out.println(tv.toString());
		
		TV tv2 = new TV();
		tv2.color = "blue";//∞¥√º √ ±‚»≠
		tv2.power = true;
		tv2.channel = 10;
		tv2.power();
		System.out.println(tv2.toString());
	}

}
