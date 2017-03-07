/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.ui.launchview;

import org.eclipse.jface.resource.CompositeImageDescriptor;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.Point;

public class MiniOverlayImage extends CompositeImageDescriptor {

    private final ImageData data1;
    private final ImageData data2;

    public MiniOverlayImage(ImageData data1, ImageData data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    @Override
    protected void drawCompositeImage(int width, int height) {
        drawImage(data1, 0, 0);
        drawImage(data2, 0, 0);
    }

    @Override
    protected Point getSize() {
        return new Point(16, 16);
    }

}
