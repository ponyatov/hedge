package io.github.ponyatov.hedge;

public class Task {

    private boolean mActive;
    public boolean isActive() { return mActive; }
    public void setActive(boolean pActive) { mActive = pActive; }

    private int mResID;
    public int getResID() { return mResID; }
    public void setResID(int pResID) { mResID = pResID; }

    public Task(int pResId, boolean pActive) {
        setResID(pResId); setActive(pActive);
    }

}
