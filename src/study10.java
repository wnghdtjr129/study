import java.util.Stack;

public class study10 {

	public static void main(String[] args) {
		String path="/usr/./bin/./test/../";
		Stack<String> path_unix = new Stack<String>();
		
		System.out.println("input:" + path);
		
		for (String splitted : path.split("/")) {
			switch(splitted) {
			case "..":
				path_unix.pop();
				break;
			case ".":
				break;
			default:
				path_unix.push(splitted);
			}
		}
		
		System.out.print("output:");
		for (String unix : path_unix) {
			System.out.print(unix + "/");
		}
		System.out.println();
	}

}
/*
 * stack 공부하기
 */