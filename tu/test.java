package tu;
//主程序，测试
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner l=new Scanner(System.in);
int n=l.nextInt();
tutu p=new tutu();
//创建图，8为定点数，20为边数，可变
p.build(8,20);
//输入第一个顶点，由这个顶点开始遍历算法
node q=p.getf(n);
//深度遍历
p.sd(p,q);
System.out.println();
//广度遍历
p.gd(p,q);
	}

}