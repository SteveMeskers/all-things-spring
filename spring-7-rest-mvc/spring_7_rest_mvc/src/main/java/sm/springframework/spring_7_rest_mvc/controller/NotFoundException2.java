package sm.springframework.spring_7_rest_mvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Value not found")
public class NotFoundException2 extends RuntimeException {

  public NotFoundException2() {
  }

  public NotFoundException2(String message) {
    super(message);
  }

  public NotFoundException2(Throwable cause) {
    super(cause);
  }

  public NotFoundException2(String message, Throwable cause) {
    super(message, cause);
  }

  public NotFoundException2(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

}
