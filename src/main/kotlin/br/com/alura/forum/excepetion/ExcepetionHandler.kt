package br.com.alura.forum.excepetion

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ExcepetionHandler {

    @ExceptionHandler(NotFoundExcepetion::class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    fun handleNotFound() {

    }
}