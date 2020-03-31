package ru.netology.domain;

public class ViewsInfo {
    private int count;
    private boolean alreadyView; //переменной нет в вк

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isAlreadyView() {
        return alreadyView;
    }

    public void setAlreadyView(boolean alreadyView) {
        this.alreadyView = alreadyView;
    }
}
