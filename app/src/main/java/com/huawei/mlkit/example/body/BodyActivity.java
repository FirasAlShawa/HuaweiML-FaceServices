/*
 * Copyright 2020. Huawei Technologies Co., Ltd. All rights reserved.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.huawei.mlkit.example.body;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.huawei.mlkit.example.R;
import com.huawei.mlkit.example.body.face.LiveFaceAnalyseActivity;
import com.huawei.mlkit.example.body.face.StillFaceAnalyseActivity;
import com.huawei.mlkit.example.body.faceverification.FaceVerificationActivity;
import com.huawei.mlkit.example.body.livenessdetection.LiveLivenessDetectionActivity;

public class BodyActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main_body);
        this.findViewById(R.id.btn_face_live).setOnClickListener(this);
        this.findViewById(R.id.btn_face_image).setOnClickListener(this);
        this.findViewById(R.id.btn_liveness_detection).setOnClickListener(this);
        this.findViewById(R.id.btn_face_verification).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_face_live:
                this.startActivity(new Intent(BodyActivity.this, LiveFaceAnalyseActivity.class));
                break;
            case R.id.btn_face_image:
                this.startActivity(new Intent(BodyActivity.this, StillFaceAnalyseActivity.class));
                break;
            case R.id.btn_liveness_detection:
                this.startActivity(new Intent(BodyActivity.this, LiveLivenessDetectionActivity.class));
                break;
            case R.id.btn_face_verification:
                this.startActivity(new Intent(BodyActivity.this, FaceVerificationActivity.class));
                break;
            default:
                break;
        }
    }
}
