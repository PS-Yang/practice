package practice;

public class Node2 {
	public boolean val;
    public boolean isLeaf;
    public Node2 topLeft;
    public Node2 topRight;
    public Node2 bottomLeft;
    public Node2 bottomRight;

    public Node2() {}

    public Node2(boolean _val,boolean _isLeaf,Node2 _topLeft,Node2 _topRight,Node2 _bottomLeft,Node2 _bottomRight) {
        val = _val;
        isLeaf = _isLeaf;
        topLeft = _topLeft;
        topRight = _topRight;
        bottomLeft = _bottomLeft;
        bottomRight = _bottomRight;
    }
}
