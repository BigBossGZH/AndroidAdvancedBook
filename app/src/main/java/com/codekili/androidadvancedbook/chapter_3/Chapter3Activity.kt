package com.codekili.androidadvancedbook.chapter_3

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.annotation.NonNull
import android.support.annotation.RequiresPermission
import android.support.v7.app.AppCompatActivity
import android.support.v7.view.ActionMode
import android.transition.*
import android.view.LayoutInflater
import android.view.ViewGroup
import com.codekili.androidadvancedbook.R
import kotlinx.android.synthetic.main.activity_transition.*
import android.transition.ChangeBounds
import android.transition.TransitionManager
import android.view.Gravity
import android.view.View
import kotlinx.android.synthetic.main.fragment_transition_scene_after.*
import android.text.TextUtils
import android.support.annotation.CheckResult




 class Chapter3Activity :AppCompatActivity(){
    @SuppressLint("NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transition)
//        if (savedInstanceState == null) {
//            fragmentManager.beginTransaction()
//                    .add(R.id.container, TransitionFragment())
//                    .commit()
//        }

//        var aView = LayoutInflater.from(this).inflate(R.layout.fragment_transition_seene_before, null)
//
//        var sceneA =Scene.getSceneForLayout(aView as ViewGroup?,R.id.container,this)

        var bView = LayoutInflater.from(this).inflate(R.layout.fragment_transition_scene_after, null)

        var sceneB =Scene.getSceneForLayout(container,R.layout.fragment_transition_scene_after,this)
        //XML
//        var transitionInflater =TransitionInflater.from(this);
//        var mTransitionManager =transitionInflater.
//        inflateTransitionManager(R.t)
        goButton.setOnClickListener {
            TransitionManager.go(sceneB, ChangeBounds())
        }
        goButton.gravity=Gravity.CENTER
//        checkValid("a")
    }


//    @CheckResult(suggest = "aaaa")
//    abstract fun checkValid(value: String): Boolean

    @SuppressLint("NewApi")
    fun goToScene( scene: Scene){
        var changeBounds = ChangeBounds()
        changeBounds.duration = 2000
        var fadeOut = Fade(Fade.OUT)
        fadeOut.duration=2000
        var fadeIn =Fade(Fade.IN)
        fadeIn.duration=2000
        var transition =TransitionSet()
        transition.ordering=TransitionSet.ORDERING_SEQUENTIAL
        transition.addTransition(fadeOut).addTransition(changeBounds)
                .addTransition(fadeIn)
        TransitionManager.go(scene,transition)

    }
}