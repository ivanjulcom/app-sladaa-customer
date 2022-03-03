package com.sladaa.supermarket.imagepicker;

public interface ImageCompressionListener {
    void onStart();

    void onCompressed(String filePath);
}
