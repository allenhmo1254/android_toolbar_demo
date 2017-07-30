package com.example.zhongjie3.toolbardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Toast;

public class ToolBarActivity extends AppCompatActivity implements Toolbar.OnMenuItemClickListener {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_tool_bar);

        initView();
    }

    private void initView()
    {
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.mipmap.ic_drawer_home);
        toolbar.setLogo(R.mipmap.ic_launcher);
        toolbar.setTitle("Title");
        toolbar.setSubtitle("SubTitle");
        toolbar.inflateMenu(R.menu.menu_main);
        toolbar.setOnMenuItemClickListener(this);
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {

        int menuItemId = item.getItemId();
        switch (menuItemId)
        {
            case R.id.action_search:
                Toast.makeText(ToolBarActivity.this, "搜索", Toast.LENGTH_LONG).show();
                break;
            case R.id.action_setting:
                Toast.makeText(ToolBarActivity.this, "设置", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_other:
                Toast.makeText(ToolBarActivity.this, "其他", Toast.LENGTH_SHORT).show();
                break;
        }

        return true;
    }
}
