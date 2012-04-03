package features.mouse;

public class Myers implements features.Myers {
	
	@Override
	public String getName(int x, int y, int z) {
		
		if (x <= 0 || y <= 0 || z <= 0) {
			throw new IllegalArgumentException();	
		}
		if ( ! ((x < y + z) && (y < x + z) && (z < x + y)) ) {
			throw new IllegalArgumentException(); 
		}
		
		if (x == y && y == z) {
			return "正三角形"; 
		} else if (x == y || y == z || z == x) {
			return "二等辺三角形";
		} else {
			return "不等辺三角形";
		}
	}
}
