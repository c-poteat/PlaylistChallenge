package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        List<String> stringMatch = new ArrayList<String>(Arrays.asList(playList));
        startIndex = 1;
        for (int i = startIndex; i <= stringMatch.size(); i++) {
            if (stringMatch.contains(selection)) {

            }
        }
        return stringMatch.indexOf(selection) - startIndex;
    }
}

