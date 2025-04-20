package Q7;

class Player {
    private String name;
    private String role;
    private int performanceStats;

    public Player(String var1, String var2, int var3) {
        this.name = var1;
        this.role = var2;
        this.performanceStats = var3;
    }

    public String getName() {
        return this.name;
    }

    public String getRole() {
        return this.role;
    }

    public int getPerformanceStats() {
        return this.performanceStats;
    }
}
