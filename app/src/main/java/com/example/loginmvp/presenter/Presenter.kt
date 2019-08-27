package com.example.loginmvp.presenter

import com.example.loginmvp.model.LoginModel

class Presenter(_view : ViewInterface):PresenterInterface {

    var view = _view

    override fun onExecute(email: String, password: String) {



        if (email.equals(LoginModel.EMAIL) && password.equals(LoginModel.PASSWORD)){

            view.onSuccess()
        }
    }


}