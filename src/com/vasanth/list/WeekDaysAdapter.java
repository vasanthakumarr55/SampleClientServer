package com.vasanth.list;

import com.vasanth.list.R.string;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class WeekDaysAdapter extends BaseAdapter {

	private String[] weeks;
	private Context context;

	WeekDaysAdapter(String[] weekhgfrgjfv, Context context) {
		this.weeks = weekhgfrgjfv;
		this.context = context;

	}

	@Override
	public int getCount() {

		return weeks.length;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parentView) {

		if (convertView == null) {
			LayoutInflater inflater = LayoutInflater.from(this.context);
			convertView = inflater
					.inflate(R.layout.listviewinside, null, false);
			

		}
		TextView textView=(TextView) convertView.findViewById(R.id.textView1);
		textView.setText(this.weeks[position]);
		
		
		
		
		return convertView;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
