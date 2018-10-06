package com.stdio.lz.panorama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zph.glpanorama.GLPanorama;

public class MainActivity extends AppCompatActivity {

    private GLPanorama mGLPanorama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化全景控件
        mGLPanorama= (GLPanorama) findViewById(R.id.mGLPanorama);
        //传入你的全景图
        mGLPanorama.setGLPanorama(R.drawable.demo);
    }
}
