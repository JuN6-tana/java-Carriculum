package curriculum_B;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		System.out.print("");
		String name = "";
		boolean b = true;		
		while (b) {
			
			name = scanner.nextLine();
			if (name.length() > 10){
				System.out.println("「名前を10文字以内にしてください」");	
			}else if (name.length() <= 0 || Objects.isNull(name)) {
				System.out.println("「名前を入力してください」");
			}else if (!name.matches ("^[a-zA-Z0-9]+$")) {
				System.out.println("「半角英数字のみで名前を入力してください」");
			}else {
				System.out.println("「ユーザー名「" + name + "」を登録しました」");
				//b = false;
				break;
			}	
		}
		String[] strs = {"グー","チョキ","パー"};
		int hands;
		Random rand = new Random();
		int enemy;
		int count = 0;
		while (b) {
			System.out.print("手を入力してください");
			hands = scanner.nextInt();
			//System.out.println(hands);
			System.out.println(name + "の手は" + strs[hands]);
			enemy = rand.nextInt(3);
			System.out.println("相手の手は" + strs[enemy]);
			count++;
			if (hands == enemy) {
				System.out.println("DRAW あいこ もう一回しましょう！");	
			}else if (hands==0 && enemy==2) {
				System.out.println("俺の勝ち！");
				System.out.println("なんで負けたか、明日まで考えといてください。");
				System.out.println("そしたら何かが見えてくるはずです");
			}else if (hands==1 && enemy==0) {
				System.out.println("俺の勝ち！");
				System.out.println("負けは次につながるチャンスです！");
				System.out.println("ネバーギブアップ！");
			}else if (hands==2 && enemy==1) {
				System.out.println("俺の勝ち！");
				System.out.println("たかがじゃんけん、そう思ってないですか？");
				System.out.println("それやったら次も、俺が勝ちますよ");
			}else {
				System.out.println("やるやん。");
				System.out.println("次は俺にリベンジさせて");
				System.out.println("勝つまでにかかった合計回数は" + count + "回です");
				break;
				
			}	
		}
			
			
				
	}
		
}
	
