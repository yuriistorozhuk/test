package api.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ArticleResponseDto {

    private Integer code;
    private String message;
    private ItemDto payload;

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public ItemDto getPayload() {
        return payload;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setPayload(ItemDto payload) {
        this.payload = payload;
    }
}
