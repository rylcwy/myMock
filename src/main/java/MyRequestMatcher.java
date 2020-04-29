import com.google.common.base.Charsets;
import org.junit.Before;
import org.mockserver.client.MockServerClient;
import org.mockserver.model.HttpResponse;
import org.mockserver.model.Parameter;

import java.io.FileNotFoundException;
import java.io.IOException;


import static org.mockserver.model.HttpRequest.request;

public class MyRequestMatcher {

    MockServerClient mockServerClient = new MockServerClient("localhost", 1080);

    public void homepageTimeline(String jsonFile) throws InterruptedException, FileNotFoundException,IOException {

        mockServerClient.when(request()
                .withMethod("GET")
                .withPath("/landing/v4/timeline-with-user")
                .withQueryStringParameters(
                        Parameter.param("X-UA", ".+"),
                        Parameter.param("show_channel_app", ".+"))).respond(HttpResponse.response().withBody(jsonFile,Charsets.UTF_8));
        Thread.sleep(1000 * 6000);

    }

    public void homepageRefresh(String jsonFile) throws InterruptedException, FileNotFoundException,IOException{
        mockServerClient.when(request()
                .withMethod("GET")
                .withPath("/landing/v4/refresh-with-user")
                .withQueryStringParameters(
                        Parameter.param("X-UA", ".+"))).respond(HttpResponse.response().withBody(jsonFile,Charsets.UTF_8));
        Thread.sleep(1000 * 6000);

    }

    public void feedV5(String jsonFile) throws InterruptedException{
        mockServerClient.when(request()
                .withMethod("GET")
                .withPath("/feed/v5/list-with-user")
                .withQueryStringParameters(
                        Parameter.param("X-UA", ".+"),
                        Parameter.param("type", ".+"))
        ).respond(HttpResponse.response().withBody(jsonFile, Charsets.UTF_8));
        Thread.sleep(1000 * 6000);
    }

    public void detailByID(String jsonFile) throws InterruptedException{
        mockServerClient.when(request()
                .withMethod("GET")
                .withPath("/app/v1/detail-by-id/7133")
                .withQueryStringParameters(
                        Parameter.param("X-UA", ".+"),
                        Parameter.param("referer", ".+"))
        ).respond(HttpResponse.response().withBody(jsonFile, Charsets.UTF_8));
        Thread.sleep(1000 * 6000);
    }

    public void buttonFlag(String jsonFile) throws InterruptedException{
        mockServerClient.when(request()
                .withMethod("POST")
                .withPath("/app/v1/button-flag")
                .withQueryStringParameters(
                        Parameter.param("X-UA", ".+"))
        ).respond(HttpResponse.response().withBody(jsonFile, Charsets.UTF_8));
        Thread.sleep(1000 * 6000);
    }

    public void appRelate(String jsonFile) throws InterruptedException{
        mockServerClient.when(request()
                .withMethod("POST")
                .withPath("/app/v1/relate")
                .withQueryStringParameters(
                        Parameter.param("X-UA", ".+"))
        ).respond(HttpResponse.response().withBody(jsonFile, Charsets.UTF_8));
        Thread.sleep(1000 * 6000);
    }

    public void searchDeveloper(String jsonFile) throws InterruptedException{
        mockServerClient.when(request()
                .withMethod("POST")
                .withPath("/app-search/v1/by-developer")
                .withQueryStringParameters(
                        Parameter.param("X-UA", ".+"))
        ).respond(HttpResponse.response().withBody(jsonFile, Charsets.UTF_8));
        Thread.sleep(1000 * 6000);
    }

    public void searchTagHot(String jsonFile) throws InterruptedException{
        mockServerClient.when(request()
                .withMethod("GET")
                .withPath("/tag/v1/hot")
                .withQueryStringParameters(
                        Parameter.param("X-UA", ".+"))
        ).respond(HttpResponse.response().withBody(jsonFile, Charsets.UTF_8));
        Thread.sleep(1000 * 6000);
    }

    public void searchHot(String jsonFile)  throws InterruptedException{
        mockServerClient.when(request()
                .withMethod("GET")
                .withPath("/app-search/v1/hot")
                .withQueryStringParameters(
                        Parameter.param("X-UA", ".+"))
        ).respond(HttpResponse.response().withBody(jsonFile, Charsets.UTF_8));
        Thread.sleep(1000 * 6000);

    }

    public void mixSearch(String jsonFile) throws InterruptedException{
        mockServerClient.when(request()
                .withMethod("GET")
                .withPath("/mix-search/v1/by-keyword")
                .withQueryStringParameters(
                        Parameter.param("X-UA", ".+"),
                        Parameter.param("kw",".+"),
                        Parameter.param("scene",".+"))
        ).respond(HttpResponse.response().withBody(jsonFile, Charsets.UTF_8));
        Thread.sleep(1000 * 6000);
    }

    public void review(String jsonFile) throws InterruptedException{
        mockServerClient.when(request()
                .withMethod("GET")
                .withPath("/review/v1/by-app")
                .withQueryStringParameters(
                        Parameter.param("X-UA", ".+"),
                        Parameter.param("app_id",".+"),
                        Parameter.param("type",".+"))
        ).respond(HttpResponse.response().withBody(jsonFile, Charsets.UTF_8));
        Thread.sleep(1000 * 6000);
    }

    public void searchHistory(String jsonFile) throws InterruptedException{
        mockServerClient.when(request()
                .withMethod("POST")
                .withPath("/search-history/v1/sync")
                .withQueryStringParameters(
                        Parameter.param("X-UA", ".+"))
        ).respond(HttpResponse.response().withBody(jsonFile, Charsets.UTF_8));
        Thread.sleep(1000 * 6000);

    }

    public void videoCommand(String jsonFile) throws InterruptedException{
        mockServerClient.when(request()
                .withMethod("GET")
                .withPath("/video/v2/recommend-for-app")
                .withQueryStringParameters(
                        Parameter.param("X-UA", ".+"),
                        Parameter.param("app_id",".+"))
        ).respond(HttpResponse.response().withBody(jsonFile, Charsets.UTF_8));
        Thread.sleep(1000 * 6000);
    }

    public void topic(String jsonFile) throws InterruptedException{
        mockServerClient.when(request()
                .withMethod("GET")
                .withPath("/topic/v1/by-app")
                .withQueryStringParameters(
                        Parameter.param("X-UA", ".+"),
                        Parameter.param("sort",".+"),
                        Parameter.param("type",".+"),
                        Parameter.param("app_id",".+"))
        ).respond(HttpResponse.response().withBody(jsonFile, Charsets.UTF_8));
        Thread.sleep(1000 * 6000);
    }
}

