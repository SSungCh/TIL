package tv;

public class TV {
	//attribute(속성)

		String color;
		boolean power;
		int channel;
	//constructor(속성 초기화)
		TV(){
			color = "red";
			power = false;
			channel = 10;
		}
		TV(String color, boolean power, int channel){//argument(함수 명칭은 똑같으나 argument 다르면 코딩 문제 없음)
			this.color = color;
			this.power = power;
			this.channel = channel;
		}
		TV(String color){//argument(함수 명칭은 똑같으나 argument 다르면 코딩 문제 없음)
			this.color = color;
			this.power = false;
			this.channel = 10;
		}
		
	//function(기능)
		
		
		void power() {
			power = !power;
		}
		void channerUp(){
			channel++;
		}
		void channelDown(){
			channel--;
		}
		@Override
		public String toString() {
			return "TV [color=" + color + ", power=" + power + ", channel=" + channel + "]";
		}

}
