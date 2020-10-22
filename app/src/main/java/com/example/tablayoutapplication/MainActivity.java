package com.example.tablayoutapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    static ArrayList<String> Lesson = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Lesson.add("Математическое моделирование");
        Lesson.add("Математический анализ");
        Lesson.add("Perl");
        Lesson.add("Какойто предмет");
        Lesson.add("Пусто");
        Lesson.add("Что-то");
        Lesson.add("DFGege");
        Lesson.add("dregerg");

        ViewPager viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new SampleFragmentPageAdapter(getSupportFragmentManager(),MainActivity.this));

        TabLayout tabLayout = findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    public static class GGManager {
        private static Context context;

        public static Context getContext() {
            return context;
        }

        public static void setContext(Context context) {
            GGManager.context = context;
        }
    }
}