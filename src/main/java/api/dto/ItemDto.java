package api.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ItemDto {

    private Integer currentItemCount;
    private List<ArticleDto> items;
    private Integer totalItems;

    public Integer getCurrentItemCount() {
        return currentItemCount;
    }

    public List<ArticleDto> getItems() {
        return items;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setCurrentItemCount(Integer currentItemCount) {
        this.currentItemCount = currentItemCount;
    }

    public void setItems(List<ArticleDto> items) {
        this.items = items;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }
}
