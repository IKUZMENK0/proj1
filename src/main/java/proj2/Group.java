package proj2;

import java.util.List;

public class Group {
    private String name;
    private List<Training> TrainingList;

    private Group group1;
    private Group group2;
    private Coach coach1;
    private Coach coach2;

    public static void setCoach1(Coach coach1) {
        coach1 = coach1;
    }
    public static void setCoach2(Coach coach2) {
        coach2 = coach2;
    }

    public static void getGroup1(Group group1) {
        group1 = group1;
    }
    public static void getGroup2(Group group2) {
        group2 = group2;
    }
    public void setName(String name) {
        this.name = name;
}
