package com.chauthai.swipereveallayoutdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.chauthai.swipereveallayout.SwipeRevealLayout;

public class MainActivity extends AppCompatActivity {

    private SwipeRevealLayout swipeRevealLayout1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        swipeRevealLayout1 = findViewById(R.id.swipe_layout_1);
        swipeRevealLayout1.setSwipeListener(new SwipeRevealLayout.SwipeListener() {
            @Override
            public void onClosed(SwipeRevealLayout view) {
                Toast.makeText(MainActivity.this, "Layout 1 onClosed", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onOpened(SwipeRevealLayout view) {
                Toast.makeText(MainActivity.this, "Layout 1 onOpened", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onSlide(SwipeRevealLayout view, float slideOffset) {
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_recycler_view:
                startActivity(new Intent(this, RecyclerDemoActivity.class));
                return true;

            case R.id.action_list_view:
                startActivity(new Intent(this, ListDemoActivity.class));
                return true;

            case R.id.action_grid_view:
                startActivity(new Intent(this, GridActivity.class));
                return true;
        }

        return false;
    }

    public void layoutOneOnClick(View v) {
        Toast.makeText(MainActivity.this, "Layout 1 clicked", Toast.LENGTH_SHORT).show();
        swipeRevealLayout1.close(true);
    }

    public void layoutTwoOnClick(View v) {
        Toast.makeText(MainActivity.this, "Layout 2 clicked", Toast.LENGTH_SHORT).show();
    }

    public void layoutThreeOnClick(View v) {
        Toast.makeText(MainActivity.this, "Layout 3 clicked", Toast.LENGTH_SHORT).show();
    }

    public void layoutFourOnClick(View v) {
        Toast.makeText(MainActivity.this, "Layout 4 clicked", Toast.LENGTH_SHORT).show();
    }

    public void moreOnClick(View v) {
        Toast.makeText(MainActivity.this, "More clicked", Toast.LENGTH_SHORT).show();
    }

    public void deleteOnClick(View v) {
        Toast.makeText(MainActivity.this, "Delete clicked", Toast.LENGTH_SHORT).show();
        swipeRevealLayout1.close(true);
    }

    public void archiveOnClick(View v) {
        Toast.makeText(MainActivity.this, "Archive clicked", Toast.LENGTH_SHORT).show();
    }

    public void helpOnClick(View v) {
        Toast.makeText(MainActivity.this, "Help clicked", Toast.LENGTH_SHORT).show();
    }

    public void searchOnClick(View v) {
        Toast.makeText(MainActivity.this, "Search clicked", Toast.LENGTH_SHORT).show();
    }

    public void starOnClick(View v) {
        Toast.makeText(MainActivity.this, "Star clicked", Toast.LENGTH_SHORT).show();
    }
}
