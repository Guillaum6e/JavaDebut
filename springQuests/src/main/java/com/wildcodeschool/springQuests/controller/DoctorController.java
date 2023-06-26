package com.wildcodeschool.springQuests.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wildcodeschool.models.Doctor;

@Controller
public class DoctorController {

    @GetMapping("/doctor/{id}")
    @ResponseBody
    public String doctor(@PathVariable int id) {
        if (id == 13) {
            Doctor doctor = new Doctor("Jodie Whittaker", 13);
            return doctor.getName() + " " + doctor.getNumber();
        }

        if (id != 13 && id < 13 && id > 0) {
            return "error 303 : this doctor doesn't exist";
        }

        return "Impossible de récupérer l'incarnation " + id + " du Docteur";

    }
}