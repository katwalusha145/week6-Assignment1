package com.usha.softusersoftwarica.Model

class User {
    fun Login(username: String, password: String): Boolean {
        return username.toLowerCase().equals("softwarica") &&
                password.toLowerCase().equals("coventry");
    }
}

