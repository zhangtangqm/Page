package cn.edu.swufe.page;
//管理viewpager和Fragment的关系

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPageAdapter extends FragmentPagerAdapter {

    private String[] title=new String[]{"First","Second","Third"};
    public MyPageAdapter(FragmentManager manager){
        super(manager);
    }
    @Override
    public Fragment getItem(int position) {
        //返回需要管理的Fragment对象
        if(position==0){
            return new FirstFragment();
        }else if(position==1){
            return new SecondFragment();
        }else{
            return new ThirdFragment();
        }

    }

public CharSequence getPageTitle(int position){
        return title[position];
}
    @Override
    public int getCount() {
        //返回当前需要管理的Fragment是多少个
        return 3;//一共有3个Fragment
    }
}
