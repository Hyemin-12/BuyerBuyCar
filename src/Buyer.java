/* ���� ��� : �̸�, ���
       �޼��� : ������ �޼���, ���� ���, ���� ���� ���, �������� ��� */
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
			System.out.println("*****�ܾ� �������� ���ԺҰ�*****");
		}//end of if
	}//end of buyCar
	public void printMoney(){
		System.out.println("=======�������� ���� ����=======");
		System.out.println("�̸� : " + this.Buyername);
		System.out.println("��������  : " + this.money + "��");
		System.out.println("�������� �� : " + this.buyerInventory + "��");
	}//end of printMoney
}//end of class
