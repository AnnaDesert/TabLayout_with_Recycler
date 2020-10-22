package com.example.tablayoutapplication;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SampleFragmentPageAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 6;
    private String tabTitles[] = new String[] { "Пн", "Вт", "Ср", "Чт", "Пт", "Сб"};
    private Context context;

    public SampleFragmentPageAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return PageFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override public CharSequence getPageTitle(int position) {
        // генерируем заголовок в зависимости от позиции
        return tabTitles[position];
    }
}
