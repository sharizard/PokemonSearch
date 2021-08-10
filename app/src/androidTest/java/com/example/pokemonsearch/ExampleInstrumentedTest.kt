package com.example.pokemonsearch

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Rule

@RunWith(AndroidJUnit4::class)
class CounterTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun counter_initially_zero() {
        val text = composeTestRule.activity.getString(R.string.clicks, 0)
        composeTestRule.onNodeWithText(text).assertExists()
    }

    @Test
    fun clickButton_increments_counter() {
        val incrementCounterText = composeTestRule.activity.getString(R.string.increment_counter)

        composeTestRule.onNodeWithText(incrementCounterText).performClick()

        val clicksText = composeTestRule.activity.getString(R.string.clicks, 1)

        composeTestRule.onNodeWithText(clicksText).assertExists()
    }
}