package com.heeyjinny.sharedpreferencessettingview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.preference.PreferenceManager

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

        //생성한 preferences.xml 수정성


        //FIN
        //설정값 사용
        //XML 레이아웃을 조금 추가하면 쉽게 Preference 화면을 만들 수 있음

        //각각의 Preference를 설정하면 자동으로 옵션이 저장되고 저장된 옵션을 읽으려면 key 이용
        //PreferenceManager에서 getDefaultSharedPreferences로 SharedPreference 가져와 사용

        //저장된 데이터가 boolean인 경우 getBoolean(key, default)
        //초기값이 없는 경우 default로 설정한 것을 가져오게 됨
        //문자열의 경우 getString을 사용합니다. Int와 Long, Float도 모두 동일한 방식 사용

        //PreferenceManager를 통해 SharedPreference 가져와 shared에 저장
        val shared = PreferenceManager.getDefaultSharedPreferences(this)

        //키 값과 기본값 지정하여 현재 설정된 데이터 가져오기
        val checkboxValue = shared.getBoolean("key_add_shortcut",false)
        val switchValue = shared.getBoolean("key_switch_on", false)
        val name = shared.getString("key_edit_nam", "이름을 입력하세요")
        val selected = shared.getString("key_set_item", "목록을 선택하세요")

    }
}