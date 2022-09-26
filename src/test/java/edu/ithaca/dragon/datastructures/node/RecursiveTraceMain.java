package edu.ithaca.dragon.datastructures.node;

public class RecursiveTraceMain {

    public static int total(LinkedNode<Integer> current){
        if (current == null){
            return 0;
        }
        else {
            int totalrecursions = total(current.getNext());
            int numberTotal = totalrecursions + current.getItem();
            return numberTotal;
        }
    }

    public static int totalTail(LinkedNode<Integer> current, int totalsumfunction){
        if (current == null){
            return totalsumfunction;
        }
        else {
            int numberTotal = totalsumfunction + current.getItem();
            return totalTail(current.getNext(), numberTotal);
        }
    }

    public static int totalTail(LinkedNode<Integer> current){
        return totalTail(current, 0);
    }

    public static void main(String[] args){
        LinkedNode<Integer> example = new LinkedNode<>(1, new LinkedNode<>(2, new LinkedNode<>(3, new LinkedNode<>(4))));

        int totalAnswer = total(example);
        System.out.println(totalAnswer);

        int totalTailAnswer = totalTail(example);
        System.out.println(totalTailAnswer);
    }
    
}
