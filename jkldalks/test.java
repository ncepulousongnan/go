package jkldalks;
//主程序，测试
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner l=new Scanner(System.in);
	//	int n=l.nextInt();
		//String x=l.toString();
		b k=new b();
		k.set();
	 int i=0;
		//while(i<3)
		// 	int n=l.nextInt();
			//String x=l.toString();
			//String o=l.toString();
                             //向哈希表中写入一些数据
			k.build(113358,"王一","保定");
			k.build(147596,"燕二","北京");
			k.build(178758,"张三","天津");
			k.build(131328,"李四","上海");
			k.build(178111,"刘五","杭州");
			k.build(139916,"孙六","南京");
			k.build(145997,"郭七","广东");
			k.build(258987,"丁八","深圳");
			k.build(399869,"赵九","石家庄");
			k.build(329719,"钱十","廊坊");
		 //  i++;
		while(true)
		{
	System.out.println("输入操作符，“S”查看当前哈希表，“A”添加内容，“D”删除内容，“F”查找内容，“E”退出");
		char z=l.next().charAt(0);
		if(z=='S')
		{
		  k.show();
		}
		if(z=='F')
		{int j=l.nextInt();
	    k.find(j);
		}
		if(z=='D')
		{int o=l.nextInt();
		k.delete(o);	
	//	k.show();
		}
		if(z=='A')
		{
			int n=l.nextInt();
			String x=l.next();
			String m=l.next();
			k.build(n,x,m);
		//	k.show();
		}
		if(z=='E')
		{
			break;
		}
	if(z!='S'&&z!='E'&&z!='F'&&z!='D'&&z!='A')
		{
			System.out.println("error");
		}
	 	}
	
	}

}
