package SS12.tim_kiem_cay_nhi_phan;

public class TestBST {
    public static void main(String[] args) {
        BST<String> tree=new BST<>();
        tree.insert("E");
        tree.insert("F");
        tree.insert("A");
        tree.insert("L");
        //duyet cay
        System.out.println("Inorder (sorted) : ");
        tree.inorder();
        System.out.println("The number of nodes is: "+tree.getSize());
    }
}
