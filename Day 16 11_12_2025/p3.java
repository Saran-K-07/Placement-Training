import java.util.*;

class p3 {
    public static void heapify(ArrayList<Integer> ar, int i) {
        while (true) {
            int p = i;
            int leftChild = 2 * i + 1;
            int rightChild = 2 * i + 2;
            if (leftChild < ar.size() && ar.get(leftChild) > ar.get(p)) {
                p = leftChild;
            }
            if (rightChild < ar.size() && ar.get(rightChild) > ar.get(p)) {
                p = rightChild;
            }
            if (p == i) {
                break;
            }
            int temp = ar.get(i);
            ar.set(i, ar.get(p));
            ar.set(p, temp);
            i = p;
        }
    }

    public static void deletionHeap(ArrayList<Integer> ar) {
        ar.set(0, ar.get(ar.size() - 1));
        ar.remove(ar.size() - 1);
        heapify(ar, 0);
    }

    public static void insertHeap(ArrayList<Integer> ar, int d) {
        ar.add(d);
        int i = ar.size() - 1;
        while (i >= 0) {
            int parent = (i - 1) / 2;
            if (ar.get(parent) > ar.get(i)) {
                int temp = ar.get(i);
                ar.set(i, ar.get(parent));
                ar.set(parent, temp);
            } else {
                break;
            }
            i = parent;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 7, 8, 9, 2, 4, 17, 18, 31, 0, 12, 11};
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i : arr) {
            ar.add(i);
        }
        int n = ar.size();
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(ar, i);
        }
        for (int i : ar) {
            System.out.print(i + " ");
        }
        deletionHeap(ar);
        System.out.println();
        for (int i : ar) {
            System.out.print(i + " ");
        }
    }
}