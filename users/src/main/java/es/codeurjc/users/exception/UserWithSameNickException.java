package es.codeurjc.users.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT, reason = "User with same nick exists")
public class UserWithSameNickException extends RuntimeException {
}
