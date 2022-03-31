package org.adaschool.tdd.exception;

//import org.adaschool.tdd.error.ErrorCodeEnum;
import org.springframework.http.HttpStatus;

public class WeatherReportNotFoundException
    extends RuntimeException
{
    private static boolean pure = true;

    public  WeatherReportNotFoundException() {
        super(pure = true);
    }
        //super (new ServerErrorResponseDto(" USER_NOT_FOUND ",ErrorCodeEnum.NOT_FOUND , HttpStatus.NOT_FOUND),HttpStatus.NOT_FOUND );
    }

