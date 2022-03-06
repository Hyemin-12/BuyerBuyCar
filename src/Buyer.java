/* 정적 요소 : 이름, 재산
       메서드 : 생성자 메서드, 차를 사다, 재정 상태 출력, 보유상태 출력 */
public class Buyer {
	String Buyername;
	int money;
	int buyerInventory;
	public Buyer(String Buyername, int money, int buyerInventory) {
		this.Buyername = Buyername;
		this.money = money;
		this.buyerInventory = buyerInventory;
	}//end of buyer
	public void buyCar(Dealer item, int amount){
		if(money >= item.price * amount) {
			item.soldCar(amount);
			money -= item.price * amount;
			buyerInventory += amount;
		}else {
			System.out.println("*****잔액 부족으로 구입불가*****");
		}//end of if
	}//end of buyCar
	public void printMoney(){
		System.out.println("=======구매자의 재정 상태=======");
		System.out.println("이름 : " + this.Buyername);
		System.out.println("재정상태  : " + this.money + "원");
		System.out.println("보유차량 수 : " + this.buyerInventory + "대");
	}//end of printMoney
}//end of class
