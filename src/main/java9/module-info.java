module org.bytedeco.My_openCv {
  requires transitive org.bytedeco.javacpp;
  requires transitive org.bytedeco.opencv;
  exports org.bytedeco.My_openCv.global;
  exports org.bytedeco.My_openCv.presets;
  exports org.bytedeco.My_openCv;
}
