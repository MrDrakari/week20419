package week20419;

public class RunTV {

	public static void main(String[] args) {
		TvClass t1 = new TvClass();
		TvClass t2 = new TvClass();
		
		t1.setChannel(7);
		t1.setColor("Black");
		t1.setPrice(1200000);
		t1.setProducer("LG");
		t1.setSize(21);
		
		t2.setChannel(11);
		t2.setColor("White");
		t2.setPrice(5500000);
		t2.setProducer("SANSUM");
		t2.setSize(52);
		
		t1.powerOn();
		t1.upChannal();
		t1.upChannal();
		t1.downChannal();
		
		t2.powerOn();
		t2.downChannal();
		t2.downChannal();
		t2.downChannal();
		t2.powerOff();
		
	}
}
