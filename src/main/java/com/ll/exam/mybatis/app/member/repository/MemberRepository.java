package com.ll.exam.mybatis.app.member.repository;

import com.ll.exam.mybatis.app.member.dto.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.GetMapping;

@Mapper
public interface MemberRepository {
    @Select("""
            SELECT *
            FROM member
            WHERE username = #{username}
            """)
    Member getMemberByUsername(String username);
}