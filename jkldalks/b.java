package jkldalks;
//������ϣ����
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
	public void set()//������ϣ������ĵ�һ������ģ��ȡ�࣬�����Ӧλ�ã���ͻ��������ַ�����
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
		public void build(int e,String f,String h)//��������
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
		public void find(int n)//��������
		{  int i=1;
			k=n%7;
			if(a[k].getdata()==n)
			{
				System.out.println(n+"�ڵ�"+(k+1)+"��λ�õ�����ĵ�һ��λ��");
			}
			else
			{
				node p=a[k];
				if(p.getnext()==null)
				{
					System.out.println("����ʧ�ܣ�");
				}
				while(p.getnext()!=null)
				{  	i++;
				if(p.getnext().getdata()==n)
				{
					System.out.println(n+"�ڵ�"+(k+1)+"��λ�õ�����ĵ�"+i+"��λ��");
					break;
				}
					p=p.getnext();
					if(p.getnext()==null)
					{
						System.out.println("����ʧ�ܣ�");
					}
				}
				
			}
		}
		public void delete(int e)//ɾ������
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
	public  void show()//չʾ��ϣ��
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