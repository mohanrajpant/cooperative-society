package com.cooperative.society.resource;

import com.cooperative.society.entity.Member;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "member", path = "member")
public interface MemberRepository extends PagingAndSortingRepository<Member, Long> {
    List<Member> findByFirstName(@Param("firstName") String name);
    List<Member> findByLastName(@Param("lastName") String name);
}
