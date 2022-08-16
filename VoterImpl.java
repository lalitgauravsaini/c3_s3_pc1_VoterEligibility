public class VoterImpl {

    private int name;
    private int age;

    public void setName(int name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getAgeCreteria() {
    if (age >= 18) {
        System.out.println("Name+Is Eligible to Vote");
    } else if (age < 18) {
        System.out.println("Name+Is Not Eligible to Vote");
    } else {
        System.out.println("Age cant be Negative or Zero");
    }
}
}

