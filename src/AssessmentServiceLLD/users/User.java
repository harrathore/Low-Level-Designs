package AssessmentServiceLLD.users;

public class User {
    private String userName;
    private String userId;

    public User(String name){
        this.userId = name + "@123";   //Todo : Need to be done unique
        this.userName = name;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }
}
