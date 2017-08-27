package io.github.ponyatov.hedge;

public class Task {
    private boolean mActive;
    private int mResID;

    public Task(int pResId, boolean pActive) {
        mResID = pResId;
        mActive = pActive;
    }

    public boolean isActive() {
        return mActive;
    }

    public void setActive(boolean pActive) {
        mActive = pActive;
    }

    public int getResID() {
        return mResID;
    }

    public void setResID(int pResID) {
        mResID = pResID;
    }
}
