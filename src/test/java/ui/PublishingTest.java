package ui;

import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.Test;
import ui.pageobjects.HomePage;
import ui.pageobjects.PreviewPage;
import utils.WindowHelper;

import static org.apache.commons.lang3.StringUtils.SPACE;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static utils.RandomUtils.getRandomString;

public class PublishingTest extends AbstractPublishingTest {

    @Test
    public void verifyFlipCardPublishing() {
        final int firstCard = 1;
        final String expectedTitle = getRandomString("title");
        final String expectedTextContent = getRandomString("textContent");
        final String storyTitle = getRandomString("storyTitle");

        final PreviewPage previewPage = new HomePage()
                .openLoginPage()
                .logIn()
                .startCreatingFlipCard()
                .setFrontSide(firstCard)
                .addMedia(firstCard, true)
                .pasteLink("https://cdn.playbuzz.com/content/images/logo-big.png")
                .setBackSide(firstCard)
                .addText(firstCard, false)
                .setTextContent(expectedTextContent)
                .setTitle(expectedTitle)
                .setHeader(storyTitle, getRandomString("description"))
                .publish()
                .preview();

        assertEquals(StringUtils.remove(previewPage.getTitle(), SPACE),
                expectedTitle,
                "Incorrect flip-card title on preview");

        previewPage.flip(firstCard);

        assertTrue(previewPage.isFlipped(firstCard),
                "Flip was not performed for created card");

        assertEquals(previewPage.getTextContent(firstCard),
                expectedTextContent,
                "Incorrect text content on preview");

        previewPage
                .closePreview()
                .openItemsPage()
                .openItem(storyTitle)
                .shareToFacebook();

        assertTrue(new WindowHelper().getAllTitles().contains("Facebook"), "Facebook was not opened");
    }
}
