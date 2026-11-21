import java.io.*;
class employee
{
	int empno;
	String empname;
	int empexp;
	void getdetails(int x,String y,int z)
	{
		empno=x;
		empname=y;
		empexp=z;
	}	
	void display()
	{
			System.out.println(empno+ "\t" +empname+ "\t" +empexp);
		}
	}			
public class Sorting {
	public static void main(String[] args) throws IOException {
		int i,j,n,empno,empexp;
		String empname;
		employee emp[]=new employee[20];
		DataInputStream a=new DataInputStream(System.in);
		System.out.println("EMPLOYEE DETAILS");
		System.out.println("_____________");
		System.out.println("Enter the no.of.employee");
		n=Integer.parseInt(a.readLine());
		for(i=0;i<n;i++)
		{
			System.out.println("employee["+(i+1)+"]:");
			System.out.println("Enter the employee number");
			empno=Integer.parseInt(a.readLine());
			System.out.println("Enter the employee experience");
			empexp=Integer.parseInt(a.readLine());
			System.out.println("enter the employee name");
			empname=(a.readLine());
			emp[i]=new employee();
			emp[i].getdetails(empno,empname,empexp);
		}
	    	System.out.println("BEFORE SORTING");
	    	System.out.println("___________");
	    	System.out.println("empno empname empexp");
		    for(i=0;i<n;i++)
		    {
		    	emp[i].display();
		    }
	    	for(i=0;i<n;i++)
		    for(j=i+1;j<n;j++)
		    {        
			    employee t=new employee();
		    	if((emp[j].empname.compareTo(emp[i].empname)<0))
		    	{
			    	t=emp[i];
			    	emp[i]=emp[j];
		    		emp[j]=t;
		    	}
		    }
            System.out.println("Employee details after sorting");
            System.out.println("empno empname empexp");
            for(i=0;i<n;i++)
            {
            	emp[i].display();
            }
		}
	}