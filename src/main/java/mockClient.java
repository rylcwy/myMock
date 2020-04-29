
import java.io.IOException;

public class mockClient {
    public static void main(String[] args)throws IOException,InterruptedException {
        MyRequestMatcher myRequestMatcher = new MyRequestMatcher();
        jsonUtiles jsonUtiles = new jsonUtiles();
        String path = args[0];
        String jsonFile = args[1];

        String jsonBody = jsonUtiles.readStrFromFile(jsonFile);
        String jsonBodyWithFormatTime = jsonUtiles.formatTime(jsonBody);

        switch (path) {
            case "/landing/v4/refresh-with-user":
                myRequestMatcher.homepageRefresh(jsonBodyWithFormatTime);
                break;
            case "/landing/v4/timeline-with-user":
                myRequestMatcher.homepageTimeline(jsonBodyWithFormatTime);
                break;

            case "/feed/v5/list-with-user":
                myRequestMatcher.feedV5(jsonBodyWithFormatTime);
                break;

            case "/app/v1/detail-by-id/713":
                myRequestMatcher.detailByID(jsonBodyWithFormatTime);
                break;

            case "/app/v1/button-flag":
                myRequestMatcher.buttonFlag(jsonBodyWithFormatTime);
                break;

            case "/app/v1/relate":
                myRequestMatcher.appRelate(jsonBodyWithFormatTime);
                break;

            case "/app-search/v1/by-developer":
                myRequestMatcher.searchDeveloper(jsonBodyWithFormatTime);
                break;

            case "/tag/v1/hot":
                myRequestMatcher.searchTagHot(jsonBodyWithFormatTime);
                break;

            case "/app-search/v1/hot":
                myRequestMatcher.searchHot(jsonBodyWithFormatTime);
                break;

            case "/mix-search/v1/by-keyword":
                myRequestMatcher.mixSearch(jsonBodyWithFormatTime);
                break;

            case "/review/v1/by-app":
                myRequestMatcher.review(jsonBodyWithFormatTime);
                break;

            case "/search-history/v1/sync":
                myRequestMatcher.searchHistory(jsonBodyWithFormatTime);
                break;

            case "/video/v2/recommend-for-app":
                myRequestMatcher.videoCommand(jsonBodyWithFormatTime);
                break;

            case "/topic/v1/by-app":
                myRequestMatcher.topic(jsonBodyWithFormatTime);
                break;

        }

    }

}
