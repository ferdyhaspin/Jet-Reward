package com.dicoding.jetreward

import androidx.navigation.NavController
import org.junit.Assert

/**
 * Created by ferdyhaspin on 07/12/22.
 */

fun NavController.assertCurrentRouteName(expectedRouteName: String) {
    Assert.assertEquals(expectedRouteName, currentBackStackEntry?.destination?.route)
}