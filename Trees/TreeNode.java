public class TreeNode<T> {

    private T data;
    private TreeNode<T> left;
    private TreeNode<T> right;

    public TreeNode(T _data) { data = _data; left = null; right = null;}
    public TreeNode() { this(null); }

    public T  getData() {return data;}
    public TreeNode<T>  getLeft(){ return left;}
    public TreeNode<T>  getRight() { return right;}

    //setters
    public void setData(T _data) { data = _data;}
    public void setLeft(TreeNode<T>  _left) { left = _left;}
    public void setRight(TreeNode<T> _right) {right = _right;}
    public void setRightNull() { right = null;}
    public void setLeftNull() { left = null; }


    @Override
    public String toString(){ return (data == null)? "NULL" : data.toString();}
}