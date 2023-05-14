package disjoint_union;

class DSU {

    private int[] par;
    private int n;

    public DSU(int n) {
        this.n = n;
        this.par = new int[n];

        init();
    }

    void init() {
        for(int i = 0; i < n; i++) {
            par[i] = i;
        }
    }

    void union(int u, int v) {

        int parU = find(u);
        int parV = find(v);

        if(parU != parV) {
            par[parU] = parV;
        }
    }

    int find(int u) {
        if(u == par[u]) return u;
        return par[u] = find(par[u]);
    }
}
