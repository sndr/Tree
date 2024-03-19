
public class SimpleBinaryTree{

    private String value;
    private SimpleBinaryTree parent;
    private SimpleBinaryTree leftChild;
    private SimpleBinaryTree rightChild;

    public SimpleBinaryTree(){
    }

    public SimpleBinaryTree(String value){
        this.value = value;
        this.parent = null;
        this.leftChild = null;
        this.rightChild = null;
    }

    public SimpleBinaryTree(String value, SimpleBinaryTree parent, SimpleBinaryTree leftChild, SimpleBinaryTree rightChild){
        this.value = value;
        this.parent = parent;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public SimpleBinaryTree getParent() {
        return this.parent;
    }

    public void setParent(SimpleBinaryTree parent) {
        this.parent = parent;
    }

    public SimpleBinaryTree getLeftChild() {
        return this.leftChild;
    }

    public void setLeftChild(SimpleBinaryTree leftChild) {
        leftChild.setParent(this);
        this.leftChild = leftChild;
    }

    public SimpleBinaryTree getRigthChild() {
        return this.rightChild;
    }

    public void setRigthChild(SimpleBinaryTree rigthChild) {
        rigthChild.setParent(this);
        this.rightChild = rigthChild;
    }

    public Boolean isLeftChildExists() {
        if (this.leftChild != null) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean isRigthChildExists() {
        if (this.rightChild != null) {
            return true;
        } else {
            return false;
        }
    }

    public String getRole() {
        String role = "";
        if (this.parent == null) {
            role =  "parent";
        } else if (this.parent.leftChild == this) {
            role =  "leftChild";
        } else if (this.parent.rightChild == this) {
            role = "rightChild";
        } else {
            role = "noTree";
        }
        return role;
    }

    public SimpleBinaryTree getSibling() {
        SimpleBinaryTree sibling = new SimpleBinaryTree();

        if (getRole() == "leftChild") {
            sibling = this.parent.getRigthChild();
        } else if (getRole() == "rightChild") {
            sibling = this.parent.getLeftChild();
        }

        return sibling;
    }

    public void printPosOrder(){
        if (isLeftChildExists()){
            this.leftChild.printPosOrder();
        } if (isRigthChildExists()){
            this.rightChild.printPosOrder();
        }
        System.out.print(this.getValue() + " ");
    }

    public void printPreOrder(){
        System.out.print(this.getValue() + " ");
        if (isLeftChildExists()){
            this.leftChild.printPreOrder();
        } if (isRigthChildExists()){
            this.rightChild.printPreOrder();
        }
    }
    
}
