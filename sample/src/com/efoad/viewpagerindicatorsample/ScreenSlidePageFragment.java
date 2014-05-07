package com.efoad.viewpagerindicatorsample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ScreenSlidePageFragment extends Fragment {

	private int page;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Bundle arguments = getArguments();
		if (null != arguments && arguments.getInt("page", -1) != -1) {
			page = arguments.getInt("page");
		}
	} 
	
	@Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {
	        ViewGroup rootView = (ViewGroup) inflater.inflate(
	                R.layout.fragment_screen_slide_page, container, false);
	        ((TextView)rootView.findViewById(R.id.txt_number)).setText(""+page);

	        return rootView;
	    }
}
