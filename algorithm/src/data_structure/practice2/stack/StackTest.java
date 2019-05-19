package data_structure.practice2.stack;

import java.util.Scanner;

public class StackTest {

	public static void main(String[] args) {
		Stack s = new Stack(60);
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("현재 데이터 수 "+s.size()+"/"+s.capacity());
			System.out.println("1.푸시 2.팝 3.인덱스 4.초기화  5.덤프 0.종료");
			
			int x = sc.nextInt();
			if(x==0) {
				System.out.println("종료합니다.");
				break;
			}
			int y;
			switch(x) {
				case 1:
					System.out.print("데이터 입력");
					y = sc.nextInt();
					
					s.push(y);
					break;
				case 2:
					System.out.println(s.pop());
					break;
				case 3:
					System.out.print("찾을 값을 입력해주세요 : ");
					y = sc.nextInt();
					System.out.println(s.indexOf(y));
					break;
				case 4:
					s.clear();
					System.out.println("초기화가 완료되었습니다.");
					break;
				default: 
					s.dump();
			}
		} while(true);
			
	}
}
