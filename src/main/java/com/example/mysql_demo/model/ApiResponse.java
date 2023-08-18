package com.example.mysql_demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author zyh
 * @version 1.0
 * @since 2023/8/19
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder
public class ApiResponse<T> implements Serializable {

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    private String msg;

    private long total;

    public static <C> ApiResponse<C> ok(C data, long total) {
        return ApiResponse.<C>builder()
                .code("1")
                .data(data)
                .total(total)
                .build();
    }

    public static <C> ApiResponse<C> ok(C data) {
        return ok(data, -1);
    }

    public static ApiResponse<Void> ok() {
        return ok(null, -1);
    }

    public static ApiResponse<Void> error(String code, String msg) {
        return ApiResponse.<Void>builder()
                .code(code)
                .msg(msg)
                .build();
    }

    public static ApiResponse<Void> error(String msg) {
        return error("-1", msg);
    }
}
