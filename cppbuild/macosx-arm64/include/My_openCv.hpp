#ifndef MY_OPENCV_HPP
#define MY_OPENCV_HPP

#include <opencv2/opencv.hpp>

class My_openCv {
public:
    cv::Mat createMat(std::string path_to_an_image);
    void printImg(cv::Mat mat);
};

#endif
