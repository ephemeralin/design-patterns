package gof.structural;

import gof.structural.proxy.caching_proxy.YoutubeCacheProxy;
import gof.structural.proxy.downloader.YoutubeDownloader;
import gof.structural.proxy.media_lib.ThirdPartyYoutubeLibImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProxyTest {

    @Test
    public void YoutubeDownloaderTest() {
        YoutubeDownloader naiveDownloader = new YoutubeDownloader(new ThirdPartyYoutubeLibImpl());
        YoutubeDownloader smartDownloader = new YoutubeDownloader(new YoutubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");

        assertTrue(naive > smart);

    }

    private static long test(YoutubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }

}