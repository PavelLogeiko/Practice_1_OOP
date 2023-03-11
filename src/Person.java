enum Gender {
    man, woman
}
public class Person {
    private String fullName;

    private int age;

    private Gender gender;

    public Person (String fullName, int age, String gender) {
        this.fullName = fullName;
        this.age = age;
        if (gender == "man" || gender == "woman") this.gender = Gender.valueOf(gender);
        else this.gender = null;
    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String getGender() {
        if (this.gender != null) {
            return this.gender.toString();
        } else return "Ошибка: гендер не установлен";
    }

    public void setGender(String gender) {
        if (gender == "man" || gender == "woman") this.gender = Gender.valueOf(gender);
        else this.gender = null;
    }
    public String toString(){
        return String.format("%s: %d %s", getFullName(), getAge(), getGender());
    }
}