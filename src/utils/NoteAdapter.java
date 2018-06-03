package utils;

import java.util.List;

import com.yjt.demo_baseadapter.R;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import entity.Note;

public class NoteAdapter extends BaseAdapter {

	
	private List<Note> mData;
	private LayoutInflater mInflater;
	
	public NoteAdapter(List<Note> mDate, LayoutInflater mInflater) {
		super();
		this.mData = mDate;
		this.mInflater = mInflater;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mData.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		
		View viewNote=mInflater.inflate(R.layout.itemforlistview, null);
		Note note = mData.get(position);
		TextView title = (TextView)viewNote.findViewById(R.id.tv_title);
		TextView date = (TextView)viewNote.findViewById(R.id.tv_date);
		TextView part = (TextView)viewNote.findViewById(R.id.tv_part);
		title.setText(note.getTitle());
		date.setText(note.getDate());
		String content = note.getContent();
		if(content.length()>20)
			part.setText(content.substring(0, 20));
		else part.setText(content);
		return viewNote;
	}

}
