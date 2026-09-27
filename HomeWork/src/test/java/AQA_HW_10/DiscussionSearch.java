package AQA_HW_10;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DiscussionSearch extends BaseTest {
    @Test
    public void checkingGameDiscussionsSearch() {
        testCaseId = 2;

        String gameNameDiscussion = "S.T.A.L.K.E.R. 2: Heart of Chornobyl";

        HomePage homePage = new HomePage();
        homePage.hoverOverTheCommunity();
        homePage.clickToDiscussion();

        DiscussionPage discussionPage = new DiscussionPage();
        String actualTextPage = discussionPage.verifyTitleText();
        Assert.assertTrue(actualTextPage.contains("Ласкаво просимо до обговорень Steam"));
        discussionPage.clickForumGame();
        discussionPage.inputSearchGameField(gameNameDiscussion);
        String actualNameForum = discussionPage.verifyTitleTextDiscussion();
        discussionPage.verifyTitleTextDiscussion();
        Assert.assertTrue(actualNameForum.contains(gameNameDiscussion));
    }
}
