package com.example.adocaoapp.ui.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import com.example.adocaoapp.R;
import com.example.adocaoapp.ui.main.MainActivity;

public class SplashActivity extends AppCompatActivity {
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final ImageView[] IMG = new ImageView[15];

        IMG[0] = findViewById(R.id.img1);
        IMG[1] = findViewById(R.id.img2);
        IMG[2] = findViewById(R.id.img3);
        IMG[3] = findViewById(R.id.img4);
        IMG[4] = findViewById(R.id.img5);
        IMG[5] = findViewById(R.id.img6);
        IMG[6] = findViewById(R.id.img7);
        IMG[7] = findViewById(R.id.img8);
        IMG[8] = findViewById(R.id.img9);
        IMG[9] = findViewById(R.id.img10);
        IMG[10] = findViewById(R.id.img11);
        IMG[11] = findViewById(R.id.img12);
        IMG[12] = findViewById(R.id.img13);
        IMG[13] = findViewById(R.id.img14);
        IMG[14] = findViewById(R.id.img15);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i<17; i++) {
                    switch (count) {
                        case 0:
                            Handler han = new Handler();
                            han.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    IMG[0].setVisibility(View.VISIBLE);
                                }
                            }, 100);
                            count += 1;
                            break;
                        case 1:
                            Handler han1 = new Handler();
                            han1.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    IMG[1].setVisibility(View.VISIBLE);
                                }
                            }, 200);
                            count += 1;
                            break;
                        case 2:
                            Handler han2 = new Handler();
                            han2.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    IMG[2].setVisibility(View.VISIBLE);
                                }
                            }, 300);
                            count += 1;
                            break;
                        case 3:
                            Handler han3 = new Handler();
                            han3.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    IMG[3].setVisibility(View.VISIBLE);
                                }
                            }, 400);
                            count += 1;
                            break;
                        case 4:
                            Handler han4 = new Handler();
                            han4.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    IMG[4].setVisibility(View.VISIBLE);
                                }
                            }, 500);
                            count += 1;
                            break;
                        case 5:
                            Handler han5 = new Handler();
                            han5.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    IMG[5].setVisibility(View.VISIBLE);
                                }
                            }, 600);
                            count += 1;
                            break;
                        case 6:
                            Handler han6 = new Handler();
                            han6.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    IMG[6].setVisibility(View.VISIBLE);
                                }
                            }, 700);
                            count += 1;
                            break;
                        case 7:
                            Handler han7 = new Handler();
                            han7.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    IMG[7].setVisibility(View.VISIBLE);
                                }
                            }, 800);
                            count += 1;
                            break;
                        case 8:
                            Handler han8 = new Handler();
                            han8.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    IMG[8].setVisibility(View.VISIBLE);
                                }
                            }, 900);
                            count += 1;
                            break;
                        case 9:
                            Handler han9 = new Handler();
                            han9.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    IMG[9].setVisibility(View.VISIBLE);
                                }
                            }, 1000);
                            count += 1;
                            break;
                        case 10:
                            Handler han10 = new Handler();
                            han10.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    IMG[10].setVisibility(View.VISIBLE);
                                }
                            }, 1100);
                            count += 1;
                            break;
                        case 11:
                            Handler han11 = new Handler();
                            han11.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    IMG[11].setVisibility(View.VISIBLE);
                                }
                            }, 1200);
                            count += 1;
                            break;
                        case 12:
                            Handler han12 = new Handler();
                            han12.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    IMG[12].setVisibility(View.VISIBLE);
                                }
                            }, 1300);
                            count += 1;
                            break;
                        case 13:
                            Handler han13 = new Handler();
                            han13.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    IMG[13].setVisibility(View.VISIBLE);
                                }
                            }, 1400);
                            count += 1;
                            break;
                        case 14:
                            Handler han14 = new Handler();
                            han14.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    IMG[14].setVisibility(View.VISIBLE);
                                }
                            }, 1500);
                            count += 1;
                            break;
                        case 15:
                            Handler han15 = new Handler();
                            han15.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                                    startActivity(intent);
                                    finish();
                                }
                            }, 1600);
                            count += 1;
                            break;
                        default:
                    }
                }
            }
        },1600);
    }
}
