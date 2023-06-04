package br.transformese.serasa.todolist.models;

import java.util.List;

import org.springframework.data.domain.Page;

public class PageWrapper<T> {

    private Page<T> page;
    private String baseUrl;

    public PageWrapper(Page<T> page, String baseUrl) {
        this.page = page;
        this.baseUrl = baseUrl;
    }

    public List<T> getContent() {
        return page.getContent();
    }

    public int getCurrentPage() {
        return page.getNumber() + 1;
    }

    public int getTotalPages() {
        return page.getTotalPages();
    }

    public String getUrlForPage(int page) {
        return baseUrl + "?page=" + page;
    }

    public boolean isCurrentPage(int page) {
        return getCurrentPage() == page;
    }


}

