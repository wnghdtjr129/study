import java.util.LinkedList;
import java.util.Collections;

public class study2 {

	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list.addFirst(1);
		list.add(2);
		list.add(3);
		
		list1.addFirst(1);
		list1.add(2);
		list1.add(3);
		int count=0;
		
		//�ι�° ����Ʈ���� ù��° ����Ʈ ������ ������ ũ�ų� ���� ������ ���� �߰�
		for(int i=0; i<list.size(); i++) {
			for(int j=0; j<list1.size() ;j++) {
				if(list.get(i)<=list1.get(count)) {
					list2.add(list.get(i));
					break;
				}
				else {
					list2.add(list1.get(count));
					count++;
				}
			}
		}
		//�ι�° ����Ʈ ���� �޺κ� ���� �߰�
		for(int i=count; i<list1.size(); i++)
			list2.add(list1.get(i));
		
		//���
		count=1;
		for(Integer i: list2) {
			if(count == list2.size())
				System.out.println(i);
			else
				System.out.print(i+"->");
			count++;
		}

	}
}
