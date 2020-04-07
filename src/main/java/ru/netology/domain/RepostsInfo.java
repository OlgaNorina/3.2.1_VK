package ru.netology.domain;

public class RepostsInfo {
    private int coutn;
    private int canRepost;
    private int alreadyRepost;

    public int getCoutn() {
        return coutn;
    }

    public void setCoutn(int coutn) {
        this.coutn = coutn;
    }

    public int getCanRepost() {
        return canRepost;
    }

    public void setCanRepost(int canRepost) {
        this.canRepost = canRepost;
    }

    public int getAlreadyRepost() {
        return alreadyRepost;
    }

    public void setAlreadyRepost(int alreadyRepost) {
        this.alreadyRepost = alreadyRepost;
    }
}
