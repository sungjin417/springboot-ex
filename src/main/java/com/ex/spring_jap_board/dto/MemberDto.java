package com.ex.spring_jap_board.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {
    private String pwd;
    private String name;
    private String email;
    private String image;
    private Date regDate;
}
