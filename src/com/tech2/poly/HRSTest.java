package com.tech2.poly;

abstract class Employee {
	String name;
	int salary;
	
	public abstract void calcSalary();
	public abstract void calcBonus();

}

class Salesman extends Employee{
	int annual_sales;
	public void calcSalary() {
		System.out.println("Salesman �޿� = �⺻�� + �Ǹż���");
	}
	
	public void calcBonus() {
		System.out.println("Saleman ���ʽ� = �⺻�� * 12 * 4");
	}
}
	
class Consultant extends Employee{
	int num_project;
	public void calcSalary() {
		System.out.println("Consultant �޿� = �⺻�� + ������ Ư�� ����");
	}
	
	public void calcBonus() {
		System.out.println("Consultant ���ʽ� = �⺻�� * 12 * 2");
	}
}
	
abstract class Manager extends Employee{
	int num_team;
	public void calcSalary() {
		System.out.println("Manager �޿� = �⺻�� + �� ���� ����");
	}
}
class Director extends Manager{
	public void calcBonus() {
		System.out.println("Director ���ʽ� = �⺻�� * 12 * 6");
	}
}

public class HRSTest{
	
	public static void calTax(Employee e) {
//		System.out.println("�ҵ漼�� ����մϴ�.");
		System.out.println("Salesman �� : "+(e instanceof Salesman));
		if (e instanceof Salesman) {
			Salesman s=(Salesman)e;
			s.annual_sales=6500000;
			System.out.println("Salesman �Դϴ�"+s.annual_sales);
		}else if (e instanceof Manager) {
			Manager m=(Manager)e;
			m.num_team=5;
			System.out.println("Salesman �Դϴ�"+m.num_team);
		}else if (e instanceof Consultant) {
			Consultant c=(Consultant)e;
			c.num_project=35;
			System.out.println("Salesman �Դϴ�"+c.num_project);
		}
	}
	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Director d = new Director();
		
		Employee arr[]=new Employee[3];
		
		arr[0]=s;
		arr[1]=c;
		arr[2]=d;
		
//		calTax(arr[0]);
//		calTax(arr[1]);
//		calTax(arr[2]);
		
		calTax(s);
		
//		for (Employee object : arr) {
//			calTax(object);
//		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
//		s.calcBonus();
//		c.calcBonus();
//		d.calcBonus();
		
//		calTax(s);
//		calTax(c);
//		calTax(d);
		
//		System.out.println(s.toString());
//		System.out.println(c.toString());
//		System.out.println(d.toString());
//		
//		Salesman s2 = s;
//		System.out.println(s2.toString());
//		
//		if (s.equals(s2)) {
//			System.out.println("������ ��ü�Դϴ�.");
//		} else {
//			System.out.println("���� �ٸ� ��ü�Դϴ�.");
//		}
	}
}
