package com.nuance.wrapper;

import com.nuance.nmdp.speechkit.Prompt;
import com.nuance.nmdp.speechkit.Recognizer;

/**
 * Created by kolipass on 22.12.15.
 */
public class RecognizerWrapper implements Recognizer {
    private Recognizer recognizer;

    public RecognizerWrapper(Recognizer recognizer) {
        this.recognizer = recognizer;
    }

    @Override
    public void setPrompt(int var1, Prompt var2) {
        recognizer.setPrompt(var1, var2);
    }

    @Override
    public void start() {
        recognizer.start();
    }

    @Override
    public void stopRecording() {
        recognizer.stopRecording();
    }

    @Override
    public void cancel() {
        recognizer.cancel();
    }

    @Override
    public float getAudioLevel() {
        return recognizer.getAudioLevel();
    }

    @Override
    public void setListener(Listener var1) {
        recognizer.setListener(var1);
    }

    public void setListener(ListenerWrapper var1) {
        recognizer.setListener(var1);
    }
    public interface ListenerWrapper extends Recognizer.Listener {
    }
}
