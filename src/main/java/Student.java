public class Student {
    private String Name;
    private String Surname;
    private int Age;
    private String dateOfBirth;
    public Student(String name, String surname, int age, String dateOfBirth) {
        Name = name;
        Surname = surname;
        Age = age;
        this.dateOfBirth = dateOfBirth;
    }
    public String GetName() {
        return Name;
    }
    public String GetSurname() {
        return Surname;
    }
    public int GetAge() {
        return Age;
    }
    public String GetDateOfBirth() {
        return dateOfBirth;
    }
    public String ToString() {
        return Name + " " + Surname + " " + Integer.toString(Age) + " " + dateOfBirth;
    }
    public static Student Parse(String str) {
        String[] data = str.split(" ");
        if (data.length != 4) {
            return new Student("Parse Error", "Parse Error", -1, "Parse Error");
        }
        return new Student(data[0], data[1], Integer.parseInt(data[2]), data[3]);
    }
}