package io.agora.vlive.proxy.struts.response;

public class CreateUserResponse extends AbsResponse {
    public CreateUserInfo data;

    public class CreateUserInfo {
        public String userId;
    }
}
