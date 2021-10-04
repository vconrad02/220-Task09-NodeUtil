package edu.ithaca.dragon.datastructures.node;

public class RecursiveTraceMain {

    public static int tot(LinkedNode<Integer> current){
        if (current == null){
            return 0;
        }
        else {
            int tr = tot(current.getNext());
            tr = tr + current.getItem();
            return tr;
        }
    }

    public static int totT(LinkedNode<Integer> current, int tsf){
        if (current == null){
            return tsf;
        }
        else {
            int nt = tsf + current.getItem();
            return totT(current.getNext(), nt);
        }
    }

    public static int totT(LinkedNode<Integer> current){
        return totT(current, 0);
    }

    public static void main(String[] args){
        LinkedNode<Integer> example = new LinkedNode<>(1, new LinkedNode<>(2, new LinkedNode<>(3, new LinkedNode<>(4))));

        int totAns = tot(example);
        System.out.println(totAns);

        int totTAns = tot(example);
        System.out.println(totTAns);
    }
    
}
