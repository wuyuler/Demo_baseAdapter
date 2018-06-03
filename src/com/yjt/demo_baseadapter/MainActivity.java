package com.yjt.demo_baseadapter;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.ListView;
import entity.Note;
import utils.NoteAdapter;

public class MainActivity extends Activity {
	//定义数据
	private  List<Note> mData;
	private ListView lv_note;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);//隐藏bar
		setContentView(R.layout.activity_main);
		
		
		LayoutInflater inflater =getLayoutInflater();
		initShow();
		initDate();
		NoteAdapter adapter=new NoteAdapter(mData, inflater);
		lv_note.setAdapter(adapter);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	private void initShow(){
		lv_note = (ListView)findViewById(R.id.lv_note);
	}
	private void initDate(){
		mData=new ArrayList<Note>();
		Note note1=new Note("笔记一","2018/6/3","这是我第一次写博客，写的不好还请大家多多见谅哦，希望以后能和大家在一起相互学习，共同成长。");
		Note note2=new Note("笔记二","2018/6/3","这是我第一次写博客，写的不好还请大家多多见谅哦，希望以后能和大家在一起相互学习，共同成长。");
		Note note3=new Note("笔记三","2018/6/3","这是我第一次写博客，写的不好还请大家多多见谅哦，希望以后能和大家在一起相互学习，共同成长。");
		mData.add(note1);
		mData.add(note2);
		mData.add(note3);
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
