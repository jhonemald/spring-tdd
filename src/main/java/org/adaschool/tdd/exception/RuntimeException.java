package org.adaschool.tdd.exception;

import org.springframework.http.HttpStatus;

public class RuntimeException {
    public RuntimeException(ServerErrorResponseDto serverErrorResponseDto, HttpStatus notFound) {
    }

    public RuntimeException(boolean b) {
    }
}
