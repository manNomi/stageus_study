package com.example.stageusgen8

import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class ContentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.content_activity)   // 레이아웃을 지정해주는 명령어

        val linearLayout = findViewById<LinearLayout>(R.id.LinearLayout) // 동적 view를 넣어줄 부모 가져오기

        // 데이터 베이스 통신 - DB에서 가져왔다 가정

        val dataList = arrayOf(
            arrayOf("한만욱", "01034212440"),
            arrayOf("최민석", "01034223130"),
            arrayOf("김재걸", "01012335130"),
        )
        //custom View 추가
//        inflate 부모가 뭔지 알려주는것
        for (index in 0 until dataList.size) {
            val customView =
                layoutInflater.inflate(R.layout.content_activity_view, linearLayout, false)
            customView.findViewById<TextView>(R.id.name_text).text = dataList[index][0]
            customView.findViewById<TextView>(R.id.contact_text).text = dataList[index][1]
            linearLayout.addView(customView)

            customView.findViewById<TextView>(R.id.name_text).setOnClickListener {
            Log.d("result_data","test")
        }
//            Log.d 나 e로 함

//            자식 넣고 부모 위치 넣고 / 처음에 넣을것 아니기 때문에 false 넣고
//            커스텀 뷰는 스타일 속성을 xml 파일에서 해주도록 하는 장치
//            스타일 속성을 코틀린 코드 내에세 개발 하는 것은 추천 하지 않으며 코드가 매우 복잡하고 통일성이 떨어짐
//
        }
    }
}
