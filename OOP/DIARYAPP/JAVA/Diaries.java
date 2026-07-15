package OOP.DIARYAPP.JAVA;

import java.util.List;
import java.util.ArrayList;

public class Diaries {
    private List<Diary> diaries = new ArrayList<>();

    public Diaries() {
    
    }

    public Diary findByUsername(String name) {
        for(Diary diary : this.diaries) {
            if(diary.getUserName().equals(name)) {
                return diary;
            }
        }
        return null;
    }

    public void add(String name, String password) {
        if(findByUsername(name) != null) {
            throw new IllegalArgumentException("Registration Failed, UserName Already Exist.");
        }

        Diary diaries = new Diary(name, password);
        this.diaries.add(diaries);
    }

    public void delete(String name, String password) {
        Diary diaryToDelete = findByUsername(name);

        if(diaryToDelete == null) {
            throw new IllegalArgumentException("Account Does Not Exist.");
        }

        diaryToDelete.unLockDiary(password);
        if(diaryToDelete.isLocked()) {
            throw new IllegalArgumentException("Deletion failed.");
        }
        this.diaries.remove(diaryToDelete);
    }

}
