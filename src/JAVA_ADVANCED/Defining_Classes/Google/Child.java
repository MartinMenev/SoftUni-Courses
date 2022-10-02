package JAVA_ADVANCED.Defining_Classes.Google;

public class Child {
    private final String childName;
    private final String childBirthday;

    public Child(String childName, String childBirthday) {
        this.childName = childName;
        this.childBirthday = childBirthday;
    }

    @Override
    public String toString() {
       String result = "";
       if (!childName.isBlank())
           result = childName + " " + childBirthday;

       return result;
    }
}
