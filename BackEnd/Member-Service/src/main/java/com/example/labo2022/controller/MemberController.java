package com.example.labo2022.controller;

import com.example.labo2022.entity.Member;
import com.example.labo2022.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


    @RestController
    public class MemberController{
        @Autowired
        MemberService memberService;
        @RequestMapping(value="/member", method= RequestMethod.GET)
        public List<Member> findMembers (){
            return memberService.findAll();
        }
        @GetMapping(value="/member/{id}")
        public Member findOneMemberById(@PathVariable Long id){
            return memberService.findMember(id);
        }}





