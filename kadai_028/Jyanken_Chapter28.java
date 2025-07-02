package kadai_028;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	private HashMap<String, String> handMap;
	
	public Jyanken_Chapter28() {
        handMap = new HashMap<>();
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");
    }
	
	public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        String myChoice;
        
        while (true) {
            System.out.println("自分のじゃんけんの手を入力しましょう");
            System.out.println("グーはrockのrを入力しましょう");
            System.out.println("チョキはscissorsのsを入力しましょう");
            System.out.println("パーはpaperのpを入力しましょう");
            
            myChoice = scanner.nextLine().toLowerCase();
            
            if (handMap.containsKey(myChoice)) {
                break;
            } else {
                System.out.println("入力が正しくありません。再度入力してください。");
            }
        }

        return myChoice;
        
	}
	
	public String getRandom() {
        String[] choices = {"r", "s", "p"};
        int index = (int) Math.floor(Math.random() * 3);
        return choices[index];
        
	 }
	
	public void playGame(String myChoice, String opponentChoice) {
        System.out.println("自分の手は" + handMap.get(myChoice) + ", 対戦相手の手は" + handMap.get(opponentChoice));

        if (myChoice.equals(opponentChoice)) {
            System.out.println("あいこです");
        } else if (
            (myChoice.equals("r") && opponentChoice.equals("s")) ||
            (myChoice.equals("s") && opponentChoice.equals("p")) ||
            (myChoice.equals("p") && opponentChoice.equals("r"))
        ) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
	
}
