package data_structurePractice.stack;

import java.util.Scanner;

public class StackTest {

	public static void main(String[] args) {
		Stack s = new Stack(60);
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("���� ������ �� "+s.size()+"/"+s.capacity());
			System.out.println("1.Ǫ�� 2.�� 3.�ε��� 4.�ʱ�ȭ  5.���� 0.����");
			
			int x = sc.nextInt();
			if(x==0) {
				System.out.println("�����մϴ�.");
				break;
			}
			int y;
			switch(x) {
				case 1:
					System.out.print("������ �Է�");
					y = sc.nextInt();
					
					s.push(y);
					break;
				case 2:
					System.out.println(s.pop());
					break;
				case 3:
					System.out.print("ã�� ���� �Է����ּ��� : ");
					y = sc.nextInt();
					System.out.println(s.indexOf(y));
					break;
				case 4:
					s.clear();
					System.out.println("�ʱ�ȭ�� �Ϸ�Ǿ����ϴ�.");
					break;
				default: 
					s.dump();
			}
		} while(true);
			
	}
}
