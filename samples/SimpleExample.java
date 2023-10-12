/*
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * Written (W) 2012 Michal Uricar
 * Copyright (C) 2012 Michal Uricar
 */

import org.bytedeco.javacpp.*;
import org.bytedeco.My_openCv.*;
import org.bytedeco.opencv.opencv_core.*;
import org.bytedeco.opencv.opencv_highgui.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.My_openCv.global.My_openCv.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

public class SimpleExample {
    public static void main(String[] args) {
        My_openCv my_openCv = new My_openCv();

        Mat image = my_openCv.createMat("/Users/romainpasquier/Pictures/Sauvegarde copy/2_IMG-20200715-WA0002.jpg");
        // my_openCv.printImg(image);
        System.out.println(image.rows());
    }
}
