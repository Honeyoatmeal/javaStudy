public class Printf2 {
	public static void main(String[] args) {
		/*
		 * 유재석은 은행계좌를 가지고 있다. 
		 * 계좌에 1,000원 예금되어 있고, 오늘 325원을 송금받았다.
		 * 잔고가 1,325원이 되었다.
		 * 특별이자율은 0.3이 적용되어 내일 이자 397.5원을 받는다.
		 * 
		 * 예금자, 송금 전 잔금, 송금된 금액, 송금 후 잔금, 내일 입금될 이자를 출력하시오.
		 */
		
		System.out.printf("%s : %s%n", "예금자", "유재석");
		System.out.printf("%s : %,d원%n", "송금 전 잔액", 1000);
		System.out.printf("%s : %,d원%n", "송금된 금액", 325);
		System.out.printf("%s : %,d원%n", "송금 후 금액", 1325);
		System.out.printf("%s : %,.1f원%n", "내일 입금 이자", 397.5);
		//System.out.printf("%s : %,.1d원%n", "내일 입금 이자", 397.5); runtime error
		
	}
}