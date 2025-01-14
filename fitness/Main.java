package fitness;

public class Main {
    public static void main(String[] args) {
        FitnessApp app = new FitnessApp();

        User user1 = new User("Merey", 18);
        User user2 = new User("Zhandos", 17);

        WorkoutPlan plan1 = new WorkoutPlan("Morning Yoga", new String[]{"Sun Salutation", "Warrior Pose", "Tree Pose"}, 30);
        WorkoutPlan plan2 = new WorkoutPlan("HIIT Cardio", new String[]{"Jumping Jacks", "Burpees", "Mountain Climbers"}, 20);
        WorkoutPlan plan3 = new WorkoutPlan("Strength Training", new String[]{"Push-ups", "Squats", "Deadlifts"}, 45);

        user1.addWorkoutPlan(plan1);
        user1.addWorkoutPlan(plan2);
        user2.addWorkoutPlan(plan3);

        app.registerUser(user1);
        app.registerUser(user2);

        app.displayUsers();
        System.out.println();

        app.displayUserPlans("Merey");
        System.out.println();

        app.displayUserPlans("Zhandos");
    }
}
