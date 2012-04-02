
package features.mouse;

public class Myers implements features.Myers {

	@Override
	public String getName(int lineA, int lineB, int lineC) {

		if (lineA <= 0 || lineB <= 0 || lineC <= 0) {
			throw new IllegalArgumentException();	
		}
		
		if (lineA == lineB && lineB == lineC) {
			return "正三角形"; 
		} else if (lineA == lineB || lineB == lineC || lineC == lineA) {
			return "二等辺三角形";
		} else {
			return "不等辺三角形";
		}
	}

}
