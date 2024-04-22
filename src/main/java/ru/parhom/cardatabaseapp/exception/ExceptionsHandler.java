package ru.parhom.cardatabaseapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ru.parhom.cardatabaseapp.model.response.Message;

@ControllerAdvice
public class ExceptionsHandler {

    @ExceptionHandler(NoUserException.class)
    public ResponseEntity<Message> noUserException(NoUserException e) {
        Message message = Message.builder()
                .message(e.getMessage())
                .build();
        return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
    }
}
