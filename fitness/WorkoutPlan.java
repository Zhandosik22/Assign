package fitness;


public class WorkoutPlan {
    // atributs
    private String planName;
    private String[] exercises;
    private int durationInMinutes;

    public WorkoutPlan(String planName, String[] exercises, int durationInMinutes){
        this.planName = planName;
        this.exercises = exercises;
        this.durationInMinutes = durationInMinutes;
    }
    // getters
    public String getPlanName(){
        return getPlanName();
    }
    public String[] getExercises(){
        return getExercises();
    }
    public int getDurationInMinutes(){
        return durationInMinutes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Workout Plan: ").append(planName).append("\n");
        sb.append("Duration: ").append(durationInMinutes).append(" minutes\n");
        sb.append("Exercises: ");
        for (String exercise : exercises) {
            sb.append(exercise).append(", ");
        }
        return sb.toString().trim();
    }
}

