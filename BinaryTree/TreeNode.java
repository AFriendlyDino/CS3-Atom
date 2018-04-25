public class TreeNode
{
  private TreeNode left;
  private TreeNode right;
  private int value;
  public TreeNode(int v, TreeNode l, TreeNode r)
  {
    value = v;
    left = l;
    right = r;
  }

  public TreeNode getLeft()
  {
    return left;
  }
  public TreeNode getRight()
  {
    return right;
  }
  public int getValue()
  {
    return value;
  }
  public void setLeft(TreeNode x)
  {
    left = x;
  }
  public void setRight(TreeNode x)
  {
    right = x;
  }

  public void add(int val, TreeNode tree)
  {
    if(tree == null)
      tree = new TreeNode(val, null, null);
    if(val < tree.getValue())
      tree.setLeft(tree.add(val, tree.getLeft()));
    if(val > tree.getValue())
      tree.setRight(add(val, tree));
  }
}
