package org.adaschool.tdd.exception;

import org.adaschool.tdd.error.ErrorCodeEnum;
import org.springframework.http.HttpStatus;

public class ServerErrorResponseDto
{
        private final ErrorCodeEnum errorCodeEnum;
        private String message;
private Class<ErrorCodeEnum> errorCode;
        int httpStatus;
public ServerErrorResponseDto(String message, ErrorCodeEnum errorCode, HttpStatus httpStatus )
        {
        this.message = message;
        this.errorCodeEnum = errorCode;
        this.httpStatus = httpStatus.value();
        }

public String getMessage()
        {
        return message;
        }

public Class<ErrorCodeEnum> getErrorCode()
        {
        return errorCode;
        }

public int getHttpStatus()
        {
        return httpStatus;
        }
        }