package com.example.qa.bottles.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.persistence.EntityNotFoundException;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "The alcohol brand with this ID does not exist")
public class AlcoholBrandNotFoundException extends EntityNotFoundException{
}
