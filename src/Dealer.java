/* ���� ��� : �����̸�, ����, �������
       �޼��� : ������ �޼���, ���� �ȴ�, ������� ��� */
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
			System.out.println("*****��� �������� �ǸźҰ�*****");
		}//end of if
	}//end of sold
	public void printItem() {
		System.out.println("=======�Ǹ����� ���� ����=======");
		System.out.println("�̸� : " + this.DealerName);
		System.out.println("���� ���� : " + this.sales + "��");
		System.out.println("�������� �� : " + this.dealerInventory + "��");
	}//end of printItem
}//end of class
