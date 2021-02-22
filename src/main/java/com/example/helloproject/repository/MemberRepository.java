package com.example.helloproject.repository;

import com.example.helloproject.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member memeber);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
    // Optional?
    // JAVA8에 추가된 내용.
    // 기존에는 null이 반환되지만 현재에는 Optional로 한번 감싸서 반환하는것을 선호하는 편임
    // 자세한 내용은 추후 알아볼 예정임
}
