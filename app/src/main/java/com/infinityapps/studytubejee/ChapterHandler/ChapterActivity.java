package com.infinityapps.studytubejee.ChapterHandler;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.infinityapps.studytubejee.R;

public class ChapterActivity extends AppCompatActivity {
    /* RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_chapter);
     ChapterAdapter adapter = new ChapterAdapter(myl);
     recyclerView.setHasFixedSize(true);
     recyclerView.setLayoutManager(new LinearLayoutManager(this));
     recyclerView.setAdapter(adapter);*/

    //01. Physics Wallah
    //02. Unacademy Jee
    //03. Vedantu Jee
    //.01 Physics
    //.02 Chemistry
    //.03 Maths
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_recycler);
        double classData = getIntent().getDoubleExtra("CLASS", 0);

        //Physics class 11 Physics Wallah
        if (classData == 01.1101) {
            ChapterListAdapterData[] myListData = new ChapterListAdapterData[]{

                    new ChapterListAdapterData(getString(R.string.ch01), getString(R.string.c11ch01p), "PL_xpLMzb0wP7NkoM5U-m6CD9ON-sHNFFJ"),
                    new ChapterListAdapterData(getString(R.string.ch02), getString(R.string.c11ch02p), "PLF_7kfnwLFCF8zF_UGP26KjdrBlDxjZ8U"),
                    new ChapterListAdapterData(getString(R.string.ch03), getString(R.string.c11ch03p), "PLF_7kfnwLFCHamOEHrFDSVoI6wszQQheq"),
                    new ChapterListAdapterData(getString(R.string.ch04), getString(R.string.c11ch04p), ""),
                    new ChapterListAdapterData(getString(R.string.ch05), getString(R.string.c11ch05p), "PLF_7kfnwLFCGcF1IhVgTiZ-Sf0pnKIOub"),
                    new ChapterListAdapterData(getString(R.string.ch06), getString(R.string.c11ch06p), "PLF_7kfnwLFCFS0k0WNHuTvjRxJFKQK5qr"),
                    new ChapterListAdapterData(getString(R.string.ch07), getString(R.string.c11ch07p), "PLF_7kfnwLFCHPUM8UWjv2uy4S08SCtjEh"),
                    new ChapterListAdapterData(getString(R.string.ch08), getString(R.string.c11ch08p), "PLF_7kfnwLFCEwyxzG-rg2uYeYA2q1S2d8"),
                    new ChapterListAdapterData(getString(R.string.ch09), getString(R.string.c11ch09p), ""),
                    new ChapterListAdapterData(getString(R.string.ch10), getString(R.string.c11ch10p), "PLF_7kfnwLFCHXd4k2jaPkHOBMzzGCq7t0"),
                    new ChapterListAdapterData(getString(R.string.ch11), getString(R.string.c11ch11p), "PLF_7kfnwLFCFXX6N28304Ww_gUjh1Qtir"),
                    new ChapterListAdapterData(getString(R.string.ch12), getString(R.string.c11ch12p), "PLF_7kfnwLFCFPfN4TGeJt1PQpJd3MG6Zz"),
                    new ChapterListAdapterData(getString(R.string.ch13), getString(R.string.c11ch13p), ""),
                    new ChapterListAdapterData(getString(R.string.ch14), getString(R.string.c11ch14p), "PLF_7kfnwLFCEvhpUaPoDQvhPwug0aZ1R4"),
                    new ChapterListAdapterData(getString(R.string.ch15), getString(R.string.c11ch15p), "PLF_7kfnwLFCEp1eygWPhgPI6A9th2Fw-S"),
            };
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_chapter);
            ChapterAdapter adapter = new ChapterAdapter(myListData);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(ChapterActivity.this));
            recyclerView.setAdapter(adapter);
        }

        //Chemistry Class 11 Physics Wallah
        if (classData == 01.1102) {
            ChapterListAdapterData[] myListData = new ChapterListAdapterData[]{
                    new ChapterListAdapterData(getString(R.string.ch01), getString(R.string.c11ch01c), "PLF_7kfnwLFCHzAKa-IGFTkzNKWgHWaqe5"),
                    new ChapterListAdapterData(getString(R.string.ch02), getString(R.string.c11ch02c), "PLF_7kfnwLFCFnjki8KSeTQHyJ7OkdBdNA"),
                    new ChapterListAdapterData(getString(R.string.ch03), getString(R.string.c11ch03c), "PLF_7kfnwLFCFW27SD2cKamlTUde0OurJS"),
                    new ChapterListAdapterData(getString(R.string.ch04), getString(R.string.c11ch04c), "PLF_7kfnwLFCGzzyaPRyNjSXRRR7W_qmny"),
                    new ChapterListAdapterData(getString(R.string.ch05), getString(R.string.c11ch05c), "PLF_7kfnwLFCEzJZWNHb_K9tFC78F0AXOl"),
                    new ChapterListAdapterData(getString(R.string.ch06), getString(R.string.c11ch06c), "PLF_7kfnwLFCFijVGjd7zrjtWrxi4-4xeY"),
                    new ChapterListAdapterData(getString(R.string.ch07), getString(R.string.c11ch07c), "PLF_7kfnwLFCGNdqR8jaKSpxiiR83vM3_r"),
                    new ChapterListAdapterData(getString(R.string.ch08), getString(R.string.c11ch08c), "PLTpsEaEiWczjpQ4bPDtfZa6cKie5wUU0m"),
                    new ChapterListAdapterData(getString(R.string.ch09), getString(R.string.c11ch09c), "PLF_7kfnwLFCEp3mJpBOvxh1cuDa2B85Ko"),
                    new ChapterListAdapterData(getString(R.string.ch10), getString(R.string.c11ch10c), "PLF_7kfnwLFCGgejMKAWCclnzyMgvxScKk"),
                    new ChapterListAdapterData(getString(R.string.ch11), /*getString(R.string.c11ch11c)*/"IUPAC Nomenclature", "PLF_7kfnwLFCEuZYwmM6Wyx-LXgnewrekZ"),
                    new ChapterListAdapterData(getString(R.string.ch12), getString(R.string.c11ch12c), "PLF_7kfnwLFCGnyrRfiT8251OrVqJzHnBM"),
                    new ChapterListAdapterData(getString(R.string.ch13), getString(R.string.c11ch13c), "PLF_7kfnwLFCFqvbAsdBsAtL7A7CGggSZX"),
                   // new ChapterListAdapterData(getString(R.string.ch14), getString(R.string.c11ch14c), ""),
            } ;
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_chapter);
            ChapterAdapter adapter = new ChapterAdapter(myListData);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(ChapterActivity.this));
            recyclerView.setAdapter(adapter);
        }

        //Class 11 Maths(Pace) Physics Wallah
        if (classData == 01.1103) {
            ChapterListAdapterData[] myListData = new ChapterListAdapterData[]{
                    new ChapterListAdapterData(getString(R.string.ch01), getString(R.string.c11ch01m), ""),
                    new ChapterListAdapterData(getString(R.string.ch02), getString(R.string.c11ch02m), ""),
                    new ChapterListAdapterData(getString(R.string.ch03), getString(R.string.c11ch03m), ""),
                    new ChapterListAdapterData(getString(R.string.ch04), getString(R.string.c11ch04m), ""),
                    new ChapterListAdapterData(getString(R.string.ch05), getString(R.string.c11ch05m), ""),
                    new ChapterListAdapterData(getString(R.string.ch06), getString(R.string.c11ch06m), ""),
                    new ChapterListAdapterData(getString(R.string.ch07), getString(R.string.c11ch07m), ""),
                    new ChapterListAdapterData(getString(R.string.ch08), getString(R.string.c11ch08m), ""),
                    new ChapterListAdapterData(getString(R.string.ch09), getString(R.string.c11ch09m), ""),
                    new ChapterListAdapterData(getString(R.string.ch10), getString(R.string.c11ch10m), ""),
                    new ChapterListAdapterData(getString(R.string.ch11), getString(R.string.c11ch11m), ""),
                    new ChapterListAdapterData(getString(R.string.ch12), getString(R.string.c11ch12m), ""),
                    new ChapterListAdapterData(getString(R.string.ch13), getString(R.string.c11ch13m), ""),
                    new ChapterListAdapterData(getString(R.string.ch14), getString(R.string.c11ch14m), ""),
                    new ChapterListAdapterData(getString(R.string.ch15), getString(R.string.c11ch15m), ""),
                    new ChapterListAdapterData(getString(R.string.ch16), getString(R.string.c11ch16m), ""),
            } ;
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_chapter);
            ChapterAdapter adapter = new ChapterAdapter(myListData);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(ChapterActivity.this));
            recyclerView.setAdapter(adapter);
        }

        //Class 11 Physics(Pace) Physics Wallah
        if (classData == 01.1104) {
            ChapterListAdapterData[] myListData = new ChapterListAdapterData[]{
                    new ChapterListAdapterData(getString(R.string.ch01), getString(R.string.c11ch01p), ""),
                    new ChapterListAdapterData(getString(R.string.ch02), getString(R.string.c11ch02p), ""),
                    new ChapterListAdapterData(getString(R.string.ch03), getString(R.string.c11ch03p), ""),
                    new ChapterListAdapterData(getString(R.string.ch04), getString(R.string.c11ch04p), ""),
                    new ChapterListAdapterData(getString(R.string.ch05), getString(R.string.c11ch05p), ""),
                    new ChapterListAdapterData(getString(R.string.ch06), getString(R.string.c11ch06p), ""),
                    new ChapterListAdapterData(getString(R.string.ch07), getString(R.string.c11ch07p), ""),
                    new ChapterListAdapterData(getString(R.string.ch08), getString(R.string.c11ch08p), ""),
                    new ChapterListAdapterData(getString(R.string.ch09), getString(R.string.c11ch09p), ""),
                    new ChapterListAdapterData(getString(R.string.ch10), getString(R.string.c11ch10p), ""),
                    new ChapterListAdapterData(getString(R.string.ch11), getString(R.string.c11ch11p), ""),
                    new ChapterListAdapterData(getString(R.string.ch12), getString(R.string.c11ch12p), ""),
                    new ChapterListAdapterData(getString(R.string.ch13), getString(R.string.c11ch13p), ""),
                    new ChapterListAdapterData(getString(R.string.ch14), getString(R.string.c11ch14p), ""),
                    new ChapterListAdapterData(getString(R.string.ch15), getString(R.string.c11ch15p), ""),
            } ;
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_chapter);
            ChapterAdapter adapter = new ChapterAdapter(myListData);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(ChapterActivity.this));
            recyclerView.setAdapter(adapter);
        }
        //Class 11 Chemistry(Pace) Physics Wallah
        if (classData == 01.1105) {
                ChapterListAdapterData[] myListData = new ChapterListAdapterData[]{
                        new ChapterListAdapterData(getString(R.string.ch01), getString(R.string.c11ch01c), ""),
                        new ChapterListAdapterData(getString(R.string.ch02), getString(R.string.c11ch02c), ""),
                        new ChapterListAdapterData(getString(R.string.ch03), getString(R.string.c11ch03c), ""),
                        new ChapterListAdapterData(getString(R.string.ch04), getString(R.string.c11ch04c), ""),
                        new ChapterListAdapterData(getString(R.string.ch05), getString(R.string.c11ch05c), ""),
                        new ChapterListAdapterData(getString(R.string.ch06), getString(R.string.c11ch06c), ""),
                        new ChapterListAdapterData(getString(R.string.ch07), getString(R.string.c11ch07c), ""),
                        new ChapterListAdapterData(getString(R.string.ch08), getString(R.string.c11ch08c), ""),
                        new ChapterListAdapterData(getString(R.string.ch09), getString(R.string.c11ch09c), ""),
                        new ChapterListAdapterData(getString(R.string.ch10), getString(R.string.c11ch10c), ""),
                        new ChapterListAdapterData(getString(R.string.ch11), getString(R.string.c11ch11c), ""),
                        new ChapterListAdapterData(getString(R.string.ch12), getString(R.string.c11ch12c), ""),
                        new ChapterListAdapterData(getString(R.string.ch13), getString(R.string.c11ch13c), ""),
                        new ChapterListAdapterData(getString(R.string.ch14), getString(R.string.c11ch14c), ""),
                } ;
                RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_chapter);
                ChapterAdapter adapter = new ChapterAdapter(myListData);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(ChapterActivity.this));
            recyclerView.setAdapter(adapter);
        }

        //Class 12 Physics Physics Wallah
        if (classData == 01.1201) {
            ChapterListAdapterData[] myListData = new ChapterListAdapterData[]{

                    new ChapterListAdapterData(getString(R.string.ch01), getString(R.string.c12ch01p), "PLF_7kfnwLFCHjzvhflQjAOG97MgutH3Z5"),
                    new ChapterListAdapterData(getString(R.string.ch02), getString(R.string.c12ch02p), "PLF_7kfnwLFCFxjSU9HKYiq2K2cxbpf6mz"),
                    new ChapterListAdapterData(getString(R.string.ch03), getString(R.string.c12ch03p), "PLF_7kfnwLFCFZ4OVmzjBSqMIAzDK_6b8f"),
                    new ChapterListAdapterData(getString(R.string.ch04), getString(R.string.c12ch04p), "PLF_7kfnwLFCF8sjVSdxn3yWAghIgVnw26"),
                    new ChapterListAdapterData(getString(R.string.ch05), getString(R.string.c12ch05p), ""),
                    new ChapterListAdapterData(getString(R.string.ch06), getString(R.string.c12ch06p), "PLF_7kfnwLFCE6mi_so22MJJ988uaHBJaQ"),
                    new ChapterListAdapterData(getString(R.string.ch07), getString(R.string.c12ch07p), "PLF_7kfnwLFCELMB-TfYgbfAN2nuP-z4t5"),
                    new ChapterListAdapterData(getString(R.string.ch08), getString(R.string.c12ch08p), ""),
                    new ChapterListAdapterData(getString(R.string.ch09), getString(R.string.c12ch09p), "PLF_7kfnwLFCFxb0yvMYbPqzvZn2GN5aMw"),
                    new ChapterListAdapterData(getString(R.string.ch10), getString(R.string.c12ch10p), ""),
                    new ChapterListAdapterData(getString(R.string.ch11), getString(R.string.c12ch11p), "PLF_7kfnwLFCHr4eZATw4YURnGNr6mwF5R"),
                    new ChapterListAdapterData(getString(R.string.ch12), getString(R.string.c12ch12p), ""),
                    new ChapterListAdapterData(getString(R.string.ch13), getString(R.string.c12ch13p), "PLF_7kfnwLFCH5Okd6hTPRfzc7sqIeG7Jc"),
                    new ChapterListAdapterData(getString(R.string.ch14), getString(R.string.c12ch14p), ""),
                    new ChapterListAdapterData(getString(R.string.ch15), getString(R.string.c12ch15p), ""),

            };
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_chapter);
            ChapterAdapter adapter = new ChapterAdapter(myListData);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(ChapterActivity.this));
            recyclerView.setAdapter(adapter);
        }

        //Class 12 Chemistry Physics Wallah
        if (classData == 01.1202) {
            ChapterListAdapterData[] myListData = new ChapterListAdapterData[]{

                    new ChapterListAdapterData(getString(R.string.ch01), getString(R.string.c12ch01c), "PLF_7kfnwLFCHJ6kUboe60izCndyBUjiaZ"),
                    new ChapterListAdapterData(getString(R.string.ch02), getString(R.string.c12ch02c), "PLF_7kfnwLFCHJ6kUboe60izCndyBUjiaZ"),
                    new ChapterListAdapterData(getString(R.string.ch03), getString(R.string.c12ch03c), "PLF_7kfnwLFCF_VxKKAhHSLryCsJr3GW71"),
                    new ChapterListAdapterData(getString(R.string.ch04), getString(R.string.c12ch04c), "PLF_7kfnwLFCHlh8wdeQ_ZZ96DhBDjqGMZ"),
                    new ChapterListAdapterData(getString(R.string.ch05), getString(R.string.c12ch05c), ""),
                    new ChapterListAdapterData(getString(R.string.ch06), getString(R.string.c12ch06c), ""),
                    new ChapterListAdapterData(getString(R.string.ch07), getString(R.string.c12ch07c), ""),
                    new ChapterListAdapterData(getString(R.string.ch08), getString(R.string.c12ch08c), ""),
                    new ChapterListAdapterData(getString(R.string.ch09), getString(R.string.c12ch09c), ""),
                    new ChapterListAdapterData(getString(R.string.ch10), getString(R.string.c12ch10c), "PLF_7kfnwLFCG-Fm0odaUEQjDTEHdyP3PP"),
                    new ChapterListAdapterData(getString(R.string.ch11), getString(R.string.c12ch11c), "PLF_7kfnwLFCEllUy1_z114tXRmq7UQJlj"),
                    new ChapterListAdapterData(getString(R.string.ch12), getString(R.string.c12ch12c), "PLF_7kfnwLFCHUtZnRiUbHrS5WSV0BsvSg"),
                    new ChapterListAdapterData(getString(R.string.ch13), getString(R.string.c12ch13c), ""),
                    new ChapterListAdapterData(getString(R.string.ch14), getString(R.string.c12ch14c), ""),
                    new ChapterListAdapterData(getString(R.string.ch15), getString(R.string.c12ch15c), ""),
                    new ChapterListAdapterData(getString(R.string.ch16), getString(R.string.c12ch16c), ""),

            };
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_chapter);
            ChapterAdapter adapter = new ChapterAdapter(myListData);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(ChapterActivity.this));
            recyclerView.setAdapter(adapter);
        }
        //Unacademy  Physics Class 11
        if (classData == 02.1101) {
            ChapterListAdapterData[] myListData = new ChapterListAdapterData[]{
                    new ChapterListAdapterData("0.","Basic Kinematics","PLbu_fGT0MPss_1Utcwm5oeUVBE1yg8x9M"),
                    new ChapterListAdapterData("0.","Basic Mathematics","PLbu_fGT0MPsuMOB1uEJlrk_1P1I2u84W8"),
                    new ChapterListAdapterData("0.","Vectors","PLbu_fGT0MPssl0KPE7BVdXQYtXShpkgiB"),
                   // new ChapterListAdapterData(getString(R.string.ch01), getString(R.string.c11ch01p), ""),
                    new ChapterListAdapterData(getString(R.string.ch02), getString(R.string.c11ch02p), "PLbu_fGT0MPst9EZfRuj5nxVFgDIVPFWrH"),
                    new ChapterListAdapterData(getString(R.string.ch03), getString(R.string.c11ch03p), "PLbu_fGT0MPsvgDS_TFTgzsffTjw15BJWP"),
                    new ChapterListAdapterData(getString(R.string.ch04), getString(R.string.c11ch04p), "PLbu_fGT0MPsvZBXHBd9DcKPf9ydUJwKgj"),
                    new ChapterListAdapterData(getString(R.string.ch05), getString(R.string.c11ch05p), "PLbu_fGT0MPsubt7XKt6iCMYiuFLxMPHSX"),
                    new ChapterListAdapterData(getString(R.string.ch05),"Friction", "PLbu_fGT0MPsvwcnLoFdzsGMb7i0mXUrM_"),
                    new ChapterListAdapterData(getString(R.string.ch06), getString(R.string.c11ch06p), "PLbu_fGT0MPst7xdBxZ2xu-Mk1kJXLA_vd"),
                    new ChapterListAdapterData(getString(R.string.ch06),"Circular Motion", "PLbu_fGT0MPsvEPAW19bDBzHCRxyWbpZvO"),
                    new ChapterListAdapterData(getString(R.string.ch07),"Center of Mass","PLbu_fGT0MPsvkBewZMokf6WQrLA8wPb8B"),
                    new ChapterListAdapterData(getString(R.string.ch07),getString(R.string.c11ch07p),"PLbu_fGT0MPsu4U2uiFrIuFgfkbYS22QCm"),
                    new ChapterListAdapterData(getString(R.string.ch08), getString(R.string.c11ch08p), "PLbu_fGT0MPstWq9gKwWhVQAva0xO1sfJP"),
                    new ChapterListAdapterData(getString(R.string.ch09), getString(R.string.c11ch09p), "PLbu_fGT0MPss4FoGsDbe8-zZ6Xn7s2oO8"),
                    new ChapterListAdapterData(getString(R.string.ch10), getString(R.string.c11ch10p), "PLbu_fGT0MPsuNy7_RPdUj85GTWgByiAwc"),
                    new ChapterListAdapterData(getString(R.string.ch11), getString(R.string.c11ch11p), "PLbu_fGT0MPss3CVVKvRsiLWx26o9eSPTo"),
                    new ChapterListAdapterData(getString(R.string.ch11),getString(R.string.c11ch11p)+"(Calorimetry)","PLbu_fGT0MPssgjkj0Iw7WW4zOsBmGYyzA"),
                    new ChapterListAdapterData(getString(R.string.ch12), getString(R.string.c11ch12p), "PLbu_fGT0MPss9cNj9kogbhph96PdSJq9r"),
                    new ChapterListAdapterData(getString(R.string.ch13), getString(R.string.c11ch13p), "PLbu_fGT0MPsuyHmVGK3KkBY7A_fZLXXM4"),
                    new ChapterListAdapterData(getString(R.string.ch14), getString(R.string.c11ch14p), "PLbu_fGT0MPstiDyJpOZqdXQ0NvcrkkOev"),
                    new ChapterListAdapterData(getString(R.string.ch15), getString(R.string.c11ch15p), "PLbu_fGT0MPstNvnFFn2Rt80wAd7vlXktX"),
        } ;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_chapter);
        ChapterAdapter adapter = new ChapterAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(ChapterActivity.this));
        recyclerView.setAdapter(adapter);
    }
        //Chemistry Class 11 Unacademy
        if (classData == 02.1102) {
            ChapterListAdapterData[] myListData = new ChapterListAdapterData[]{
                    new ChapterListAdapterData("0.","Introduction","PLbu_fGT0MPssbVQAU3wBDs41CjjwY5703"),
                    new ChapterListAdapterData(getString(R.string.ch01), getString(R.string.c11ch01c), "PLbu_fGT0MPsvYUR-Lp8s2n4r0-SfZF7vH"),
                    new ChapterListAdapterData(getString(R.string.ch02), getString(R.string.c11ch02c), "PLbu_fGT0MPsuzWJAu1zyBHoeyuM4CG0qZ"),
                    new ChapterListAdapterData(getString(R.string.ch03), getString(R.string.c11ch03c), "PLbu_fGT0MPsuhfwwMtzne8SDJ8vdGL3al"),
                    new ChapterListAdapterData(getString(R.string.ch04), getString(R.string.c11ch04c), "PLbu_fGT0MPssgL0KPkky6GJFdn9qASoJO"),
                    new ChapterListAdapterData(getString(R.string.ch05), getString(R.string.c11ch05c), "PLbu_fGT0MPsvAoZLCy5IRhdLGw3X5SLMW"),
                    new ChapterListAdapterData(getString(R.string.ch06), getString(R.string.c11ch06c), "PLbu_fGT0MPstWCMPilZF0YKcNrwdXA7S0"),
                    new ChapterListAdapterData(getString(R.string.ch06),getString(R.string.c11ch06c)+"(II)","PLbu_fGT0MPssT59WDUipc6SPwosg6sypX"),
                    new ChapterListAdapterData(getString(R.string.ch06),"Thermochemistry", "PLbu_fGT0MPsupWBSKNRggXMF9-Qdcv7HV"),
                    new ChapterListAdapterData(getString(R.string.ch07), getString(R.string.c11ch07c)+"(Chemical)", "PLbu_fGT0MPsv9W38hFS_mTYbdOUOnidzG"),
                    new ChapterListAdapterData(getString(R.string.ch07), getString(R.string.c11ch07c)+"(Ionic)", "PLbu_fGT0MPsscrFaaLEm1tWW6ZnCMtHA2"),
                    new ChapterListAdapterData(getString(R.string.ch08), getString(R.string.c11ch08c), "PLbu_fGT0MPsszMCeCtp5ClRFTErgi6T7J"),
                    new ChapterListAdapterData(getString(R.string.ch08), "Volumetric Analysis", "PLbu_fGT0MPsvdVYRE7AfqQP-3-Ru3rQGG"),
                    new ChapterListAdapterData(getString(R.string.ch09), getString(R.string.c11ch09c), "PLbu_fGT0MPssyqpy630AXUzIQ_tyAvepo"),
                    new ChapterListAdapterData(getString(R.string.ch10), getString(R.string.c11ch10c), "PLbu_fGT0MPstj2jfSwDrSSjkONM5bmHDZ"),
                    new ChapterListAdapterData(getString(R.string.ch11), getString(R.string.c11ch11c), "PLbu_fGT0MPstOQeaP6k2LGZPfU-R89G-8"),
                    new ChapterListAdapterData(getString(R.string.ch12), getString(R.string.c11ch12c), "PLbu_fGT0MPsu6j3R7SA6WziaLbiQoUHEO"),
                    new ChapterListAdapterData(getString(R.string.ch12), getString(R.string.c11ch12c)+"(II)","PLbu_fGT0MPstv5UD2FjpkIDwaLmY8fC48"),
                   // new ChapterListAdapterData(getString(R.string.ch13), getString(R.string.c11ch13c), ""),
                    //new ChapterListAdapterData(getString(R.string.ch14), getString(R.string.c11ch14c), ""),
            } ;
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_chapter);
            ChapterAdapter adapter = new ChapterAdapter(myListData);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(ChapterActivity.this));
            recyclerView.setAdapter(adapter);
        }

        //Class 11 Maths Unacademy
        if (classData == 02.1103) {
            ChapterListAdapterData[] myListData = new ChapterListAdapterData[]{
                    new ChapterListAdapterData(getString(R.string.ch01), getString(R.string.c11ch01m), "PLbu_fGT0MPstoHe6u2E6yfoZdvarAtkw4"),
                    new ChapterListAdapterData(getString(R.string.ch02), getString(R.string.c11ch02m), "PLbu_fGT0MPsunah4Xgt-E1DBMJJA4C6WQ"),
                    new ChapterListAdapterData(getString(R.string.ch03), getString(R.string.c11ch03m), "PLbu_fGT0MPsvyOz39-H-kaxusMxPNN_xA"),
                    new ChapterListAdapterData(getString(R.string.ch03),getString(R.string.c11ch03m)+"(II)","PLbu_fGT0MPsuEOMPtDeZcj3kgbvprTEvS"),
                    new ChapterListAdapterData(getString(R.string.ch04), getString(R.string.c11ch04m), ""),
                    new ChapterListAdapterData(getString(R.string.ch05), "Quadratic Equations", "PLbu_fGT0MPsvYfgD-VlnukIZflJFezEyi"),
                    new ChapterListAdapterData(getString(R.string.ch05),"Complex Numbers","PLbu_fGT0MPstQiE2NUQNh-kDoYakFjE_5"),
                    new ChapterListAdapterData(getString(R.string.ch06), getString(R.string.c11ch06m), ""),
                    new ChapterListAdapterData(getString(R.string.ch07), getString(R.string.c11ch07m), "PLbu_fGT0MPsuRrJKn3JvmYZSMq2GH3xv1"),
                    new ChapterListAdapterData(getString(R.string.ch08), getString(R.string.c11ch08m), "PLbu_fGT0MPssPML-BCZ6ByU8dVlVe3nIl"),
                    new ChapterListAdapterData(getString(R.string.ch09), getString(R.string.c11ch09m), "PLbu_fGT0MPstnxTjrAvYwvl6HC1EvU6g4"),
                    new ChapterListAdapterData(getString(R.string.ch10), getString(R.string.c11ch10m), "PLbu_fGT0MPsvtuj18B7gltWnPKum04tkO"),
                    new ChapterListAdapterData(getString(R.string.ch10),"Pair of Straight Line","PLbu_fGT0MPssuUlrJG-b4ONKnfZds8NFR"),
                    new ChapterListAdapterData(getString(R.string.ch11), getString(R.string.c11ch11m)+"(Circles)", "PLbu_fGT0MPsspBuGplWCkjdwWxCoALVjw"),
                    new ChapterListAdapterData(getString(R.string.ch11), getString(R.string.c11ch11m)+"(Parabola)", "PLbu_fGT0MPsswr2uJg7LK8KEHWlyj45wZ"),
                    new ChapterListAdapterData(getString(R.string.ch11), getString(R.string.c11ch11m)+"(Ellipse)", "PLbu_fGT0MPssdDMOPAnWn9FAa_wh3XGLL"),
                    new ChapterListAdapterData(getString(R.string.ch11), getString(R.string.c11ch11m)+"(Hyperbola)", "PLbu_fGT0MPsvxIam1kDssvedOf1h9fbPQ"),
                   /* new ChapterListAdapterData(getString(R.string.ch11), getString(R.string.c11ch11m), "()"),
                    new ChapterListAdapterData(getString(R.string.ch12), getString(R.string.c11ch12m), ""),
                    new ChapterListAdapterData(getString(R.string.ch13), getString(R.string.c11ch13m), ""),
                    new ChapterListAdapterData(getString(R.string.ch14), getString(R.string.c11ch14m), ""),
                    new ChapterListAdapterData(getString(R.string.ch15), getString(R.string.c11ch15m), ""),
                    new ChapterListAdapterData(getString(R.string.ch16), getString(R.string.c11ch16m), ""),*/
            } ;
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_chapter);
            ChapterAdapter adapter = new ChapterAdapter(myListData);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(ChapterActivity.this));
            recyclerView.setAdapter(adapter);
        }
        //Unacademy Physics Class 12
        if(classData==02.1201){
            ChapterListAdapterData[] myListData = new ChapterListAdapterData[]{

                    new ChapterListAdapterData(getString(R.string.ch01), getString(R.string.c12ch01p), "PLbu_fGT0MPssDDEfy-1W7JzUR23Hf8Tgh"),
                    new ChapterListAdapterData(getString(R.string.ch01),"Electrostatics (Gauss Law)", "PLbu_fGT0MPssFz0QPTQO6bIRRmMCeVRaR"),
                    new ChapterListAdapterData(getString(R.string.ch02), getString(R.string.c12ch02p), ""),
                    new ChapterListAdapterData(getString(R.string.ch03), getString(R.string.c12ch03p), "PLbu_fGT0MPsvcctqhbd6gYC3fAyulFsnm"),
                   /* new ChapterListAdapterData(getString(R.string.ch04), getString(R.string.c12ch04p), ""),
                    new ChapterListAdapterData(getString(R.string.ch05), getString(R.string.c12ch05p), ""),*/
                    new ChapterListAdapterData("4.","Magnetic Field","PLbu_fGT0MPstudBkEUzsypnnv4rkj7clu"),
                    new ChapterListAdapterData("5.","Magnetic Force","PLbu_fGT0MPsuxhTU1KI_3nfkJ0hn45mFL"),
                    new ChapterListAdapterData(getString(R.string.ch06), getString(R.string.c12ch06p), "PLbu_fGT0MPsuQi-8xCITCKEXr9YlF9_Gb"),
                    new ChapterListAdapterData(getString(R.string.ch07), getString(R.string.c12ch07p), "PLbu_fGT0MPsvxi26aPZRfTPx3JuMX_n53"),
                    new ChapterListAdapterData(getString(R.string.ch07),"Measuring Instruments","PLbu_fGT0MPstXvdoQW5WG8YI2Iad0a9k9"),
                    new ChapterListAdapterData(getString(R.string.ch08), getString(R.string.c12ch08p), ""),
                    new ChapterListAdapterData(getString(R.string.ch09), getString(R.string.c12ch09p), "PLbu_fGT0MPsusG5RhrJJ-c_cCoeMIOcJa"),
                    new ChapterListAdapterData(getString(R.string.ch09),getString(R.string.c12ch09p)+"(Optical Instruments)","PLbu_fGT0MPssknyjkz-QwyHWTVjYwD6Sd"),
                    new ChapterListAdapterData(getString(R.string.ch10), getString(R.string.c12ch10p), "PLbu_fGT0MPss6OjLXVQi0EBvw4Jy4ulZT"),
                    new ChapterListAdapterData(getString(R.string.ch11), getString(R.string.c12ch11p), ""),
                    new ChapterListAdapterData("","Modern Physics","PLbu_fGT0MPsu0J-ny0EBpnvR7yx9mS5Or"),
                    new ChapterListAdapterData("","X Rays","PLbu_fGT0MPss-uLMMwlLkRypkYhVDkYk2"),
                    new ChapterListAdapterData("","Radioactivity","PLbu_fGT0MPsvN0rrDRaUcGEuE2FGvHWkD"),
                    new ChapterListAdapterData(getString(R.string.ch12), getString(R.string.c12ch12p)+"(Atomic Physics)", "PLbu_fGT0MPsvehQn-kRWVjvQ8VHixvzXU"),
                    new ChapterListAdapterData(getString(R.string.ch13), getString(R.string.c12ch13p)+"(Nuclear Physics)", "PLbu_fGT0MPssI3lU8HhF2fL2ooinHRdcn"),
                    new ChapterListAdapterData(getString(R.string.ch14), getString(R.string.c12ch14p), "PLbu_fGT0MPst9G_hxX6x3KeYFGTOGhvpt"),
                    new ChapterListAdapterData(getString(R.string.ch15), getString(R.string.c12ch15p), ""),

            };
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_chapter);
            ChapterAdapter adapter = new ChapterAdapter(myListData);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(ChapterActivity.this));
            recyclerView.setAdapter(adapter);
        }

        //Class 12 Chemistry Unacademy
        if (classData == 02.1202) {
            ChapterListAdapterData[] myListData = new ChapterListAdapterData[]{

                    new ChapterListAdapterData(getString(R.string.ch01), getString(R.string.c12ch01c), "PLbu_fGT0MPsuJoldXfEROqx5oRXwQcaa5"),
                    new ChapterListAdapterData(getString(R.string.ch02), getString(R.string.c12ch02c), "PLbu_fGT0MPsvhI6oNLwV1qwUWktD-MMQ5"),
                    new ChapterListAdapterData(getString(R.string.ch03), getString(R.string.c12ch03c), "PLbu_fGT0MPssTn-R9X3BZCms9NKpUFUb0"),
                    new ChapterListAdapterData(getString(R.string.ch04), getString(R.string.c12ch04c), "PLbu_fGT0MPsvxhH15yMBfLbx2Iuj-PcBu"),
                    new ChapterListAdapterData("4.","Reaction Mechanism","PLbu_fGT0MPsv3Mc5rlw6l3S51VaR9vNB9"),
                    new ChapterListAdapterData(getString(R.string.ch05), getString(R.string.c12ch05c), "PLbu_fGT0MPsuhUMGjOWt0DJ40M0Q4mQa9"),
                    new ChapterListAdapterData(getString(R.string.ch06), getString(R.string.c12ch06c), "PLbu_fGT0MPstSt216vfQDsUKnYkD-6Pyy"),
                    new ChapterListAdapterData(getString(R.string.ch07), getString(R.string.c12ch07c), ""),
                    new ChapterListAdapterData(getString(R.string.ch08), getString(R.string.c12ch08c), "PLbu_fGT0MPsvRPf2nNJEkTCaQT9VAQI9-"),
                    new ChapterListAdapterData(getString(R.string.ch09), getString(R.string.c12ch09c), "PLbu_fGT0MPst_w9ZCupjRcMEnRNKXH08J"),
                    new ChapterListAdapterData(getString(R.string.ch10), getString(R.string.c12ch10c), "PLbu_fGT0MPss61Bv3KYKTLvgiDAmCTU3r"),
                    new ChapterListAdapterData(getString(R.string.ch11), getString(R.string.c12ch11c), "PLbu_fGT0MPssTXh1AavyDxpepNV8um3F5"),
                    new ChapterListAdapterData(getString(R.string.ch12),"Ketones & Aldehydes","PLbu_fGT0MPsuU7IvR7B69OOsZD7pPpkXH"),
                    new ChapterListAdapterData(getString(R.string.ch12), "Carboxylic Acids", "PLbu_fGT0MPsvcJuAzu7xgTAse9E-SrYo8"),
                    new ChapterListAdapterData(getString(R.string.ch13), getString(R.string.c12ch13c), "PLbu_fGT0MPsuMotoNnFOZOMkD_ErUcgl1"),
                    new ChapterListAdapterData(getString(R.string.ch14), getString(R.string.c12ch14c), "PLbu_fGT0MPssyEgnxEAOB0CIa2UudNwbf"),
                    new ChapterListAdapterData(getString(R.string.ch15), getString(R.string.c12ch15c), ""),
                    new ChapterListAdapterData(getString(R.string.ch16), getString(R.string.c12ch16c), ""),
                    new ChapterListAdapterData("17.","Nuclear Chemistry","PLbu_fGT0MPss_kHS-_ejoGQseFnUrQhxN"),
                    new ChapterListAdapterData("","Salt Anaysis Anions","PLbu_fGT0MPsvHBI_M7BIoq5DtASOpKa_M"),
                    new ChapterListAdapterData("","Salt Analysis Cations","PLbu_fGT0MPsvHBI_M7BIoq5DtASOpKa_M"),
                    new ChapterListAdapterData("","Coordination Chemistry","PLbu_fGT0MPsvEpRwwiVOyGSrz1yVZfWRD"),
                    new ChapterListAdapterData("","Reduction Oxidation and Hydrolysis","PLbu_fGT0MPsv2_p_dravlK2B1kmnskAdg"),
                    new ChapterListAdapterData("","Basics of Organic Chemistry","PLbu_fGT0MPstjw70FqBsh3UfLZwvBzQMc"),

            };
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_chapter);
            ChapterAdapter adapter = new ChapterAdapter(myListData);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(ChapterActivity.this));
            recyclerView.setAdapter(adapter);
        }
        //Class 12 Maths Unacademy
        if (classData == 02.1203) {
            ChapterListAdapterData[] myListData = new ChapterListAdapterData[]{

                    new ChapterListAdapterData(getString(R.string.ch01), getString(R.string.c12ch01m), "PLbu_fGT0MPsulk5jpAkbkoyB5zh3g5Rzg"),
                    new ChapterListAdapterData(getString(R.string.ch02), getString(R.string.c12ch02m), "PLbu_fGT0MPsuebu593XpIwrspIMZG8EkO"),
                    new ChapterListAdapterData(getString(R.string.ch03), getString(R.string.c12ch03m), "PLbu_fGT0MPsssTQnaPbHz2Fzr3oye3aYd"),
                   /* new ChapterListAdapterData(getString(R.string.ch04), getString(R.string.c12ch04m), ""),
                    new ChapterListAdapterData(getString(R.string.ch05), getString(R.string.c12ch05m), ""),
                    new ChapterListAdapterData(getString(R.string.ch06), getString(R.string.c12ch06m), ""),
                    new ChapterListAdapterData(getString(R.string.ch07), getString(R.string.c12ch07m), ""),
                    new ChapterListAdapterData(getString(R.string.ch08), getString(R.string.c12ch08m), ""),
                    new ChapterListAdapterData(getString(R.string.ch09), getString(R.string.c12ch09m), ""),*/
                    new ChapterListAdapterData("","Limits", "PLbu_fGT0MPstlAc71MAXF4plHQNRlVUMh"),
                    new ChapterListAdapterData("","Continuity", "PLbu_fGT0MPstMabOPghDPjT7GcvJsoDtL"),
                    new ChapterListAdapterData("","Differential Equation", "PLbu_fGT0MPsu7EmMCRdn4hyvoKMTlH5pw"),
                    new ChapterListAdapterData("","Methods of Differentiation", "PLbu_fGT0MPstKlTc-qQhEmLxyivwmZjCg"),
                    new ChapterListAdapterData("","Differentiability", "PLbu_fGT0MPsurR60pClS5PkdYU0wpyhF2"),
                    new ChapterListAdapterData("","Application of Derivatives", "PLbu_fGT0MPsu7szCnbhCMVB0LJpEJhaaM"),
                    new ChapterListAdapterData("","Indefinite Integration", "PLbu_fGT0MPsvrHt0mC_3gWLsKiOq4yC8G"),
                    new ChapterListAdapterData("","Definite Integration", "PLbu_fGT0MPssSPHWk1900CCrLWi_u6cGl"),
                    new ChapterListAdapterData("","Area Under Curve", "PLbu_fGT0MPssvCsc8lHB9x9IrRF7fLxkO"),
                    new ChapterListAdapterData(getString(R.string.ch10), getString(R.string.c12ch10m), "PLbu_fGT0MPsvj-vBNsKMtrvwLEGdLNjzl"),
                    new ChapterListAdapterData(getString(R.string.ch11), getString(R.string.c12ch11m), "PLbu_fGT0MPsuIMX8r6Gcjj9Y86Y49yeuJ"),
                    new ChapterListAdapterData(getString(R.string.ch12), getString(R.string.c12ch12m), ""),
                    new ChapterListAdapterData(getString(R.string.ch13), getString(R.string.c12ch13m), "PLbu_fGT0MPsvA6Btn3bw_as9d2VRUAZGe"),
                    new ChapterListAdapterData(getString(R.string.ch14),"Solutions of Triangle", "PLbu_fGT0MPstcXuOZhOiuEo3TAKbjgNUA"),

            };
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_chapter);
            ChapterAdapter adapter = new ChapterAdapter(myListData);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(ChapterActivity.this));
            recyclerView.setAdapter(adapter);
        }


        //Vedantu JEE   Physics Class 11
     /*   if (classData == 03.1101) {
            ChapterListAdapterData[] myListData = new ChapterListAdapterData[]{
                   // new ChapterListAdapterData(getString(R.string.ch01), getString(R.string.c11ch01p), ""),
                    //new ChapterListAdapterData(getString(R.string.ch02), getString(R.string.c11ch02p), ""),
                    new ChapterListAdapterData(getString(R.string.ch01),"Vectors","PLCtUyOrCJbxwWHRwd3aKdwUFqufWlnoBF"),
                    new ChapterListAdapterData(getString(R.string.ch03),"Relative Motion", "PLCtUyOrCJbxx1halJxN7sg0kW8uK_cMiN"),
                    new ChapterListAdapterData(getString(R.string.ch04), getString(R.string.c11ch04p), "PLCtUyOrCJbxwGaLNebjqbVu4yf-rC1TPX"),
                    new ChapterListAdapterData(getString(R.string.ch05), getString(R.string.c11ch05p), "PLCtUyOrCJbxzKx-Chuw4-J9jMJEOcJ7oW"),
                    new ChapterListAdapterData(getString(R.string.ch06), getString(R.string.c11ch06p), "PLCtUyOrCJbxwEPItyNjKLGZ4aRmqykkz7"),
                   /* new ChapterListAdapterData(getString(R.string.ch07), getString(R.string.c11ch07p), ""),
                    new ChapterListAdapterData(getString(R.string.ch08), getString(R.string.c11ch08p), ""),
                    new ChapterListAdapterData(getString(R.string.ch09), getString(R.string.c11ch09p), ""),
                    new ChapterListAdapterData(getString(R.string.ch10), getString(R.string.c11ch10p), ""),
                    new ChapterListAdapterData(getString(R.string.ch11), getString(R.string.c11ch11p), ""),
                    new ChapterListAdapterData(getString(R.string.ch12), getString(R.string.c11ch12p), ""),
                    new ChapterListAdapterData(getString(R.string.ch13), getString(R.string.c11ch13p), ""),
                    new ChapterListAdapterData(getString(R.string.ch14), getString(R.string.c11ch14p), ""),
                    new ChapterListAdapterData(getString(R.string.ch15), getString(R.string.c11ch15p), ""),*/
          /*  } ;
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_chapter);
            ChapterAdapter adapter = new ChapterAdapter(myListData);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(ChapterActivity.this));
            recyclerView.setAdapter(adapter);
        }
        //Chemistry Class 11 Vedantu
        if (classData == 03.1102) {
            ChapterListAdapterData[] myListData = new ChapterListAdapterData[]{
                    new ChapterListAdapterData(getString(R.string.ch01), getString(R.string.c11ch01c), ""),
                    new ChapterListAdapterData(getString(R.string.ch02), getString(R.string.c11ch02c), ""),
                    new ChapterListAdapterData(getString(R.string.ch03), getString(R.string.c11ch03c), ""),
                    new ChapterListAdapterData(getString(R.string.ch04), getString(R.string.c11ch04c), ""),
                    new ChapterListAdapterData(getString(R.string.ch05), getString(R.string.c11ch05c), ""),
                    new ChapterListAdapterData(getString(R.string.ch06), getString(R.string.c11ch06c), ""),
                    new ChapterListAdapterData(getString(R.string.ch07), getString(R.string.c11ch07c), ""),
                    new ChapterListAdapterData(getString(R.string.ch08), getString(R.string.c11ch08c), ""),
                    new ChapterListAdapterData(getString(R.string.ch09), getString(R.string.c11ch09c), ""),
                    new ChapterListAdapterData(getString(R.string.ch10), getString(R.string.c11ch10c), ""),
                    new ChapterListAdapterData(getString(R.string.ch11), getString(R.string.c11ch11c), ""),
                    new ChapterListAdapterData(getString(R.string.ch12), getString(R.string.c11ch12c), ""),
                    new ChapterListAdapterData(getString(R.string.ch13), getString(R.string.c11ch13c), ""),
                    new ChapterListAdapterData(getString(R.string.ch14), getString(R.string.c11ch14c), ""),
            } ;
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_chapter);
            ChapterAdapter adapter = new ChapterAdapter(myListData);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(ChapterActivity.this));
            recyclerView.setAdapter(adapter);
        }

        //Class 11 Maths Vedantu
        if (classData == 03.1103) {
            ChapterListAdapterData[] myListData = new ChapterListAdapterData[]{
                    new ChapterListAdapterData(getString(R.string.ch01), getString(R.string.c11ch01m), ""),
                    new ChapterListAdapterData(getString(R.string.ch02), getString(R.string.c11ch02m), ""),
                    new ChapterListAdapterData(getString(R.string.ch03), getString(R.string.c11ch03m), ""),
                    new ChapterListAdapterData(getString(R.string.ch04), getString(R.string.c11ch04m), ""),
                    new ChapterListAdapterData(getString(R.string.ch05), getString(R.string.c11ch05m), ""),
                    new ChapterListAdapterData(getString(R.string.ch06), getString(R.string.c11ch06m), ""),
                    new ChapterListAdapterData(getString(R.string.ch07), getString(R.string.c11ch07m), ""),
                    new ChapterListAdapterData(getString(R.string.ch08), getString(R.string.c11ch08m), ""),
                    new ChapterListAdapterData(getString(R.string.ch09), getString(R.string.c11ch09m), ""),
                    new ChapterListAdapterData(getString(R.string.ch10), getString(R.string.c11ch10m), ""),
                    new ChapterListAdapterData(getString(R.string.ch11), getString(R.string.c11ch11m), ""),
                    new ChapterListAdapterData(getString(R.string.ch12), getString(R.string.c11ch12m), ""),
                    new ChapterListAdapterData(getString(R.string.ch13), getString(R.string.c11ch13m), ""),
                    new ChapterListAdapterData(getString(R.string.ch14), getString(R.string.c11ch14m), ""),
                    new ChapterListAdapterData(getString(R.string.ch15), getString(R.string.c11ch15m), ""),
                    new ChapterListAdapterData(getString(R.string.ch16), getString(R.string.c11ch16m), ""),
            } ;
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_chapter);
            ChapterAdapter adapter = new ChapterAdapter(myListData);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(ChapterActivity.this));
            recyclerView.setAdapter(adapter);
        }
        //Vedantu Physics Class 12
        if(classData==03.1201){
            ChapterListAdapterData[] myListData = new ChapterListAdapterData[]{

                    new ChapterListAdapterData(getString(R.string.ch01), getString(R.string.c12ch01p), "PLCtUyOrCJbxxJ_DKFJujsairsdoTIwgp8"),
                    new ChapterListAdapterData(getString(R.string.ch02), getString(R.string.c12ch02p), "PLCtUyOrCJbxzHWqii91Wyp0f-Ex3XhONY"),
                    new ChapterListAdapterData(getString(R.string.ch03), getString(R.string.c12ch03p), "PLCtUyOrCJbxz29yxAg1KLJp6jl36W3shX"),
                    new ChapterListAdapterData(getString(R.string.ch04), getString(R.string.c12ch04p), "PLCtUyOrCJbxyToBWSh8MYFeRY9Ck2uuyr"),
                    new ChapterListAdapterData(getString(R.string.ch05), getString(R.string.c12ch05p), "PLCtUyOrCJbxzlhN-_QjQVoUK2q1iiP0L_"),
                    new ChapterListAdapterData(getString(R.string.ch06), getString(R.string.c12ch06p), "PLCtUyOrCJbxzK_-tXXA7wJ4Z4mZfYdwv1"),
                    new ChapterListAdapterData(getString(R.string.ch07), getString(R.string.c12ch07p), "PLCtUyOrCJbxxkGr0ttItNH9Eql3rC_Dpy"),
                    //new ChapterListAdapterData(getString(R.string.ch08), getString(R.string.c12ch08p), ""),
                    //new ChapterListAdapterData(getString(R.string.ch09), getString(R.string.c12ch09p), ""),
                    new ChapterListAdapterData(getString(R.string.ch10), getString(R.string.c12ch10p), "PLCtUyOrCJbxyWSkctJLYwbrgtQAmVamXn"),
                   /* new ChapterListAdapterData(getString(R.string.ch11), getString(R.string.c12ch11p), ""),
                    new ChapterListAdapterData(getString(R.string.ch12), getString(R.string.c12ch12p), ""),
                    new ChapterListAdapterData(getString(R.string.ch13), getString(R.string.c12ch13p), ""),
                    new ChapterListAdapterData(getString(R.string.ch14), getString(R.string.c12ch14p), ""),
                    new ChapterListAdapterData(getString(R.string.ch15), getString(R.string.c12ch15p), ""),*/

          //  };
         /*   RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_chapter);
            ChapterAdapter adapter = new ChapterAdapter(myListData);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(ChapterActivity.this));
            recyclerView.setAdapter(adapter);
        }

        //Class 12 Chemistry Vedantu
        if (classData == 03.1202) {
            ChapterListAdapterData[] myListData = new ChapterListAdapterData[]{

                    new ChapterListAdapterData(getString(R.string.ch01), getString(R.string.c12ch01c), ""),
                    new ChapterListAdapterData(getString(R.string.ch02), getString(R.string.c12ch02c), ""),
                    new ChapterListAdapterData(getString(R.string.ch03), getString(R.string.c12ch03c), ""),
                    new ChapterListAdapterData(getString(R.string.ch04), getString(R.string.c12ch04c), ""),
                    new ChapterListAdapterData(getString(R.string.ch05), getString(R.string.c12ch05c), ""),
                    new ChapterListAdapterData(getString(R.string.ch06), getString(R.string.c12ch06c), ""),
                    new ChapterListAdapterData(getString(R.string.ch07), getString(R.string.c12ch07c), ""),
                    new ChapterListAdapterData(getString(R.string.ch08), getString(R.string.c12ch08c), ""),
                    new ChapterListAdapterData(getString(R.string.ch09), getString(R.string.c12ch09c), ""),
                    new ChapterListAdapterData(getString(R.string.ch10), getString(R.string.c12ch10c), ""),
                    new ChapterListAdapterData(getString(R.string.ch11), getString(R.string.c12ch11c), ""),
                    new ChapterListAdapterData(getString(R.string.ch12), getString(R.string.c12ch12c), ""),
                    new ChapterListAdapterData(getString(R.string.ch13), getString(R.string.c12ch13c), ""),
                    new ChapterListAdapterData(getString(R.string.ch14), getString(R.string.c12ch14c), ""),
                    new ChapterListAdapterData(getString(R.string.ch15), getString(R.string.c12ch15c), ""),
                    new ChapterListAdapterData(getString(R.string.ch16), getString(R.string.c12ch16c), ""),

            };
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_chapter);
            ChapterAdapter adapter = new ChapterAdapter(myListData);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(ChapterActivity.this));
            recyclerView.setAdapter(adapter);
        }
        //Class 12 Maths Vedantu
        if (classData == 03.1203) {
            ChapterListAdapterData[] myListData = new ChapterListAdapterData[]{

                    new ChapterListAdapterData(getString(R.string.ch01), getString(R.string.c12ch01p), ""),
                    new ChapterListAdapterData(getString(R.string.ch02), getString(R.string.c12ch02p), ""),
                    new ChapterListAdapterData(getString(R.string.ch03), getString(R.string.c12ch03p), ""),
                    new ChapterListAdapterData(getString(R.string.ch04), getString(R.string.c12ch04p), ""),
                    new ChapterListAdapterData(getString(R.string.ch05), getString(R.string.c12ch05p), ""),
                    new ChapterListAdapterData(getString(R.string.ch06), getString(R.string.c12ch06p), ""),
                    new ChapterListAdapterData(getString(R.string.ch07), getString(R.string.c12ch07p), ""),
                    new ChapterListAdapterData(getString(R.string.ch08), getString(R.string.c12ch08p), ""),
                    new ChapterListAdapterData(getString(R.string.ch09), getString(R.string.c12ch09p), ""),
                    new ChapterListAdapterData(getString(R.string.ch10), getString(R.string.c12ch10p), ""),
                    new ChapterListAdapterData(getString(R.string.ch11), getString(R.string.c12ch11p), ""),
                    new ChapterListAdapterData(getString(R.string.ch12), getString(R.string.c12ch12p), ""),
                    new ChapterListAdapterData(getString(R.string.ch13), getString(R.string.c12ch13p), ""),
                    new ChapterListAdapterData(getString(R.string.ch14), getString(R.string.c12ch14p), ""),
                    new ChapterListAdapterData(getString(R.string.ch15), getString(R.string.c12ch15p), ""),

            };
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_chapter);
            ChapterAdapter adapter = new ChapterAdapter(myListData);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(ChapterActivity.this));
            recyclerView.setAdapter(adapter);
        }*/


        //Physics Galaxy   Physics Class 11
        if (classData == 04.1101) {
            ChapterListAdapterData[] myListData = new ChapterListAdapterData[]{
                    //new ChapterListAdapterData(getString(R.string.ch01), getString(R.string.c11ch01p), ""),
                   // new ChapterListAdapterData(getString(R.string.ch02), getString(R.string.c11ch02p), ""),
                    new ChapterListAdapterData(getString(R.string.ch03), getString(R.string.c11ch03p), "PLYVDsiuOZP5qJbEmuJy30qstS8fDQYXFQ"),
                    new ChapterListAdapterData(getString(R.string.ch04), getString(R.string.c11ch04p), "PLYVDsiuOZP5rVbTWIWmdw7ZLgrpL5HUI2"),
                    new ChapterListAdapterData(getString(R.string.ch04),"Relative Motion","PLYVDsiuOZP5pxfMHOVx-ziJnTziCQ5PTR"),
                    new ChapterListAdapterData(getString(R.string.ch05),"Constrained Motion","PLYVDsiuOZP5oFc3xG1OgB_zGxxjuNbM95"),
                    new ChapterListAdapterData(getString(R.string.ch05), getString(R.string.c11ch05p), "PLYVDsiuOZP5o87acfiquV9CMzi-rfIdQk"),
                    new ChapterListAdapterData(getString(R.string.ch05),"Friction","PLYVDsiuOZP5oAa5_844mrhYq65crmya3l"),
                    new ChapterListAdapterData(getString(R.string.ch06), getString(R.string.c11ch06p), "PLYVDsiuOZP5qOhevtD5Ikd3R6gy6wsMaW"),
                    new ChapterListAdapterData(getString(R.string.ch07), getString(R.string.c11ch07p), "PLYVDsiuOZP5ojdEY1cWhAKylxiAhv60ec"),
                    new ChapterListAdapterData(getString(R.string.ch07),"System Of Particles I","PLYVDsiuOZP5pNzoB-e4ugTz96dGpspdDI"),
                    new ChapterListAdapterData(getString(R.string.ch07),"System Of Particles II","PLYVDsiuOZP5rVJoYJF3nnpZwLIa504fGf"),
                    new ChapterListAdapterData(getString(R.string.ch07),"Rigid Body Dynamics","PLYVDsiuOZP5rPQQlxpC_gOdBtdZ-p1zcO"),
                    new ChapterListAdapterData(getString(R.string.ch08), getString(R.string.c11ch08p), "PLYVDsiuOZP5p36rWJbRL8xJrncratOW3r"),
                    new ChapterListAdapterData(getString(R.string.ch08),"Satellite Motion Gravitation","PLYVDsiuOZP5pvfZrqeGfjLO5V33vfz0FG"),
                    new ChapterListAdapterData(getString(R.string.ch09), getString(R.string.c11ch09p)+"(Elasticity)", "PLYVDsiuOZP5oV8wwEEI7TuP4OcRSmndy_"),
                    new ChapterListAdapterData(getString(R.string.ch10), getString(R.string.c11ch10p)+"(Static)", "PLYVDsiuOZP5pZ6_3X9KICjOGkpWeaKxZ5"),
                    new ChapterListAdapterData(getString(R.string.ch10), getString(R.string.c11ch10p)+"(Dynamics)", "PLYVDsiuOZP5pSKXBU4w43GCZQi0FfM2u9"),
                    new ChapterListAdapterData(getString(R.string.ch10), getString(R.string.c11ch10p)+"(Surface Tension)", "PLYVDsiuOZP5oIJ3dfMoWnQ5FRIh_3JfPG"),
                    new ChapterListAdapterData(getString(R.string.ch10), getString(R.string.c11ch10p)+"(Viscosity)", "PLYVDsiuOZP5r08erkeAITDIGrjNbNbBFB"),
                    new ChapterListAdapterData(getString(R.string.ch11), getString(R.string.c11ch11p), "PLYVDsiuOZP5oPYhq8fJK3M8t5Nx9NMdkd"),
                    new ChapterListAdapterData(getString(R.string.ch11),"Calorimetry","PLYVDsiuOZP5q_CZGbRRSm4j2aZ_XvI7al"),
                    new ChapterListAdapterData(getString(R.string.ch12), getString(R.string.c11ch12p), "PLYVDsiuOZP5oiIFdST1_g0B9AQYC07xy9"),
                    new ChapterListAdapterData(getString(R.string.ch12),"Heat Transfer","PLYVDsiuOZP5pojfQZjNHI6_Tf4icfXFwo"),
                    new ChapterListAdapterData(getString(R.string.ch13), getString(R.string.c11ch13p), "PLYVDsiuOZP5oHr3ad8oorBy2CP-B0ru4Z"),
                    new ChapterListAdapterData(getString(R.string.ch14), getString(R.string.c11ch14p) +"(SHM)", "PLYVDsiuOZP5qDdR5Tf1M3iwkvBBFubwq_"),
                    new ChapterListAdapterData(getString(R.string.ch15), getString(R.string.c11ch15p), "PLYVDsiuOZP5rqEGbfx8n5Bhd1q9cC-aq"),
                    new ChapterListAdapterData(getString(R.string.ch15), getString(R.string.c11ch15p) +"(Interference)", "PLYVDsiuOZP5rNwScUI9XMWgNIG-D8Nssr"),
                    new ChapterListAdapterData(getString(R.string.ch15), getString(R.string.c11ch15p) +"(Stationary Waves & Beats)", "PLYVDsiuOZP5pgg1RzhBJCKmqhWnWTtCzu"),
                    new ChapterListAdapterData(getString(R.string.ch15), getString(R.string.c11ch15p) +"(Doppler Effect)", "PLYVDsiuOZP5rRO-1gICUhd76J0TbkKPAw"),
            } ;
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_chapter);
            ChapterAdapter adapter = new ChapterAdapter(myListData);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(ChapterActivity.this));
            recyclerView.setAdapter(adapter);
        }

        //Physics Galaxy  Physics Advance Class 11
        if (classData == 04.1103) {
            ChapterListAdapterData[] myListData = new ChapterListAdapterData[]{
                   // new ChapterListAdapterData(getString(R.string.ch01), getString(R.string.c11ch01p), ""),
                    //new ChapterListAdapterData(getString(R.string.ch02), getString(R.string.c11ch02p), ""),
                   // new ChapterListAdapterData(getString(R.string.ch03), getString(R.string.c11ch03p), ""),
                    //new ChapterListAdapterData(getString(R.string.ch04), getString(R.string.c11ch04p), ""),
                    new ChapterListAdapterData(getString(R.string.ch03)+getString(R.string.ch04),"Kinematics", "PLYVDsiuOZP5oNMA20ENGpMZn205nKjp6t"),
                    new ChapterListAdapterData(getString(R.string.ch05), getString(R.string.c11ch05p), "PLYVDsiuOZP5p1wqNBMFQPeYA1rV26WVU2"),
                    new ChapterListAdapterData(getString(R.string.ch06), getString(R.string.c11ch06p), "PLYVDsiuOZP5qClrxbX_gQIRWbbVUc81-a"),
                    new ChapterListAdapterData(getString(R.string.ch07), getString(R.string.c11ch07p), "PLYVDsiuOZP5r2VyNRnxIcihxIErobLnJH"),
                    new ChapterListAdapterData(getString(R.string.ch07), "System of Particles", "PLYVDsiuOZP5pBiXzoAFP2KVIZorRGdYZ2"),
                    new ChapterListAdapterData(getString(R.string.ch07), "Rigid Body Dynamics", "PLYVDsiuOZP5rYYDPBw5GEM5iq3aA9FoYm"),
                    new ChapterListAdapterData(getString(R.string.ch08), getString(R.string.c11ch08p), "PLYVDsiuOZP5pPR-c6OMwPaFB4jmcDOIya"),
                    new ChapterListAdapterData(getString(R.string.ch09), getString(R.string.c11ch09p), "PLYVDsiuOZP5rIsH_vq82f6oOskpSFfMmL"),
                    new ChapterListAdapterData(getString(R.string.ch10), getString(R.string.c11ch10p), "PLYVDsiuOZP5qmrouCi58e0fbr2_x7__TY"),
                    new ChapterListAdapterData(getString(R.string.ch11), getString(R.string.c11ch11p), "PLYVDsiuOZP5ojPF7PTwzn-6TDnFs3aSNC"),
                    new ChapterListAdapterData(getString(R.string.ch12), getString(R.string.c11ch12p)+" "+getString(R.string.c11ch13p), "PLYVDsiuOZP5q94KNzbdwaM1Pg-oR9bKYJ"),
                    new ChapterListAdapterData(getString(R.string.ch12),"Heat Transfer","PLYVDsiuOZP5otIssIBcggs5gd-t6nWQsF"),
                    //new ChapterListAdapterData(getString(R.string.ch13), getString(R.string.c11ch13p), ""),
                    new ChapterListAdapterData(getString(R.string.ch14), getString(R.string.c11ch14p), "PLYVDsiuOZP5oK53QqLAVxj5gCPpyuK8-b"),
                    new ChapterListAdapterData(getString(R.string.ch15), getString(R.string.c11ch15p), "PLYVDsiuOZP5q0u0yR03SNdhswS2PmwT02"),
            } ;
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_chapter);
            ChapterAdapter adapter = new ChapterAdapter(myListData);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(ChapterActivity.this));
            recyclerView.setAdapter(adapter);
        }
        //Physics Galaxy Physics Class 12
        if(classData==04.1201){
            ChapterListAdapterData[] myListData = new ChapterListAdapterData[]{
                    new ChapterListAdapterData(getString(R.string.ch01), "Electric Force and Electric Field", "PLYVDsiuOZP5q1zluvt1QzvSr8ZhVFSxXC"),
                    new ChapterListAdapterData(getString(R.string.ch01), "Electric Potential and Dipole", "PLYVDsiuOZP5oFZy9pRC0Js6AR4CQwd0TA"),
                    new ChapterListAdapterData(getString(R.string.ch01), "Electric Flux and Gauss Law", "PLYVDsiuOZP5ryU-IY_OGQmaYe7hj5WaXf"),
                    new ChapterListAdapterData(getString(R.string.ch01),"Conductors and Dielectrics","PLYVDsiuOZP5p1dAoyw-cq5Sho6jKzRO68"),
                    new ChapterListAdapterData(getString(R.string.ch01),"Electrostatic Energy and Electric Pressure","PLYVDsiuOZP5pAhz46m8KxKQGyHKU8Xq24"),
                    new ChapterListAdapterData(getString(R.string.ch02), getString(R.string.c12ch02p), "PLYVDsiuOZP5rYBwzytQnnLZ2PJg9TTJWV"),
                    new ChapterListAdapterData(getString(R.string.ch03), getString(R.string.c12ch03p), "PLYVDsiuOZP5pNp6mKyhYm_dyKhQa89d-U"),
                    new ChapterListAdapterData(getString(R.string.ch03),"Thermal Effects of Electric Current","PLYVDsiuOZP5qXPy3IJcqyu3dO_0lMB_Vu"),
                    new ChapterListAdapterData(getString(R.string.ch03),"Electrical Measuring Instrument","PLYVDsiuOZP5pSLMHtzNoz8Cgkah083R3k"),
                    new ChapterListAdapterData(getString(R.string.ch04),"Magnetic Effect of Current", "PLYVDsiuOZP5otvXTVJUzf4leXA4drAAVP"),
                    new ChapterListAdapterData(getString(R.string.ch04),"Magnetic Force on Moving Charges","PLYVDsiuOZP5riuB-SQjeHsZ3nvky5rzFq"),
                    new ChapterListAdapterData(getString(R.string.ch05), getString(R.string.c12ch05p), "PLYVDsiuOZP5oa3Xt30jyJf8TgjRdE_Ffo"),
                    new ChapterListAdapterData(getString(R.string.ch05),"Classical And Terrestrial Magnetism","PLYVDsiuOZP5ophSnSLgD7GoYz6Zoyieka"),
                    new ChapterListAdapterData(getString(R.string.ch06), getString(R.string.c12ch06p), "PLYVDsiuOZP5oX_utM6U1WELiA4lAhmd07"),
                    new ChapterListAdapterData(getString(R.string.ch06),"Self and Mutual Inductance","PLYVDsiuOZP5pKJ6B0q_hxAzXgzSjpaqum"),
                    new ChapterListAdapterData(getString(R.string.ch07), getString(R.string.c12ch07p), "PLYVDsiuOZP5puf3ODDtJeoKVcw_nn4sHe"),
                    new ChapterListAdapterData(getString(R.string.ch08), getString(R.string.c12ch08p), "PLYVDsiuOZP5ro6oNQNgb4lEiYUQf6O5ix"),
                    new ChapterListAdapterData(getString(R.string.ch09), "Optics"+"(Reflection of Light)", "PLYVDsiuOZP5pDolBtG83KK5GNiFP2Wdwo"),
                    new ChapterListAdapterData(getString(R.string.ch09), "Optics"+"(Refraction of Light)", "PLYVDsiuOZP5o58QuOJsZ6XNazPba5y9Vk"),
                    new ChapterListAdapterData(getString(R.string.ch09), "Optics"+"(Thin Lenses)", "PLYVDsiuOZP5oARIu2zma1w7BbjekSXULp"),
                    new ChapterListAdapterData(getString(R.string.ch09), "Optics"+"(Dispersion of Light)", "PLYVDsiuOZP5p1efgLGHU_fT3BnOn2PeT9"),
                    new ChapterListAdapterData(getString(R.string.ch09), "Optics"+"(Interference of Light)", "PLYVDsiuOZP5pnPMEJ_pCBTHmYZkFgzZpZ"),
                    new ChapterListAdapterData(getString(R.string.ch09), "Optics"+"(Diffraction of Light)", "PLYVDsiuOZP5oSA1adbrafXl5G-_ZEyUg8"),
                    new ChapterListAdapterData(getString(R.string.ch09), "Optics"+"(Polarization of Light)", "PLYVDsiuOZP5qn4WTpMvNxh71A5m2euYFH"),
                    new ChapterListAdapterData(getString(R.string.ch09), "Optics"+"(Photometry)", "PLYVDsiuOZP5pduTwG-xUqCf73yEwR-G9Q"),
                    new ChapterListAdapterData(getString(R.string.ch09), "Optics"+"(Optical Instruments)", "PLYVDsiuOZP5oCFyv-NjoVzilZz-aHgwwA"),
                    new ChapterListAdapterData(getString(R.string.ch11),"PhotoElectric Effect","PLYVDsiuOZP5pStNOS-TnVtD8dro1IDpI4"),
                    new ChapterListAdapterData(getString(R.string.ch12),"Wave Particle Duality","PLYVDsiuOZP5rOxjiDU81nW07oYApW60IQ"),
                    new ChapterListAdapterData(getString(R.string.ch13),"X-Rays","PLYVDsiuOZP5ruG0Iy2QZJLMB48-j0fDT3"),
                    new ChapterListAdapterData(getString(R.string.ch13),"Nuclear Structure and Reactivity","PLYVDsiuOZP5oDZNTKTHdDXk2yeDd5USgr"),
                    new ChapterListAdapterData(getString(R.string.ch14), getString(R.string.c12ch14p)+"(Basics and its Types)", "PLYVDsiuOZP5rNtTnGCeR-qMiWsnY3Z9c0"),
                    new ChapterListAdapterData(getString(R.string.ch14), getString(R.string.c12ch14p)+"(PN Junction)", "PLYVDsiuOZP5reV1N7Ezy_E8Fv3HXkcCCQ"),
                    new ChapterListAdapterData(getString(R.string.ch14), getString(R.string.c12ch14p)+"(Transistors)", "PLYVDsiuOZP5pIrz7YXgTavrdbioCZDBAT"),
                    new ChapterListAdapterData(getString(R.string.ch14), getString(R.string.c12ch14p)+"(Logic Gates)", "PLYVDsiuOZP5pWc0SxrnaUVHaMT06mdo4a"),
                    new ChapterListAdapterData(getString(R.string.ch15), getString(R.string.c12ch15p)+"()", "PLYVDsiuOZP5rO0KbnU2gyHfmlRr996DFo"),
                    new ChapterListAdapterData(getString(R.string.ch15), getString(R.string.c12ch15p)+"(Modulation and Demodulation)", "PLYVDsiuOZP5rzIZ99BsayQWooqwjP5PZ2"),

            };
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_chapter);
            ChapterAdapter adapter = new ChapterAdapter(myListData);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(ChapterActivity.this));
            recyclerView.setAdapter(adapter);
        }
        //Physics Galaxy Physics Advance Class 12
        if(classData==04.1203){
            ChapterListAdapterData[] myListData = new ChapterListAdapterData[]{

                    new ChapterListAdapterData(getString(R.string.ch01), getString(R.string.c12ch01p), "PLYVDsiuOZP5onjQVfPF07-xEU7wiSywJc"),
                    new ChapterListAdapterData(getString(R.string.ch02), getString(R.string.c12ch02p), "PLYVDsiuOZP5px9BfU3X8PPOXqfUxIr1al"),
                    new ChapterListAdapterData(getString(R.string.ch03), getString(R.string.c12ch03p), "PLYVDsiuOZP5pFmAoduzQy3sxwcki-D-BH"),
                    new ChapterListAdapterData(getString(R.string.ch04), getString(R.string.c12ch04p), "LYVDsiuOZP5ptBNrpIa6yXIaBId0yHsuL"),
                    new ChapterListAdapterData(getString(R.string.ch09), getString(R.string.c12ch09p), "PLYVDsiuOZP5pPq2iq_laoefweIqDYpDyo"),
                    new ChapterListAdapterData(getString(R.string.ch10), getString(R.string.c12ch10p), "PLYVDsiuOZP5om-Dr8S1-10KrMa4vH738M"),
                    new ChapterListAdapterData(getString(R.string.ch11), getString(R.string.c12ch11p), ""),
                    new ChapterListAdapterData(getString(R.string.ch12), getString(R.string.c12ch12p)+"Nuclear Physics", "PLYVDsiuOZP5rqs4W2gN_lnAXL3AcGc5O0"),

            };
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_chapter);
            ChapterAdapter adapter = new ChapterAdapter(myListData);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(ChapterActivity.this));
            recyclerView.setAdapter(adapter);
        }
    }

}
