package SS12.Duyet_hau_tu;
class Tnode{
    int data;
    Tnode right;
    Tnode left;
    Tnode(int x){
        data=x;
        left=right=null;
    }
    Tnode(int x, Tnode ll, Tnode rr){
        data=x;
        left=ll;
        right=rr;
    }
}
public class Binary {
    Tnode root;
    void taoCay(){
        Tnode A= new Tnode(14,new Tnode(10),new Tnode(19));
        Tnode B= new Tnode(35,new Tnode(31),new Tnode(42));
        Tnode root= new Tnode(27,A,B);
        this.root=root;
    }
    void duyetHauTu(Tnode node){
        if(node !=null){
            duyetHauTu(node.left);
            duyetHauTu(node.right);
            System.out.println(node.data+" ");
        }
    }
    void hauTu(){
        duyetHauTu(root);
    }

    public static void main(String[] args) {
        Binary b= new Binary();
        b.taoCay();
        System.out.println("==Duyet Hau Tu==");
        b.hauTu();
    }
}
