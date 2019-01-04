package students;

public class Students {
   private int age;
   private String name;
   private double score;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Students{" + "age=" + age + ", name=" + name + ", score=" + score + '}';
    }
   
}

