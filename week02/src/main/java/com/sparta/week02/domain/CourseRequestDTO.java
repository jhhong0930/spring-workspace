package com.sparta.week02.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class CourseRequestDTO {

    private final String title;
    private final String tutor;

}
