package shu;

public class tree {
   node root;
 int n;
public void setroot(node root)
{
	this.root=root;
}
public void qian()
{
root.front();
}
public void zhong()
{
	root.mid();
}
public void hou()
{
	root.behide();
}
public void settree(node root)
{
	root.zuo(root);
}

}