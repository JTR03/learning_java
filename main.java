

public class main {
    public static void Main(String[] args) {
        Classes triangleA = new Classes(6, 8,5, 6, 5);
        Classes triangleB = new Classes(8, 12, 4, 4, 4);

        double areaA = triangleA.findArea();
        System.out.println(areaA);

        double areaB = triangleB.findArea();
        System.out.println(areaB);

        System.out.println(triangleA.sideLen2);
        System.out.println(triangleB.base);

        System.out.println(Classes.numOfSides);
        

    }
}
