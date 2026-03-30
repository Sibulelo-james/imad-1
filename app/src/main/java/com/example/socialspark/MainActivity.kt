package com.example.socialspark

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    // Tag for logging
    companion object {
        private const val TAG = "SocialSparkApp"
    }

    // UI Components
    private lateinit var timeInput: TextInputEditText
    private lateinit var getSparkButton: android.widget.Button
    private lateinit var resetButton: android.widget.Button
    private lateinit var suggestionCard: android.widget.LinearLayout
    private lateinit var suggestionText: android.widget.TextView
    private lateinit var errorText: android.widget.TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate: App started successfully")

        // Initialize UI components
        initializeViews()

        // Set click listeners
        setupClickListeners()

        Log.i(TAG, "onCreate: UI setup completed")
    }

    /**
     * Initialize all UI components
     */
    private fun initializeViews() {
        timeInput = findViewById(R.id.timeInput)
        getSparkButton = findViewById(R.id.getSparkButton)
        resetButton = findViewById(R.id.resetButton)
        suggestionCard = findViewById(R.id.suggestionCard)
        suggestionText = findViewById(R.id.suggestionText)
        errorText = findViewById(R.id.errorText)

        Log.d(TAG, "initializeViews: All views initialized")
    }

    /**
     * Setup click listeners for buttons
     */
    private fun setupClickListeners() {
        getSparkButton.setOnClickListener {
            Log.d(TAG, "getSparkButton: Clicked")
            getSocialSpark()
        }

        resetButton.setOnClickListener {
            Log.d(TAG, "resetButton: Clicked")
            resetApp()
        }
    }

    /**
     * Get social spark suggestion based on time input
     */
    private fun getSocialSpark() {
        val timeInputText = timeInput.text.toString().trim()

        Log.d(TAG, "getSocialSpark: Input received - '$timeInputText'")

        // Validate input
        if (timeInputText.isEmpty()) {
            Log.w(TAG, "getSocialSpark: Empty input detected")
            showError("✨ Oops! Please enter a time of day to get your spark! ✨")
            hideSuggestion()
            return
        }

        // Convert input to lowercase for case-insensitive comparison
        val normalizedInput = timeInputText.lowercase()
        Log.d(TAG, "getSocialSpark: Normalized input - '$normalizedInput'")

        // Determine suggestion based on time input
        val suggestion = when {
            normalizedInput.contains("morning") && !normalizedInput.contains("mid") -> {
                Log.i(TAG, "Time detected: Morning")
                "🌅 Send a 'Good morning' text to a family member to brighten their day!"
            }
            normalizedInput.contains("mid-morning") || (normalizedInput.contains("mid") && normalizedInput.contains("morning")) -> {
                Log.i(TAG, "Time detected: Mid-morning")
                "💼 Reach out to a colleague with a quick 'Thank you' - appreciation goes a long way!"
            }
            normalizedInput.contains("afternoon") && !normalizedInput.contains("snack") -> {
                Log.i(TAG, "Time detected: Afternoon")
                "😄 Share a funny meme or interesting link with a friend to spread some joy!"
            }
            normalizedInput.contains("afternoon snack") || (normalizedInput.contains("snack") && normalizedInput.contains("afternoon")) -> {
                Log.i(TAG, "Time detected: Afternoon Snack Time")
                "💭 Send a quick 'thinking of you' message - sometimes a little reminder means everything!"
            }
            normalizedInput.contains("dinner") -> {
                Log.i(TAG, "Time detected: Dinner")
                "📞 Call a friend or relative for a 5-minute catch-up - your voice makes a difference!"
            }
            normalizedInput.contains("after dinner") || normalizedInput.contains("night") || normalizedInput.contains("evening") -> {
                Log.i(TAG, "Time detected: After Dinner/Night")
                "💬 Leave a thoughtful comment on a friend's post - engagement builds community!"
            }
            else -> {
                Log.w(TAG, "Invalid time input: $timeInputText")
                showError("🌟 Hmm, I don't recognize '$timeInputText'! Try: Morning, Mid-morning, Afternoon, Afternoon Snack, Dinner, or Night 🌟")
                hideSuggestion()
                return
            }
        }

        // Display the suggestion
        displaySuggestion(suggestion)
        hideError()

        // Show success feedback
        Toast.makeText(this, "✨ Spark generated! ✨", Toast.LENGTH_SHORT).show()
        Log.i(TAG, "getSocialSpark: Successfully generated suggestion for '$timeInputText'")
    }

    /**
     * Display the social spark suggestion
     */
    private fun displaySuggestion(suggestion: String) {
        suggestionText.text = suggestion
        suggestionCard.visibility = View.VISIBLE
        Log.d(TAG, "displaySuggestion: Suggestion displayed - '$suggestion'")
    }

    /**
     * Hide the suggestion card
     */
    private fun hideSuggestion() {
        suggestionCard.visibility = View.GONE
        Log.d(TAG, "hideSuggestion: Suggestion card hidden")
    }

    /**
     * Show error message
     */
    private fun showError(message: String) {
        errorText.text = message
        errorText.visibility = View.VISIBLE
        Log.d(TAG, "showError: Error message displayed - '$message'")
    }

    /**
     * Hide error message
     */
    private fun hideError() {
        errorText.visibility = View.GONE
        Log.d(TAG, "hideError: Error message hidden")
    }

    /**
     * Reset the app - clear input, hide suggestion and error
     */
    private fun resetApp() {
        Log.d(TAG, "resetApp: Resetting application")

        // Clear input field
        timeInput.text?.clear()

        // Hide suggestion and error
        hideSuggestion()
        hideError()

        // Show confirmation message
        Toast.makeText(this, "✨ Ready for a new social spark! ✨", Toast.LENGTH_SHORT).show()

        // Log the reset action
        Log.i(TAG, "resetApp: App reset successfully")

        // Request focus to input field
        timeInput.requestFocus()
    }
}