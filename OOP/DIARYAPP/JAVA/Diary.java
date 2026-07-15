package OOP.DIARYAPP.JAVA;

import java.util.List;
import java.util.ArrayList;

public class Diary {

    private String userName;
    private String password;
    private boolean isLocked = true;
    private int diaryId = 1; 

    private List<Entry> entries = new ArrayList<>();

    public Diary(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return this.userName;
    }
    
    public void unLockDiary(String password) {
        if(!this.password.equals(password)) {
            throw new IllegalArgumentException("Incorrect Password.");
        }
        this.isLocked = false;
    }

    public void lockDiary() {
        this.isLocked = true;
    }

    public boolean isLocked() {
        return this.isLocked;
    }

    public void createEntry(String title, String body) {
        if(this.isLocked) {
            throw new IllegalArgumentException("Diary Locked, Can't Create An Entry.");
        }

        Entry newEntry = new Entry(this.diaryId, title, body);
        this.entries.add(newEntry);
        this.diaryId++;
    }

    public Entry findEntryById(int diaryId) {
        if(this.isLocked) {
            throw new IllegalArgumentException("Diary Locked, Can't Create An Entry.");
        }

        for(Entry entry : this.entries) {
            if(entry.getEntryById() == diaryId) {
                return entry;
            }
        }
        return null;
    }

    public void deleteEntry(int diaryId) {
        if(this.isLocked) {
            throw new IllegalArgumentException("Diary Locked. Can't Delete An Entry.");
        }

        Entry entryToDelete = findEntryById(diaryId);
        if(entryToDelete == null) {
            throw new IllegalArgumentException("Entry with ID " + diaryId + " does not exist.");
        }
        this.entries.remove(entryToDelete);
    }

    public void updateEntry(int diaryId, String title, String body) {
        if(this.isLocked) {
            throw new IllegalArgumentException("Diary Locked, Can't update Diary.\nUnlock to update");
        }

        Entry entryToUpdate = findEntryById(diaryId);
        if(entryToUpdate == null) {
            throw new IllegalArgumentException("Entry With ID " + diaryId + " does not exist.");
        }
        entryToUpdate.setTitle(title);
        entryToUpdate.setBody(body);
    }
}