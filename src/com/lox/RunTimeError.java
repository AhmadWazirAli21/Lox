package com.lox;

public class RunTimeError extends RuntimeException {
  final Token token;
  RunTimeError(Token token , String message) {
    this.token = token;
    super(message);
  }
}
