package main;

public class Garage {
	protected int num;
	
	protected void park(Object o)
	{
		if(o instanceof Car || o instanceof Bike) {
			num++;
			System.out.println(o.getClass().getName()+"�� �����߽��ϴ�. (�� "+num+"�� ������)");
		}
		
		else
			System.out.println(o.getClass().getName()+"�� ���� �Ұ��մϴ�");
			
	}
}
