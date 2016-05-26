package com.demo.xsl.text;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

public class VerticalScrollTextActivity extends Activity {


	VerticalScrollTextView mSampleView;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		mSampleView = (VerticalScrollTextView) findViewById(R.id.sampleView1);
		List lst=new ArrayList<Sentence>();
		for(int i=0;i<30;i++){
			if(i%2==0){
				Sentence sen=new Sentence(i,i+"、金球奖三甲揭晓 C罗梅西哈维入围 ");
				lst.add(i, sen);
			}else{
				Sentence sen=new Sentence(i,i+"、公牛欲用三大主力换魔兽？？？？");
				lst.add(i, sen);
			}
		}	
		//给View传递数据
		mSampleView.setList(lst);
		//更新View
		mSampleView.updateUI();		
	}	
}