/**
 * 
 */
package com.superman.fragment_test;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * <p>Title: com.superman.fragment_test.AlarmFragment.java</p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2001-2013 Newland SoftWare Company</p>
 *
 * <p>Company: Newland SoftWare Company</p>
 *
 * @author Lewis.Lynn
 *
 * @version 1.0 CreateTime：2014-3-8 下午11:23:24
 */

@SuppressLint("NewApi")
public class AlarmFragment extends Fragment{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View alarmView = (View)inflater.inflate(R.layout.alarm_layout, container, false);
		return alarmView;
	}
}
