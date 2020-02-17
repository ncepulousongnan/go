package jkldalks;
//数据结构实验——用链地址法处理冲突构建哈希表
public class node {
	int data;
	node next;
	 int visit;
	String n;
	String add;
	public void setdata(int data)
	{
		this.data=data;
	}
	public int getdata()
	{ 
		return data;
	}
	public void setname(String n)
	{
		this.n=n;
	}
	public String getname()
	{
		return n;
	}
	public void setadd(String add)
	{
		this.add=add;
	}
	public String getadd()
	{
		return add;
	}
	public void setnext(node next)
	{
		this.next=next;
	}
	public node getnext()
	{
		return next;
	}
	public void setvisit(int visit)
	{
		this.visit=visit;
	}
	public int getvisit()
	{ 
		return visit;
	}
	//public void delete(node next)
	//{
	//	this.next=next.next;
	//}
}