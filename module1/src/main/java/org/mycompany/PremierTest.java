package com.mycompany.premiertest;

import org.apache.commons.lang3.StringUtils;

public class PremierTest {
    public static void main(String... args) {
        String phraseTresLongue = "zeofn eoin zeo z eionf azoin aozind aoif fozienf oiainef aof,a aeoinf,azzof aofni aoinzfcaeon oezfn.";
        System.out.println(phraseTresLongue);
        String phraseRaccourcie = StringUtils.abbreviate(phraseTresLongue, 10);
        System.out.println(phraseRaccourcie);
    }
}
