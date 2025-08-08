package com.android.yolo.model

data class YoloDetection(
    val topLeftX: Float,
    val topLeftY: Float,
    val bottomRightX: Float,
    val bottomRightY: Float,
    val centerX: Float,
    val centerY: Float,
    val boxWidth: Float,
    val boxHeight: Float,
    val confidenceScore: Float,
    val classIndex: Int,
    val className: String,
    val maskCoefficients: List<Float>
)