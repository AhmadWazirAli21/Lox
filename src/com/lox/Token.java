package com.lox;

public class Token {
  final TokenType type;
  final String lexeme;
  final Object literal;
  final int line;

  public Token(TokenType type, String lexeme , Object literal , int line) {
    this.line = line;
    this.literal = literal;
    this.lexeme = lexeme;
    this.type = type;
  }

  @Override
  public String toString() {
    return "com.lox.Token{" +
        "type=" + type +
        ", lexeme='" + lexeme + '\'' +
        ", literal=" + literal +
        ", line=" + line +
        '}';
  }
}
