/*4.Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and
'department' respectively. Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these
classes and print the same.*/
import java.util.*;
class Member
{
	String Name,address;int age;long Ph_no;double Salary;
	Member()
	{
		Name=" ";
		Address=" ";
		age=0;
		Ph_no=000000;
		Salary=0.0;
	}
	double printSalary()
	{
		return Salary;
	}
}
class Employee extends Member
{
	String Specialization;
}
class Manager extends Member
{
	String department;
}


