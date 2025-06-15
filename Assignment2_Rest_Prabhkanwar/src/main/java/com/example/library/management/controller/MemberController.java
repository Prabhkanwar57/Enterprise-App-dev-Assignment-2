package com.example.library.management.controller;

import com.example.library.management.model.Member;
import com.example.library.management.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired
    private MemberRepository repo;

    @PostMapping
    public Member addMember(@RequestBody Member member) {
        return repo.save(member);
    }

    @GetMapping
    public List<Member> getAllMembers() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Member getMemberById(@PathVariable int id) {
        return repo.findById(id).orElse(null);
    }
}
