package tu;
import java.util.Scanner;
//创建图类，写构造图和两种遍历算法
public class tutu {
	int n;
	int e;
	int k;
	int i;
	node[] a;
	Scanner l=new Scanner(System.in);
public void build(int n,int e)//创建图
{    
	   a=new node[n];
	for(int i=0;i<n;i++)
	{
		a[i]=new node();
		a[i].setdata(i+1);
	}
	for(int k=0;k<e;k++)
	{   int z=l.nextInt();
	   int x=l.nextInt();
		node q=new node();
		node p=a[z-1];
		q.setdata(x);
		while(p.getnext()!=null)
		{
			p=p.getnext();
		}
		p.setnext(q);
		q.setnext(null);
		
	}
}
public node getf(int i)//输入开始的顶点
{
	return a[i];
}
public void sd(tutu s,node b)//深度遍历
{  
        System.out.print(b.getdata());
        b.setvisit(1);
        node q=b.getnext(); 
        while(q!=null)
       {     node p=a[(q.getdata())-1];
       	if(p.getvisit()==0)
       	{
       		s.sd(s, p);
       		q=q.getnext();
       	}
       	else
        	{
       	q=q.getnext();
       	}
        }
}
public void gd(tutu s,node e)//广度遍历
{      int r=0;
       int i=0;
	int c[]=new int [100];
	System.out.print(e.getdata());
	e.setvisit(2);
	node g=e.getnext();
	do
	{ 
	while(g!=null)
{    node h=a[g.getdata()-1];
		if(h.getvisit()==1)
	{    i++;
		c[i]=h.getdata();
		System.out.print(h.getdata());
		h.setvisit(2);	
	}
g=g.getnext();
	}
if(i!=r)
{    r++;
 node j=a[(c[r])-1];	
 g=j.getnext();

}
}
while(g!=null||r!=i);

}
}
