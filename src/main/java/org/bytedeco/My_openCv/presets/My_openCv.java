/*
 * Copyright (C) 2014 Samuel Audet, Jarek Sacha
 *
 * Licensed either under the Apache License, Version 2.0, or (at your option)
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation (subject to the "Classpath" exception),
 * either version 2, or any later version (collectively, the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     http://www.gnu.org/licenses/
 *     http://www.gnu.org/software/classpath/license.html
 *
 * or as provided in the LICENSE.txt file that accompanied this code.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.bytedeco.My_openCv.presets;

import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.annotation.Platform;
import org.bytedeco.javacpp.annotation.Properties;
import org.bytedeco.javacpp.tools.Info;
import org.bytedeco.javacpp.tools.InfoMap;
import org.bytedeco.javacpp.tools.InfoMapper;

import org.bytedeco.opencv.presets.opencv_imgproc;
import org.bytedeco.opencv.presets.opencv_highgui;

/**
 * @author Jarek Sacha
 */
@Properties(
    value = @Platform(
        define = "My_openCv_MSVC_COMPAT", 
        include = { "My_openCv.hpp"}, 
        link = "My_openCv",
        resource = {"include", "lib"},
        compiler = "cpp11"
        ), 
        inherit = {opencv_imgproc.class, opencv_highgui.class}, 
        target = "org.bytedeco.My_openCv", 
        global = "org.bytedeco.My_openCv.global.My_openCv")
public class My_openCv implements InfoMapper {
    static {
        Loader.checkVersion("org.bytedeco", "My_openCv");
    }

    public void map(InfoMap infoMap) {
    }
}
