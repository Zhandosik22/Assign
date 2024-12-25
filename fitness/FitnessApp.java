package fitness;

import java.util.ArrayList;

public class FitnessApp {
    private ArrayList<User> users;

    // Конструктор
    public FitnessApp() {
        this.users = new ArrayList<>();
    }

    // Метод для регистрации нового пользователя
    public void registerUser(User user) {
        users.add(user);
    }

    // Метод для отображения всех пользователей
    public void displayUsers() {
        System.out.println("Registered Users:");
        for (User user : users) {
            System.out.println(user);
        }
    }

    // Метод для отображения планов тренировок пользователя
    public void displayUserPlans(String userName) {
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(userName)) {
                System.out.println("Workout Plans for " + user.getName() + ":");
                for (WorkoutPlan plan : user.getWorkoutPlans()) {
                    System.out.println(plan);
                }
                return;
            }
        }
        System.out.println("User not found.");
    }
}
