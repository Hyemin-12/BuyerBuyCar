public class BuyerByCarTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b1 = new Buyer("������", 10000, 1);
		Dealer d1 = new Dealer("�̸̹�", 200, 3);
		//���� ���� ��
		b1.printMoney();
		d1.printItem();
		//���� ���� ��
		b1.buyCar(d1, 4);
		b1.printMoney();
		d1.printItem();
	}//end of main
}//end of class
