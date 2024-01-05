import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("== 명언 앱 실행 ==");
		while (true) {
			System.out.print("명령어 > ");
			String cmd = sc.nextLine();

			if (cmd.equals("종료")) {
				System.out.println("== 명언 앱 종료 ==");
				break;
			}else {
				System.out.println("없는 명령어입니다.");
			}
		}
	}

}
