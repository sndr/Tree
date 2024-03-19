
public class Main{
    public static void main(String[] args) {

        SimpleBinaryTree root = new SimpleBinaryTree("-"); // raiz
        SimpleBinaryTree n1 = new SimpleBinaryTree("/"); // n1 pai
        SimpleBinaryTree n2 = new SimpleBinaryTree("+"); // n2 pai
        SimpleBinaryTree n3 = new SimpleBinaryTree("*"); // n1 filho left
        SimpleBinaryTree n4 = new SimpleBinaryTree("+"); // n1 filho right
        SimpleBinaryTree n5 = new SimpleBinaryTree("*"); // n2 filho left
        SimpleBinaryTree n6 = new SimpleBinaryTree("6"); // n2 filho right
        SimpleBinaryTree n7 = new SimpleBinaryTree("+"); // n3 filho do filho do n1 left
        SimpleBinaryTree n8 = new SimpleBinaryTree("3"); // n3 filho do filhjo do n1 right
        SimpleBinaryTree n9 = new SimpleBinaryTree("-");// n4 filho do filho do n1 left
        SimpleBinaryTree n10 = new SimpleBinaryTree("2"); // n4 filho do filho do n1 right
        SimpleBinaryTree n11 = new SimpleBinaryTree("3"); // n5 filho do n2 left
        SimpleBinaryTree n12 = new SimpleBinaryTree("-"); // n5 filho do n2 right
        SimpleBinaryTree n13 = new SimpleBinaryTree("3"); // n7 filho do n3 left
        SimpleBinaryTree n14 = new SimpleBinaryTree("1"); // n7 filho do n3 right
        SimpleBinaryTree n15 = new SimpleBinaryTree("9"); // n9 filho do n4 left
        SimpleBinaryTree n16 = new SimpleBinaryTree("5"); // n9 filho do n4 right
        SimpleBinaryTree n17 = new SimpleBinaryTree("7"); // n12 filho do n5 left
        SimpleBinaryTree n18 = new SimpleBinaryTree("4"); // n12 filho do n5 right

        root.setLeftChild(n1);// filho 1 recebe /
        root.setRigthChild(n2); // filho 2 recebe +

        n1.setLeftChild(n3); // 
        n1.setRigthChild(n4);

        n4.setLeftChild(n9);
        n4.setRigthChild(n10);

        n9.setLeftChild(n15);
        n9.setRigthChild(n16);

        n3.setLeftChild(n7);
        n3.setRigthChild(n8);
        
        n7.setLeftChild(n13);
        n7.setRigthChild(n14);

        n2.setLeftChild(n5);
        n2.setRigthChild(n6);

        n5.setLeftChild(n11);
        n5.setRigthChild(n12);

        n12.setLeftChild(n17);
        n12.setRigthChild(n18);

        //System.out.println(root.getRole());
        //System.out.println(n1.getSibling().getValue());
        //System.out.println(n3.isRigthChildExists());

        ArithmeticExpressionEvaluator Arithmetic = new ArithmeticExpressionEvaluator(); // the new function

        root.printPreOrder();
        System.out.println("\n----------\n");
        root.printPosOrder();
        
        System.out.println("\n---------- PREODERNADA\n");
        System.out.println(Arithmetic.evaluatePreOrderExpression("- / * + 3 1 3 + - 9 5 2 + * 3 - 7 4 6"));
        System.out.println("\n---------- POSORDENADA\n");
        System.out.println(Arithmetic.evaluatePosOrderExpression("3 1 + 3 * 9 5 - 2 + / 3 7 4 - * 6 + -"));


        //System.out.println(Arithmetic.evaluatePosOrderExpression());
        
    }
}