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
	
	
	//��Ʈã��
	public static int findRoute(int[][]route, int[] currentPoint, int[]finishPoint, int[][]checkRoute, int movement) {
		int x = currentPoint[0], y = currentPoint[1];
		int moveCount=0;
		int[] direction = {0,0,0,0};
		int answer=0, temp=0;
		checkRoute[x][y] = 0; //�Դ� ������ ����
		if(route[x][y]==0) {
			System.out.println("�߸��� ������ �Դϴ�.");
			return -1;
		}
		//��ĭ �������� �̵� ����
		if(x-1>=0) { 
			if(route[x-1][y] == 1 && checkRoute[x-1][y] == 1) {
				moveCount++;
				direction[0]++;
			}
		}
		//��ĭ ���������� �̵� ����
		if(y+1<=route[0].length-1) {
			if(route[x][y+1] == 1 && checkRoute[x][y+1] == 1) {
				moveCount++;
				direction[1]++;
			}
		}
		//��ĭ �Ʒ������� �̵� ����
		if(x+1<=route.length-1) {
			if(route[x+1][y] == 1 && checkRoute[x+1][y] == 1) {
				moveCount++;
				direction[2]++;
			}
		}
		//��ĭ �������� �̵� ����
		if(y-1>=0) {
			if(route[x][y-1] == 1 && checkRoute[x][y-1] == 1) {
				moveCount++;
				direction[3]++;
			}
		}
		//canMove�� 0�̸� ���� Ȥ�� ���� ������ ����
		if(moveCount == 0) {
			if(currentPoint[0] == finishPoint[0] && currentPoint[1] == finishPoint[1])//����
				return movement;
			else
				return -1;
		}
		movement++;
		//���� ��� �̵�
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

