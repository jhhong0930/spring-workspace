package com.sparta.week02.controller;

import com.sparta.week02.domain.Person;
import com.sparta.week02.domain.PersonRepository;
import com.sparta.week02.domain.PersonRequestDTO;
import com.sparta.week02.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class PersonController {

    private final PersonRepository personRepository;

    private final PersonService personService;

    /**
     * 친구 목록 조회
     */
    @GetMapping("/persons")
    public List<Person> getPersons() {
        return personRepository.findAll();
    }

    /**
     * 친구 생성
     * @param requestDTO
     */
    @PostMapping("/persons")
    public Person createPerson(@RequestBody PersonRequestDTO requestDTO) {

        Person p = new Person(requestDTO);

        return personRepository.save(p);
    }

    /**
     * 친구 정보 변경
     * @param id
     * @param requestDTO
     */
    @PutMapping("/persons/{id}")
    public Long updatePerson(@PathVariable Long id, @RequestBody PersonRequestDTO requestDTO) {

        return personService.update(id, requestDTO);
    }

    /**
     * 친구 삭제
     * @param id
     */
    @DeleteMapping("/persons/{id}")
    public Long deletePerson(@PathVariable Long id) {

        personRepository.deleteById(id);

        return id;
    }

}
