package com.diary.demo.userDto;

public class UserDeleteResponseDto {
    private final int status;
    private final String message;

    public UserDeleteResponseDto(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }
    public String getMessage() {
        return message;
    }
}
