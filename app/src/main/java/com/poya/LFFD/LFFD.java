package com.poya.LFFD;

public class LFFD {
    //人脸检测模型导入
    public native boolean FaceDetectionModelInit(String faceDetectionModelPath);
    //人脸检测
    public native int[] FaceDetect(byte[] imageDate, int imageWidth , int imageHeight, int imageChannel);
    //线程设置
    public native boolean SetThreadsNumber(int threadsNumber);

    static {
        System.loadLibrary("lffd");
    }
}
