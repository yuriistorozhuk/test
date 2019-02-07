package api;

import api.client.ArticleInformationClient;
import api.dto.ArticleDto;
import api.dto.ParamsDto;
import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class ArticleInformationTest {

    private List<ArticleDto> items;

    @BeforeClass
    public void setUpArticleInformationTestClass() {
        items = new ArticleInformationClient()
                .getAllArticles()
                .getPayload()
                .getItems();

        assertFalse(items.isEmpty(), "There is no article DTO in response.");
    }

    @Test
    public void verifyImageForm() {
        final String formPattern = "//cdn.playbuzz.com/cdn/.*-.*-.*-.*/.*.jpg";
        items.forEach(articleDto
                -> Arrays.asList(articleDto.getImageLarge(), articleDto.getImageMedium(), articleDto.getImageThumbnail())
                .forEach(imageForm
                        -> assertTrue(imageForm.matches(formPattern),
                        "Incorrect image form in DTO with title: " + articleDto.getTitleAlias())));
    }

    @Test
    public void verifyTags() {
        items.forEach(item -> {
            final List<ParamsDto> tags = item.getTags();
            assertFalse(tags.isEmpty(), "Tags should not be empty");

            tags.forEach(tag -> {
                assertTrue(StringUtils.isNoneBlank(tag.getName()), "Incorrect tag name for item " + item.getTitleAlias());
                assertTrue(tag.getWeight() >= 0, "Incorrect weight for item: " + item.getTitleAlias());
            });
        });
    }

    @Test
    public void verifyAuthorId() {
        items.forEach(item -> verifyId(item.getAuthorId()));
    }

    @Test
    public void verifyChannelId() {
        items.forEach(item -> verifyId(item.getChannelId()));
    }

    @Test
    public void verifyCreateDateBeforePublishedDate() {
        final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

        items.forEach(item -> {
            try {
                assertTrue(dateFormat.parse(item.getCreateDate())
                        .compareTo(dateFormat.parse(item.getPublishDate())) <= 0, "Publishing date before start date");
            } catch (ParseException exception) {
                throw new AssertionError("Incorrect date format: " + exception);
            }
        });
    }

    private void verifyId(String actualId) {
        assertTrue(StringUtils.isNoneBlank(actualId, "Id should not be null or empty"));
    }
}
