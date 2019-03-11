package com.github.chrisbanes.photoview;

import android.widget.ImageView;

/**
 * 点击图片外部区域时回调
 * Callback when the user tapped outside of the photo
 */
public interface OnOutsidePhotoTapListener {

    /**
     * The outside of the photo has been tapped
     */
    void onOutsidePhotoTap(ImageView imageView);
}
