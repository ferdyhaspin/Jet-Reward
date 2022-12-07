package com.dicoding.jetreward.ui.navigation

/**
 * Created by ferdyhaspin on 07/12/22.
 */

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Cart : Screen("cart")
    object Profile : Screen("profile")
    object DetailReward : Screen("home/{rewardId}") {
        fun createRoute(rewardId: Long) = "home/$rewardId"
    }
}