package com.example.helloproject.domain;

public class Member {

    // 데이터를 구분하기 위해서 시스템에서 지정하는 ID
    private Long id;
    // 사용자 이름
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
