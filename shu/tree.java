package shu;
//二叉树类，有三种遍历方法和二叉树的建立方法，都是调用根节点的方法
public class tree {
	 node root;
	 int n;
	public node getroot()
	{
	    return root;
	}
	public void qian(node root)
	{
	root.front(root);
	}
	public void zhong(node root)
	{
		root.mid(root);
	}
	public void hou(node root)
	{
		root.behide(root);
	}
	public void settree(node root)
	{
		root.zuo(root);
	}
}
