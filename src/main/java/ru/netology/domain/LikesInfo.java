package ru.netology.domain;

public class LikesInfo {
    private int count;
    private boolean canLikes; //соответствет user_likes
//    private boolean canLike; -- данная переменная находится в методе RepostInfo наличие отметки "мне нравится" от текущего пользователя
    private boolean canPublish; //может ли текущий пользователь сделать репост

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanLikes() {
        return canLikes;
    }

    public void setCanLikes(boolean canLike) {
        this.canLikes = canLike;
    }

    public boolean isCanPublish() {
        return canPublish;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }
}
