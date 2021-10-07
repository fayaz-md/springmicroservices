package com;

public class Employee {
	private Address add; 
	
	private int id;
	private String name;
	private float salary;
	
	Employee()
	{
		System.out.println(" Default Constructor");
	}
	public Employee(int id, String name, float salary,Address add) {
		super();
		System.out.println(" Parameterized Constructor");
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.add=add;
	}
	public void display()
	{
		System.out.println("This is simple display method");
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [add=" + add + ", id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
