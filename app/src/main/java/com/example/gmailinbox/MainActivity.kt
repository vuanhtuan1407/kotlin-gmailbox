package com.example.gmailinbox

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.gmailinbox.ui.theme.GmailInboxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity);
        // Sample data
        val emails = arrayListOf<Email>(

        )

        emails.add(Email("John Doe", "Meeting Tomorrow", "Don't forget our meeting at 10 AM.", "10:00 AM"))
        emails.add(Email("Alice Smith", "Dinner Tonight", "Are you available for dinner tonight?", "07:30 PM"))
        emails.add(Email("David Johnson", "Project Update", "Here's the latest update on the project.", "03:45 AM"))
        emails.add(Email("Sarah Davis", "Weekend Getaway", "Let's plan a weekend getaway soon!", "11:15 AM"))
        emails.add(Email("Michael Wilson", "Task Assignment", "You have a new task assignment. Please review.", "01:20 PM"))
        emails.add(Email("Emily Brown", "Birthday Party", "Don't forget the birthday party on Saturday!", "08:10 AM"))
        emails.add(Email("Daniel Lee", "Important Announcement", "Please read this important announcement.", "02:30 PM"))
        emails.add(Email("Olivia Martinez", "Vacation Plans", "Let's discuss our vacation plans.", "09:45 AM"))
        emails.add(Email("Liam Harris", "Presentation Review", "We need to review the presentation for the client.", "12:30 PM"))
        emails.add(Email("Ava Miller", "New Project Kick-off", "Join us for the new project kick-off meeting.", "04:55 PM"))
        emails.add(Email("Noah Anderson", "Weekly Status Report", "Submit your weekly status report by Friday.", "09:20 AM"))
        emails.add(Email("Sophia Wilson", "Hiking Trip", "Are you up for a hiking trip next weekend?", "07:40 AM"))
        emails.add(Email("Mason Taylor", "Expense Report", "Please submit your expense report for approval.", "06:15 PM"))
        emails.add(Email("Isabella Jones", "Conference Call", "Schedule a conference call for next week.", "02:10 PM"))
        emails.add(Email("Logan White", "Team Building", "Let's plan a team-building event for the team.", "05:25 PM"))
        emails.add(Email("Grace Hall", "Meeting Agenda", "Agenda for our upcoming meeting attached.", "11:50 AM"))
        emails.add(Email("Lucas Green", "Product Update", "Here's the latest product update for your review.", "01:35 PM"))
        emails.add(Email("Lily Clark", "App Feedback", "We received valuable feedback from our users.", "04:05 AM"))
        emails.add(Email("Benjamin Walker", "Training Session", "Training session scheduled for this Wednesday.", "10:25 AM"))
        emails.add(Email("Zoe Turner", "Birthday Reminder", "Don't forget Zoe's birthday on November 5th.", "09:15 PM"))

        findViewById<ListView>(R.id.listView).adapter = EmailAdapter(emails)
    }
}