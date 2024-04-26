package cc.focc.easydeploy.entity.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommonRsp<T> {

    public Integer code;
    public String msg;
    public T data;


    public static <T> CommonRsp<T> ok(T req) {
        return new CommonRsp<>(0, "ok", req);
    }
}
