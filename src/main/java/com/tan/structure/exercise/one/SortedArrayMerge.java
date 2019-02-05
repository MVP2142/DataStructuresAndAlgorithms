package com.tan.structure.exercise.one;

/**
 * 两个有序数组合并为一个数组
 */
public class SortedArrayMerge {

    private int[] la;
    private int ia;
    private int[] lb;
    private int ib;
    private int[] lc;

    public SortedArrayMerge(int a, int b) {
        la = new int[a];
        lb = new int[b];
        ia = ib = 0;
    }

    public boolean putA(int v) {
        if (la.length - 1 >= ia) {
            la[ia] = v;
            ia++;
            return true;
        }
        return false;
    }

    public boolean putB(int v) {
        if (lb.length - 1 >= ib) {
            lb[ib] = v;
            ib++;
            return true;
        }
        return false;
    }

    public int[] merge() {
        int ka = 0, kb = 0;
        int kc = 0;
        lc = new int[la.length + lb.length];
        while (ka < la.length || kb < lb.length) {
            if (ka == la.length && kb < lb.length) {
                lc[kc] = lb[kb];
                kb++;
            } else if (ka < la.length && kb == lb.length) {
                lc[kc] = la[ka];
                ka++;
            } else {
                if (la[ka] <= lb[kb]) {
                    lc[kc] = la[ka];
                    ka++;
                } else {
                    lc[kc] = lb[kb];
                    kb++;
                }
            }
            kc++;
        }
        return lc;
    }

    public void print() {
        System.out.print("[");
        for (int i : la) {
            System.out.print(i + " ");
        }
        System.out.println("]");
        System.out.print("[");
        for (int i : lb) {
            System.out.print(i + " ");
        }
        System.out.println("]");
        System.out.print("[");
        for (int i : lc) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

}
