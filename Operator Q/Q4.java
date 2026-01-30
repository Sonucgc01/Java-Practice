public class Q4 {
    public static void main(String[] args) {

        int baseBonus = 1000;
        int tasksCompleted = 5;

        int bonus = (tasksCompleted++ > 5 ? baseBonus + 200 * tasksCompleted
                : tasksCompleted < 3 ? baseBonus - 50 * tasksCompleted : baseBonus + 100 * tasksCompleted);

        System.out.print(bonus);
    }
}
