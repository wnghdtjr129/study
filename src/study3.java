import java.util.Arrays;

public class study3 {
	
	public static void main(String[] args) {
		int[][] route = {{1,0,0,1,1,0},{1,0,0,1,0,0},{1,1,1,1,0,0},{1,0,0,0,0,1},{1,1,1,1,1,1}};
		int[] startPoint = {0,0};
		int[] finishPoint = {0,4};
		int[][] checkRoute = new int [route.length][route[0].length];
		for(int[] row: checkRoute ) {
			Arrays.fill(row, 1);
		}
		
		System.out.println(findRoute(route, startPoint, finishPoint, checkRoute, 0));
	}
	
	
	//루트찾기
	public static int findRoute(int[][]route, int[] currentPoint, int[]finishPoint, int[][]checkRoute, int movement) {
		int x = currentPoint[0], y = currentPoint[1];
		int moveCount=0;
		int[] direction = {0,0,0,0};
		int answer=0, temp=0;
		checkRoute[x][y] = 0; //왔던 곳으로 지정
		if(route[x][y]==0) {
			System.out.println("잘못된 시작점 입니다.");
			return -1;
		}
		//한칸 위쪽으로 이동 가능
		if(x-1>=0) { 
			if(route[x-1][y] == 1 && checkRoute[x-1][y] == 1) {
				moveCount++;
				direction[0]++;
			}
		}
		//한칸 오른쪽으로 이동 가능
		if(y+1<=route[0].length-1) {
			if(route[x][y+1] == 1 && checkRoute[x][y+1] == 1) {
				moveCount++;
				direction[1]++;
			}
		}
		//한칸 아래쪽으로 이동 가능
		if(x+1<=route.length-1) {
			if(route[x+1][y] == 1 && checkRoute[x+1][y] == 1) {
				moveCount++;
				direction[2]++;
			}
		}
		//한칸 왼쪽으로 이동 가능
		if(y-1>=0) {
			if(route[x][y-1] == 1 && checkRoute[x][y-1] == 1) {
				moveCount++;
				direction[3]++;
			}
		}
		//canMove가 0이면 도착 혹은 길이 없음을 뜻함
		if(moveCount == 0) {
			if(currentPoint[0] == finishPoint[0] && currentPoint[1] == finishPoint[1])//도착
				return movement;
			else
				return -1;
		}
		movement++;
		//다음 길로 이동
		if(direction[0]==1) {
			currentPoint[0] = x-1;
			currentPoint[1] = y;
			answer = findRoute(route, currentPoint, finishPoint, checkRoute, movement);
			if(answer==-1 && temp>0)
				answer = temp;
			else if(answer==-1 && temp==-1)
				answer = -1;
			temp = answer;		
		}
				
		if(direction[1]==1) {
			currentPoint[0] = x;
			currentPoint[1] = y+1;
			answer = findRoute(route, currentPoint, finishPoint, checkRoute, movement);
			if(answer==-1 && temp>0)
				answer = temp;
			else if(answer==-1 && temp==-1)
				answer = -1;
			temp = answer;
		}
		if(direction[2]==1) {
			currentPoint[0] = x+1;
			currentPoint[1] = y;
			answer = findRoute(route, currentPoint, finishPoint, checkRoute, movement);
			if(answer==-1 && temp>0)
				answer = temp;
			else if(answer==-1 && temp==-1)
				answer = -1;
			temp = answer;
		}
		if(direction[3]==1) {
			currentPoint[0] = x;
			currentPoint[1] = y-1;
			answer = findRoute(route, currentPoint, finishPoint, checkRoute, movement);	
			if(answer==-1 && temp>0)
				answer = temp;
			else if(answer==-1 && temp==-1)
				answer = -1;
			temp = answer;
		}
	
		return answer; 
	}

}

