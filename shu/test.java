package shu;
//主程序，测试
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ddd=new Scanner(System.in);
//输入根节点的值
int n=ddd.nextInt();
tree a=new tree();
node root=new node();
root.setdata(n);
//root=a.getroot();
//创建二叉树
a.settree(root);
//三种遍历方法
a.qian(root);
System.out.println();
a.zhong(root);
System.out.println();
a.hou(root);
	}

}