package com.heeyjinny.sharedpreferencessettingview

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat

//PreferenceFragmentCompat 추상클래스를 상속받음
class SettingFragment: PreferenceFragmentCompat() {

    //onCreatePreferences() 메서드 오버라이드
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {

        //addpreferencesFromResource 호출하고
        //PreferenceScreen이 정의된 preference.xml 파일의 경로를 파라미터로 전달하면
        //설정 항목의 뷰가 자동으로 생성됨
        addPreferencesFromResource(R.xml.preferences)

    }

    //activity_main.xml 에 <fragment/> 화면을 추가하여 SettingFragment와 연결

}