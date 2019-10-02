package gof.structural.proxy.media_lib;

import java.util.Map;

public interface ThirdPartyYoutubeLib {

    Map<String, Video> popularVideos();
    Video getVideo(String videoId);
}
