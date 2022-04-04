package com.example.qlthuvien.controller.auth;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class LoginController {
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        CustomResponse customResponse = new CustomResponse(400, "Bad request", user);
        if (user.getUsername().equals("admin") && user.getPassword().equals("admin")) {
            customResponse.setStatus(200);
            customResponse.setMessage("Ok");
        }

        return ResponseEntity.ok(customResponse);
    }
}

class CustomResponse {
    private int status;
    private String message;
    private User body;

    public CustomResponse(int status, String message, User body) {
        this.status = status;
        this.message = message;
        this.body = body;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getBody() {
        return body;
    }

    public void setBody(User body) {
        this.body = body;
    }

}

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
