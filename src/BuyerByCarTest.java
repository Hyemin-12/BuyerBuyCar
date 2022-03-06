public class BuyerByCarTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b1 = new Buyer("최혜민", 10000, 1);
		Dealer d1 = new Dealer("이미림", 200, 3);
		//물건 구입 전
		b1.printMoney();
		d1.printItem();
		//물건 구입 후
		b1.buyCar(d1, 4);
		b1.printMoney();
		d1.printItem();
	}//end of main
}//end of class
