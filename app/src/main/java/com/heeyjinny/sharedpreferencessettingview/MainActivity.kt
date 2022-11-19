package com.heeyjinny.sharedpreferencessettingview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1
        //AndroidX Preference 사용을 위해서는 라이브러리 설치가 필요함
        //특정 라이브러리가 있어야만 프로그램이 동작하며 해당 라이브러리에 의존성이 있다고 함
        //build.gradle에 androidx.preference 의존성(dependency) 추가

        //2
        //XML로 설정 화면에서 사용할 화면 구조를 정의해두면
        //안드로이드가 정의된 XML의 구조를 분석해 화면을 그려줌
        //설정 화면에서 사용할 화면 구조 정의 하기

        //2-1
        //리소스 디렉터리 res폴더 안에 xml 디렉터리를 생성하고 그 안에 preferences.xml 생성하기
        //사용할 설정화면 구조 정의 시 생성하는 xml파일의 Root element는 PreferenceScreen 정의
        //디렉터리 res - 우클릭 - New - Android Resource FIle

        //File name : preferences
        //Resource Type : XML
        //Root element : PreferenceScreen (위 타입 지정하면 자동으로...)
        //Source set : main (위 타입 지정하면 자동으로...)
        //Directory name : xml (위 타입 지정하면 자동으로...)

        //생성한 preferences.xml 수정










    }
}