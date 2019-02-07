package api.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ArticleDto {

    private String authorId;
    private List<ParamsDto> categories;
    private String channelAlias;
    private String channelId;
    private String channelImageLarge;
    private String channelImageSmall;
    private String channelName;
    private String createDate;
    private String description;
    private String detectedLocale;
    private String embedCode;
    private String format;
    private String gameShareImage;
    private String id;
    private String imageLarge;
    private String imageMedium;
    private String imageThumbnail;
    private String itemAlias;
    private String locale;
    private Integer particlesCount;
    private String playbuzzUrl;
    private String publishDate;
    private String relevancy;
    private String score;
    private Boolean sponsored;
    private String status;
    private List<ParamsDto> tags;
    private String title;
    private String titleAlias;
    private String updateDate;
    private Integer viewCount;
    private String visibility;

    public String getAuthorId() {
        return authorId;
    }

    public List<ParamsDto> getCategories() {
        return categories;
    }

    public String getChannelAlias() {
        return channelAlias;
    }

    public String getChannelId() {
        return channelId;
    }

    public String getChannelImageLarge() {
        return channelImageLarge;
    }

    public String getChannelImageSmall() {
        return channelImageSmall;
    }

    public String getChannelName() {
        return channelName;
    }

    public String getCreateDate() {
        return createDate;
    }

    public String getDescription() {
        return description;
    }

    public String getDetectedLocale() {
        return detectedLocale;
    }

    public String getEmbedCode() {
        return embedCode;
    }

    public String getFormat() {
        return format;
    }

    public String getGameShareImage() {
        return gameShareImage;
    }

    public String getId() {
        return id;
    }

    public String getImageLarge() {
        return imageLarge;
    }

    public String getImageMedium() {
        return imageMedium;
    }

    public String getImageThumbnail() {
        return imageThumbnail;
    }

    public String getItemAlias() {
        return itemAlias;
    }

    public String getLocale() {
        return locale;
    }

    public Integer getParticlesCount() {
        return particlesCount;
    }

    public String getPlaybuzzUrl() {
        return playbuzzUrl;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public String getRelevancy() {
        return relevancy;
    }

    public String getScore() {
        return score;
    }

    public Boolean getSponsored() {
        return sponsored;
    }

    public String getStatus() {
        return status;
    }

    public List<ParamsDto> getTags() {
        return tags;
    }

    public String getTitle() {
        return title;
    }

    public String getTitleAlias() {
        return titleAlias;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public void setCategories(List<ParamsDto> categories) {
        this.categories = categories;
    }

    public void setChannelAlias(String channelAlias) {
        this.channelAlias = channelAlias;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public void setChannelImageLarge(String channelImageLarge) {
        this.channelImageLarge = channelImageLarge;
    }

    public void setChannelImageSmall(String channelImageSmall) {
        this.channelImageSmall = channelImageSmall;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDetectedLocale(String detectedLocale) {
        this.detectedLocale = detectedLocale;
    }

    public void setEmbedCode(String embedCode) {
        this.embedCode = embedCode;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setGameShareImage(String gameShareImage) {
        this.gameShareImage = gameShareImage;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setImageLarge(String imageLarge) {
        this.imageLarge = imageLarge;
    }

    public void setImageMedium(String imageMedium) {
        this.imageMedium = imageMedium;
    }

    public void setImageThumbnail(String imageThumbnail) {
        this.imageThumbnail = imageThumbnail;
    }

    public void setItemAlias(String itemAlias) {
        this.itemAlias = itemAlias;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public void setParticlesCount(Integer particlesCount) {
        this.particlesCount = particlesCount;
    }

    public void setPlaybuzzUrl(String playbuzzUrl) {
        this.playbuzzUrl = playbuzzUrl;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public void setRelevancy(String relevancy) {
        this.relevancy = relevancy;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public void setSponsored(Boolean sponsored) {
        this.sponsored = sponsored;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTags(List<ParamsDto> tags) {
        this.tags = tags;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTitleAlias(String titleAlias) {
        this.titleAlias = titleAlias;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }
}
