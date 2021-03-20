package L23feb9;

public class Cars implements Comparable<Cars>{
	public int speed;
	public int price;
	public char color;
	
	@Override
	public String toString() {
		return "Speed: "+speed+" Price: "+price+" Color: "+color;
	}
	
	
    @Override
	public int compareTo(Cars o) {
		
		return this.speed-o.speed;
	}
	

}
