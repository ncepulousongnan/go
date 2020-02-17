package shu;
//数据结构实验——二叉树的遍历
//节点类的创建，有三种遍历方法和二叉树的创建
import java.util.Scanner;
public class node {
	 int data;
	 node lnode;
	 node rnode;
	 Scanner h=new Scanner(System.in);
	 public void setdata(int data)
	 {
		 this.data=data;
	 }
	 public int getdata()
	 {
		 return data;
	 }
	 public void setlnode(node lnode)
	 {
		 this.lnode=lnode;
	 }

	 public node getlnode()
	 {
		 return lnode;
	 }
	 public void setrnode(node rnode)
	 {
		 this.rnode=rnode;
	 }
	 public node getrnode()
	 {
		 return rnode;
	 }
	 public void front(node n)//前序遍历
	 {
		 System.out.print(n.getdata()+" ");
		 if(n.getlnode()!=null)
		 {
			n.getlnode().front(n.getlnode());
		 }
		 if(n.getrnode()!=null)
		 {
			 n.getrnode().front(n.getrnode());
		 }
	 }
	 public void mid(node n)//中序遍历
	 {
		 if(n.getlnode()!=null)
		 {
			 n.getlnode().mid(n.getlnode());
		 }
		 System.out.print(n.getdata()+" ");
		 if(n.getrnode()!=null)
		 {
			 n.getrnode().mid(n.getrnode());
		 }
	 }
	 public void behide(node n)//后序遍历
	 {
		 if(n.getlnode()!=null)
		 {
			 n.getlnode().behide(n.getlnode());
		 }
		 if(n.getrnode()!=null)
		 {
			 n.getrnode().behide(n.getrnode());
		 }
		 System.out.print(n.getdata()+" ");
	 }
	 public void zuo(node node)//创建二叉树
	 {   
		 int x=h.nextInt();
		 if(x==0)
		 {
			 node.setlnode(null);
			 int y=h.nextInt();
			 if(y==0)
			 {
			 node.setrnode(null);
			 }
			 else
			 {
			 node q=new node();
			 q.setdata(y);
			 node.setrnode(q);
			 q.zuo(q);
			 } 
		 }
		 else
		 {
			 node p=new node();
			 p.setdata(x);
			 node.setlnode(p);
			p.zuo(p);
			if(node.getlnode()!=null)
			 {   
			 int y=h.nextInt();
			 if(y==0)
			 {
			 node.setrnode(null);
			 }
			 else
			 {
			 node q=new node();
			 q.setdata(y);
			 node.setrnode(q);
			 q.zuo(q);
			 }
			}
		 }
		 }
		 
	 }
	
	

