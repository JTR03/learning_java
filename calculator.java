// implimenting passing parameters to function
// calculating meal price

public class calculator {
    public static double mealPrice(double meal, double tip, double tax) {
        double tipVal = tip * meal;
        double taxVal = tax * meal;
        double total = meal + tipVal + taxVal;
        return total;
    }

    public static void main(String[] args) {
        double groupTotal = mealPrice(100, .1, .14);
        System.out.println(groupTotal);

        double indivCost = groupTotal / 4;
        System.out.println(indivCost);
    }
}
