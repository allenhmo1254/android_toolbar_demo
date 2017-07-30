package com.example.zhongjie3.toolbardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Toast;

public class ZhiHuActivity extends AppCompatActivity implements Toolbar.OnMenuItemClickListener {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_zhi_hu);

        initView();
    }

    private void initView()
    {
        toolbar = (Toolbar)findViewById(R.id.zhihuToolbar);
        toolbar.setNavigationIcon(R.mipmap.ic_drawer_home);
        toolbar.setTitle("首页");
        toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));
        toolbar.inflateMenu(R.menu.menu_zhihu);
        toolbar.setOnMenuItemClickListener(this);
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        int menuItemId = item.getItemId();
        switch (menuItemId)
        {
            case R.id.search_item:
                Toast.makeText(ZhiHuActivity.this, R.string.search, Toast.LENGTH_SHORT).show();
                break;
            case R.id.notify_item:
                Toast.makeText(ZhiHuActivity.this, R.string.notify, Toast.LENGTH_SHORT).show();
                break;
            case R.id.setting_item:
                Toast.makeText(ZhiHuActivity.this, R.string.setting, Toast.LENGTH_SHORT).show();
                break;
            case R.id.about_item:
                Toast.makeText(ZhiHuActivity.this, R.string.about, Toast.LENGTH_SHORT).show();
                break;
        }

        return true;
    }
}
