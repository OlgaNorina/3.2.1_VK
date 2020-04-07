package ru.netology.domain;

public class PostManager {
    private PostVK[] postVKS;

    String domain; //короткий адрес пользователя или сообщества
    String query; //поисковой запрос. Для точного результата запрос необходимо передавать в двойных кавычках.
    int ownersOnly; //1 — возвращать только записи от имени владельца стены.
    int count; //количество записей, которые необходимо вернуть.
    int offset; //смещение, необходимо для получения определенного подмножества результатов.

    public PostManager() {
    }

    public PostManager(String domain, String query, int ownersOnly, int count, int offset) {
        this.domain = domain;
        this.query = query;
        this.ownersOnly = ownersOnly;
        this.count = count;
        this.offset = offset;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public int getOwnersOnly() {
        return ownersOnly;
    }

    public void setOwnersOnly(int ownersOnly) {
        this.ownersOnly = ownersOnly;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public PostVK[] wallSearch() {
        //TODO: add logic
        return null;
    }

    public void deleteSearch(){
        //TODO: add logic
    }
}
