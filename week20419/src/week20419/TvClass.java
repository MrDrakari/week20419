package week20419;

public class TvClass{
	private int size;
	private int price;
	private String color;
	private String producer;
	private int channel;
	private int volume;

//  Source에서 제네레이트 getter and setter 함 자동으로 만들어줌
//	setter : 필드 값을 설정 (외부에서 값 설정)
//	getter : 필드 값을 반환 (외부로 값 반환)
	
	public int getSize() {
		return size; //반환하는 get이라서 int
	}
	public void setSize(int size) {//설정하는 set이라서 void
		this.size = size; //필드랑 매개변수가 똑같은데
	}      //ㄴ 여기 덕분에 구분가능
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	
	public void powerOn() {
		System.out.println(color +"색상의 "+producer+"의 TV 전원을 온");
	}
	public void powerOff() {
		System.out.println(color +"색상의 "+producer+"의 TV 전원을 오프");
	}
	
	public void upChannal() {
		System.out.println("현재 채널은 "+ ++channel + "번: " + color + "색의 " + producer + "의 TV 채널 업");
	}
	public void downChannal() {
		System.out.println("현재 채널은 "+ --channel + "번: " + color + "색의 " + producer + "의 TV 채널 다운");
	}
}
