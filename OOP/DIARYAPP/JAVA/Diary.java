package OOP.DIARYAPP.JAVA;

public class Diary {
    private String userName;
    private String passWord;

    public Diary(String name, String password) {
        this.userName = name;
        this.passWord = password;
    }

    public String getUserName() {
        return userName;
    }
    
}
