package shu;
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
 public node getrnode(node rnode)
 {
	 return rnode;
 }
 public void front()
 {
	 System.out.print(data+" ");
	 if(lnode!=null)
	 {
		 lnode.front();
	 }
	 if(rnode!=null)
	 {
		 rnode.front();
	 }
 }
 public void mid()
 {
	 if(lnode!=null)
	 {
		 lnode.mid();
	 }
	 System.out.print(data+" ");
	 if(rnode!=null)
	 {
		 rnode.mid();
	 }
 }
 public void behide()
 {
	 if(lnode!=null)
	 {
		 lnode.behide();
	 }
	 if(rnode!=null)
	 {
		 rnode.behide();
	 }
	 System.out.print(data+" ");
 }
public void zuo(node node)
{    int data=h.nextInt();

    if(data==0)
{ node.setlnode(null);
int n=h.nextInt();
    if(n==0)
{ node.setrnode(null);
}
    else{node rnode=new node();
    node.setrnode(rnode);
    rnode.setdata(n);
    rnode.zuo(rnode);
    }
}
    else{
    	node lnode=new node();
	node.setlnode(lnode);  
    lnode.setdata(data);
    lnode.zuo(lnode);
    int n=h.nextInt();
    if(n==0)
    { node.setrnode(null);
    return;
    }
        else{node rnode=new node();
        node.setrnode(rnode);
        rnode.setdata(n);
        rnode.zuo(rnode);
        }
    }
	
	

}
}
