package tugasalgodat6;
public class  node{
    //paket data terlihat anggota
    int element;
    node left;
    node right;
    //konstruktor
    public node(){
    }
    public node(int theElement){
        element = theElement;
    }
    public node(int theElement, node theleftChild, node therightChild){
        element = theElement;
        left = theleftChild;
        right = theleftChild;
    }
}
