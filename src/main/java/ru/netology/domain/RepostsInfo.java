package ru.netology.domain;

public class RepostsInfo {
    private int coutn;
    private boolean canRepost;
    private boolean alreadyRepost;

    public int getCoutn() {
        return coutn;
    }

    public void setCoutn(int coutn) {
        this.coutn = coutn;
    }

    public boolean getCanRepost() {
        return canRepost;
    }

    public void isCanRepost(boolean canRepost) {
        this.canRepost = canRepost;
    }

    public boolean isAlreadyRepost() {
        return alreadyRepost;
    }

    public void setAlreadyRepost(boolean alreadyRepost) {
        this.alreadyRepost = alreadyRepost;
    }
}
