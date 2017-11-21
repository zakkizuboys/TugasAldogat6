package tugasalgodat6;
public class Boosters {
    int fromleaf, fromparent;
    boolean booster;
    public node root;
    public Boosters(){
    }
    public Boosters(int a){
        fromparent = a;
    }
    @Override
    public String toString(){
        return booster + " " + fromleaf + " " + fromparent;
    }
    public void insert(int id){
        node newnode = new node();
        newnode.element = id;
        if(root == null)
            root = newnode;
        else{
            node current = root;
            node parent;
            while(true){
                parent = current;
                if(id < current.element){
                    current = current.left;
                    if(current == null){
                        parent.left = newnode;
                        return;
                    }
                }
                else{
                    current = current.right;
                    if(current == null){
                        parent.right = newnode;
                        return;
                    }
                }
            }
        }
    }
    public void place(node x){
        Boosters b = new Boosters(x.element);
        b.fromleaf = 0;
        node y = x.left;
        if(y != null){
            Boosters boo = new Boosters(y.element);
            int tolerance = 2;
            int degrade = boo.fromleaf + boo.fromparent;
            if(degrade > tolerance){
                boo.booster = true;
                boo.fromleaf = boo.fromparent;
            }
            else
                boo.fromleaf = degrade;
        }
        y = x.right;
        if(y != null){
            Boosters bo = new Boosters(y.element);
            int tolerance = 2;
            int degrade = bo.fromleaf + bo.fromparent;
            if(degrade > tolerance){
                bo.booster = true;
                degrade = bo.fromparent;
            }
            b.fromleaf = Math.max(b.fromleaf, degrade);
        }
    }
}
