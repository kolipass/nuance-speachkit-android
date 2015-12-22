package com.nuance.wrapper;

import com.nuance.nmdp.speechkit.Vocalizer;

/**
 * Created by kolipass on 22.12.15.
 */
public class VocalizerWraper implements Vocalizer {
    private Vocalizer vocalizer;

    public VocalizerWraper(Vocalizer vocalizer) {
        this.vocalizer = vocalizer;
    }

    @Override
    public void setVoice(String var1) {
        vocalizer.setVoice(var1);
    }

    @Override
    public void setLanguage(String var1) {
        vocalizer.setLanguage(var1);
    }

    @Override
    public void speakString(String var1, Object var2) {
        vocalizer.speakString(var1, var2);
    }

    @Override
    public void speakMarkupString(String var1, Object var2) {
        vocalizer.speakMarkupString(var1, var2);
    }

    @Override
    public void cancel() {
        vocalizer.cancel();
    }

    @Override
    public void setListener(Listener var1) {
        vocalizer.setListener(var1);
    }
}
