package jkldalks;
//�����򣬲���
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
                             //���ϣ����д��һЩ����
			k.build(113358,"��һ","����");
			k.build(147596,"���","����");
			k.build(178758,"����","���");
			k.build(131328,"����","�Ϻ�");
			k.build(178111,"����","����");
			k.build(139916,"����","�Ͼ�");
			k.build(145997,"����","�㶫");
			k.build(258987,"����","����");
			k.build(399869,"�Ծ�","ʯ��ׯ");
			k.build(329719,"Ǯʮ","�ȷ�");
		 //  i++;
		while(true)
		{
	System.out.println("�������������S���鿴��ǰ��ϣ����A��������ݣ���D��ɾ�����ݣ���F���������ݣ���E���˳�");
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
