package jkldalks;
//构建哈希表类
import java.util.Scanner; 

public class b {
	int n;
	int e;
	int k;
	int i;
	String f;
	String h;
	node[] a;
	//node[] b;
	//node[] c;
	Scanner l=new Scanner(System.in);
	public void set()//创建哈希表，输入的第一个数据模七取余，放入对应位置，冲突采用链地址法解决
	{   
		   a=new node[7];
		 //  b=new node[7];
		//   b=new node[7];
		for(int i=0;i<7;i++)
		{
			a[i]=new node();
		//	b[i]=new node();
		//	c[i]=new node();
			a[i].setvisit(0);
		}
	}
		public void build(int e,String f,String h)//输入数据
		{  
		int  k=e%7;
		 
		   if(a[k].getvisit()==0)
		   {
			   a[k].setdata(e);
			   a[k].setname(f);
			   a[k].setadd(h);
			   a[k].setvisit(1);
		   }
		   else
		   {  node p=a[k];
			   while(p.getnext()!=null)
			   {
				   p=p.getnext();
			   }
			   node q=new node();
			   q.setdata(e);
			   q.setname(f);
			  q.setadd(h);
			   p.setnext(q);
			   q.setnext(null);
		   }
	}
		public void find(int n)//查找数据
		{  int i=1;
			k=n%7;
			if(a[k].getdata()==n)
			{
				System.out.println(n+"在第"+(k+1)+"个位置的链表的第一个位置");
			}
			else
			{
				node p=a[k];
				if(p.getnext()==null)
				{
					System.out.println("查找失败！");
				}
				while(p.getnext()!=null)
				{  	i++;
				if(p.getnext().getdata()==n)
				{
					System.out.println(n+"在第"+(k+1)+"个位置的链表的第"+i+"个位置");
					break;
				}
					p=p.getnext();
					if(p.getnext()==null)
					{
						System.out.println("查找失败！");
					}
				}
				
			}
		}
		public void delete(int e)//删除数据
		{
			int j=e%7;
			if(a[j].getdata()==e)
			{   node p=a[j].getnext();
				if(p!=null)
				{
				a[j].setdata(p.getdata());
				a[j].setname(p.getname());
				a[j].setadd(p.getadd());
				a[j].setnext(p.getnext());
				}
				else {
					a[j].setdata(0);
					a[j].setname(null);
					a[j].setadd(null);
				}
			}
			else 
			{
				node q=a[j];
				while(q.getnext()!=null)
				{   if(q.getnext().getdata()==e)
				{
					q.setnext(q.getnext().getnext());
					break;
				}
					q=q.getnext();
				}
				
			}
			
		}
	public  void show()//展示哈希表
	{
		for(int i=0;i<7;i++)
		{
			System.out.print(a[i].getdata()+" "+a[i].getname()+" "+a[i].getadd()+" ");
			node q=a[i].getnext();
			while(q!=null)
			{
				System.out.print(q.getdata()+" "+q.getname()+" "+q.getadd()+" ");
				q=q.getnext();
			}
			System.out.println();
		}
	}
}