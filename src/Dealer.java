/* 정적 요소 : 딜러이름, 가격, 보유대수
       메서드 : 생성자 메서드, 차를 팔다, 매출상태 출력 */
public class Dealer {
	String DealerName;
	int price;
	int sales = 0;
	int dealerInventory;
	public Dealer(String DealerName, int price, int dealerInventory) {
		this.DealerName = DealerName;
		this.price = price;
		this.dealerInventory = dealerInventory;
	}//end of dealer
	public void soldCar(int amount) {
		if(this.dealerInventory >= amount) {
			this.dealerInventory -= amount;
			this.sales += amount * this.price;
		}else {
			System.out.println("*****재고량 부족으로 판매불가*****");
		}//end of if
	}//end of sold
	public void printItem() {
		System.out.println("=======판매자의 매출 상태=======");
		System.out.println("이름 : " + this.DealerName);
		System.out.println("매출 상태 : " + this.sales + "원");
		System.out.println("보유차량 수 : " + this.dealerInventory + "대");
	}//end of printItem
}//end of class
