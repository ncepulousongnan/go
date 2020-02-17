package shu;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ddd=new Scanner(System.in);
int n=ddd.nextInt();
tree a=new tree();
node root=new node();
root.setdata(n);
a.setroot(root);
//node n1=new node();
//node n2=new node();
//node n3=new node();
//node n4=new node();
//node n5=new node();
//node n6=new node();
//node n7=new node();
//node n8=new node();
//node n9=new node();
//node n10=new node();
//node n11=new node();
//node n12=new node();
//node n13=new node();
//n1.setdata(2);
//n2.setdata(3);
//n3.setdata(4);
//n4.setdata(5);
//n5.setdata(6);
//n6.setdata(7);
//n7.setdata(8);
//n8.setdata(9);
//n9.setdata(10);
//n10.setdata(11);
//n11.setdata(12);
//n12.setdata(13);
//n13.setdata(14);
//root.setlnode(n1);
//root.setrnode(n7);
//n1.setlnode(n2);
//n1.setrnode(n3);
//n3.setlnode(n4);
//n3.setrnode(n5);
//n5.setlnode(n6);
//n7.setlnode(n8);
//n7.setrnode(n9);
//n9.setlnode(n10);
//n10.setlnode(n11);
//n10.setrnode(n12);
//n9.setrnode(n13);
a.settree(root);
a.qian();
System.out.println();
a.zhong();
System.out.println();
a.hou();
	}

}