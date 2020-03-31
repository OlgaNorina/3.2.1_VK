package ru.netology.domain;

public class CommentsInfo {
    private int count;
    private boolean canComment; //соответствует can_post
    private boolean groupsCanPost; //может ли сообщество оставлять коммент
    private boolean canClose; //может ли текущий пользователь закрыть комментарий к записи
    private boolean canOpen; //может ли текущий пользователь открывать комментарий к записи


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanComment() {
        return canComment;
    }

    public void setCanComment(boolean canComment) {
        this.canComment = canComment;
    }

    public boolean isGroupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(boolean groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }
}
