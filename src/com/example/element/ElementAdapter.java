package com.example.element;

import java.util.List;

import com.yueyericardo.element.R;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ElementAdapter extends ArrayAdapter<Element> {
	private int resourceId;

	public ElementAdapter(Context context, int textViewResourceId,
			List<Element> objects) {
		super(context, textViewResourceId, objects);
		resourceId = textViewResourceId;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Element element = getItem(position);
		View view;
		ViewHolder viewHolder;
		if (convertView == null) {
			view = LayoutInflater.from(getContext()).inflate(resourceId, null);
			viewHolder = new ViewHolder();
			viewHolder.ElementName = (TextView) view
					.findViewById(R.id.element_name);
			viewHolder.ElementImage = (ImageView) view
					.findViewById(R.id.element_image);


			view.setTag(viewHolder);
		} else {
			view = convertView;
			viewHolder = (ViewHolder) view.getTag();
		}
		viewHolder.ElementName.setText(element.getName());

		viewHolder.ElementImage.setImageResource(element.getImageID());
		return view;
	}

	class ViewHolder {
		ImageView ElementImage;
		TextView ElementName;
	}
}
