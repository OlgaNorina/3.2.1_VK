package ru.netology.domain;

public class RepostsInfo {
    private int coutn;
    private String canRepost;
    private boolean alreadyRepost;

    public int getCoutn() {
        return coutn;
    }

    public void setCoutn(int coutn) {
        this.coutn = coutn;
    }

    public String getCanRepost() {
        return canRepost;
    }

    public void setCanRepost(String canRepost) {
        this.canRepost = canRepost;
    }

    public boolean isAlreadyRepost() {
        return alreadyRepost;
    }

    public void setAlreadyRepost(boolean alreadyRepost) {
        this.alreadyRepost = alreadyRepost;
    }
}
