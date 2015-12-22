package com.nuance.wrapper;

import android.content.Context;
import android.os.Handler;

import com.nuance.nmdp.speechkit.Prompt;
import com.nuance.nmdp.speechkit.SpeechKit;
import com.nuance.nmdp.speechkit.Vocalizer;

/**
 * Created by kolipass on 22.12.15.
 */
public class SpeechKitWrapper {
    private SpeechKit speechKit;

    private SpeechKitWrapper(SpeechKit speechKit) {
        this.speechKit = speechKit;
    }

    public static SpeechKitWrapper initialize(Context var0, String var1, String var2, int var3, boolean var4, byte[] var5) {
        return new SpeechKitWrapper(SpeechKit.initialize(var0, var1, var2, var3, var4, var5));
    }

    public final void release() {
        speechKit.release();
    }

    public final void connect() {
        speechKit.connect();
    }

    public final Prompt defineAudioPrompt(int var1) {
        return speechKit.defineAudioPrompt(var1);
    }

    public final void setDefaultRecognizerPrompts(Prompt var1, Prompt var2, Prompt var3, Prompt var4) {
        speechKit.setDefaultRecognizerPrompts(var1, var2, var3, var4);
    }


    public final RecognizerWrapper createRecognizer(String var1, int var2, String var3, com.nuance.nmdp.speechkit.Recognizer.Listener var4, Handler var5) {
        return new RecognizerWrapper(speechKit.createRecognizer(var1, var2, var3, var4, var5));
    }

    public final VocalizerWraper createVocalizerWithLanguage(String var1, Vocalizer.Listener var2, Handler var3) {
        return new VocalizerWraper(speechKit.createVocalizerWithVoice(var1, var2, var3));
    }

    public final VocalizerWraper createVocalizerWithVoice(String var1, Vocalizer.Listener var2, Handler var3) {
        return new VocalizerWraper(speechKit.createVocalizerWithVoice(var1, var2, var3));
    }

    public final String getSessionId() {
        return speechKit.getSessionId();
    }


    public final void cancelCurrent() {
        speechKit.cancelCurrent();
    }


}
