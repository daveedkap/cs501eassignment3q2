package com.example.assignment3q2.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.assignment3q2.ui.theme.Assignment3Q2Theme

/**
 * Q2: Box Layout - Profile Header + Overlay Card
 *
 * Requirements:
 * - Box: background, foreground avatar (CircleShape clip), overlay Card overlapping header
 * - contentAlignment, align(...), offset(...) (or padding)
 * - clip(CircleShape), offset, zIndex, shadow/elevation, aspectRatio or fixed size
 * - At least 5 M3: Card, Icon, Button, FilledTonalButton, AssistChip, TopAppBar, Badge, Surface
 */
@Composable
fun ProfileScreen() {
    Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
        Text("Build Box with header, avatar (clip CircleShape), and overlapping Card.", style = MaterialTheme.typography.bodyMedium)
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() { Assignment3Q2Theme { ProfileScreen() } }
