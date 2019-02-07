package utils;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomUtils {

    public static String getRandomString(String prefix) {
        return getRandomString(prefix, 10);
    }

    public static String getRandomString(String prefix, int count) {
        return prefix + RandomStringUtils.randomAlphabetic(count);
    }
}
