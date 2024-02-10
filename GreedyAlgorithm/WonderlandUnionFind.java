package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class UnionFindEdge implements Comparable<UnionFindEdge> {
    int v1;
    int v2;
    int cost;

    public UnionFindEdge(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }

    @Override
    public int compareTo(UnionFindEdge o) {
        return this.cost - o.cost;
    }
}

public class WonderlandUnionFind {

    static int unf[];
    static ArrayList<UnionFindEdge> arrayList;

    public static int find(int v) {
        if(v==unf[v]) return unf[v];
        else return unf[v] = find(unf[v]);
    }

    public static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if(fa!=fb) unf[fa] = fb;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int e = sc.nextInt();

        unf = new int[v + 1];
        arrayList = new ArrayList<>();

        for (int i = 1; i <= v; i++) {
            unf[i] = i;
        }

        for (int i = 0; i < e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            arrayList.add(new UnionFindEdge(a, b, c));
        }

        Collections.sort(arrayList);
        int sum = 0;

        for (UnionFindEdge unionFindEdge : arrayList) {
            int fv1 = find(unionFindEdge.v1);
            int fv2 = find(unionFindEdge.v2);
            if (fv1 != fv2) {
                sum += unionFindEdge.cost;
                union(fv1, fv2);
            }
        }



        System.out.println(sum);

    }
}
