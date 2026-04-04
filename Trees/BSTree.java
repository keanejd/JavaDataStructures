
import java.util.Comparator;

public class BSTree<T> {

    private int nodeCount;
    private TreeNode<T> root;
    private Comparator<T> comparator;
    private Class<T> type; 

    public BSTree(Comparator<T> _comparator, Class<T> _type) {  
        nodeCount = 0; 
        root = null; 
        comparator = _comparator; 
        type = _type; 
    }
    
    public BSTree(T _data, Comparator<T> _comparator, Class<T> _type)  { 
        this(_comparator, _type);
        root = new TreeNode(_data); 
        nodeCount++;
    }

    public boolean isEmpty() {return getSize() == 0;} 
    public int getSize() {return nodeCount;}
    public Class<T> getType() { return type;}

    private TreeNode<T> add(TreeNode<T> _node, T _data) {
        if(_node == null) 
            return new TreeNode<T>(_data);  
        if(comparator.compare(_data, _node.getData()) < 0 ) 
            _node.setLeft( add(_node.getLeft(), _data));
        else
            _node.setRight( add(_node.getRight(), _data));

        return _node;
    }

    public boolean addNode(T _data ) {
        if( contains(root, _data) ) {
            return false;
        else {
            root = add(root, _data);
            nodeCount++;
            return true;
        }
    }

    private boolean contains(TreeNode<T> _node, T _data) {
        if(node == null ) return false;

        if(_data ==  ) return true;
        
        if( comparator.compare(_data, _node.getData() ) < 0  )
            return contains(_node.getLeft(), _data);
        else if( comparator.compare(_data, _node.getData() > 0) )
            return contains(_node.getRight(), _data);
        
        return true;
    }

    public bool containsData(T _data){
        return contains(root, _data);
    }





}