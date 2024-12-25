package fitness;

public class Main {
    public static void main(String[] args) {
        // Создаем фитнес-приложение
        FitnessApp app = new FitnessApp();

        // Создаем пользователей
        User user1 = new User("Merey", 30);
        User user2 = new User("Zhandos", 25);

        // Создаем планы тренировок
        WorkoutPlan plan1 = new WorkoutPlan("Morning Yoga", new String[]{"Sun Salutation", "Warrior Pose", "Tree Pose"}, 30);
        WorkoutPlan plan2 = new WorkoutPlan("HIIT Cardio", new String[]{"Jumping Jacks", "Burpees", "Mountain Climbers"}, 20);
        WorkoutPlan plan3 = new WorkoutPlan("Strength Training", new String[]{"Push-ups", "Squats", "Deadlifts"}, 45);

        // Добавляем планы тренировок пользователям
        user1.addWorkoutPlan(plan1);
        user1.addWorkoutPlan(plan3);

        user2.addWorkoutPlan(plan2);

        // Регистрируем пользователей в приложении
        app.registerUser(user1);
        app.registerUser(user2);

        // Отображаем зарегистрированных пользователей
        app.displayUsers();

        // Отображаем планы тренировок конкретного пользователя
        System.out.println();
        app.displayUserPlans("Merey");
        System.out.println();
        app.displayUserPlans("Zhandos");
    }
}
