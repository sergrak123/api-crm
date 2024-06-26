package ru.grak.crm.controllers.exceptions;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class ValidationErrorResponse {

    private final List<Violation> violations;

}

@Getter
@RequiredArgsConstructor
class Violation {

    private final String field;
    private final String message;

}


