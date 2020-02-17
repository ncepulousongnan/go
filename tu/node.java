package tu;
//数据结构实验——图的遍历
//创建顶点类
public class node {
int data;
node next;
node hx;
 int visit;
public void setdata(int data)
{
	this.data=data;
}
public int getdata()
{ 
	return data;
}

public void setnext(node next)
{
	this.next=next;
}
public node getnext()
{
	return next;
}
//设置被访问的标识符
public void setvisit(int visit)
{
	this.visit=visit;
}
public int getvisit()
{ 
	return visit;
}	
	
}

