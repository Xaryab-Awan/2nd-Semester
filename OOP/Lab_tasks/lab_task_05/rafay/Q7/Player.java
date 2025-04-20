package Q7;

class Player {
    private String Name;
    private String Role;
    private String PerformanceStatistics;
    Player(String name, String Role, String performanceStatistics) {
        this.Name = name;
        this.Role = Role;
        this.PerformanceStatistics = performanceStatistics;
    }
    void Display() {
        System.out.println("Name: " + Name);
        System.out.println("Role: " + Role);
        System.out.println("Performance Statistics: " + PerformanceStatistics);
        System.out.println();
    }
}