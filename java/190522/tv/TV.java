package tv;

public class TV {
	//attribute(�Ӽ�)

		String color;
		boolean power;
		int channel;
	//constructor(�Ӽ� �ʱ�ȭ)
		TV(){
			color = "red";
			power = false;
			channel = 10;
		}
		TV(String color, boolean power, int channel){//argument(�Լ� ��Ī�� �Ȱ����� argument �ٸ��� �ڵ� ���� ����)
			this.color = color;
			this.power = power;
			this.channel = channel;
		}
		TV(String color){//argument(�Լ� ��Ī�� �Ȱ����� argument �ٸ��� �ڵ� ���� ����)
			this.color = color;
			this.power = false;
			this.channel = 10;
		}
		
	//function(���)
		
		
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
