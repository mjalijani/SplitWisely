package com.mjalijani.splitwisely.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mjalijani.splitwisely.R
import com.mjalijani.splitwisely.data.MockData.fakeTransaction
import com.mjalijani.splitwisely.data.common.TransactionItem

@Composable
fun ExpenseItem(
    modifier: Modifier = Modifier,
    item: TransactionItem
) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = item.profile),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
        )

        Gap(4)

        Column(modifier = Modifier.weight(1f)) {
            TextApp(
                item.title,
                textColor = Color.Black
            )

            Gap(4)

            TextApp(
                text = item.subtitle,
                textColor = item.color
            )
        }

        TextApp(
            text = item.dateTime,
            textColor = Color.Gray,
            modifier = Modifier.align(Alignment.Bottom)
        )

    }
}

@Composable
fun GroupSummaryCard(
    profileImageRes: Int,
    groupName: String,
    totalOwe: String,
    memberImages: List<Int> // لیستی از تصاویر اعضا
) {
    Card(
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Column {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                // تصویر پروفایل گروه
                Image(
                    painter = painterResource(id = profileImageRes),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                )

                Spacer(modifier = Modifier.width(8.dp))

                // نام گروه
                Text(
                    text = groupName,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.weight(1f)
                )

                // تصاویر اعضا
                Row {
                    memberImages.take(2).forEach { imageRes ->
                        Image(
                            painter = painterResource(id = imageRes),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(24.dp)
                                .clip(CircleShape)
                                .padding(end = 4.dp)
                        )
                    }
                    Text(
                        text = "+23", // تعداد اضافی اعضا
                        fontSize = 14.sp,
                        color = Color.Gray
                    )
                }
            }

            // بخش مبلغ بدهی و دکمه جزئیات
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp)
                    .background(Color(0xFFF5F5F5)) // رنگ پس‌زمینه خاکستری روشن
            ) {
                Text(
                    text = "Total owe",
                    fontSize = 14.sp,
                    color = Color.Gray
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = totalOwe,
                    fontSize = 14.sp,
                    color = Color(0xFF00AA00), // رنگ سبز برای مبلغ
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    text = "Details",
                    fontSize = 14.sp,
                    color = Color.Gray
                )
            }
        }
    }
}

@Preview
@Composable
private fun GroupSummaryCardPreview() {
    GroupSummaryCard(
        profileImageRes = R.drawable.profile,
        groupName = "Group name",
        totalOwe = "$190.00",
        memberImages = listOf(R.drawable.profile, R.drawable.profile)
    )
}

@Composable
fun GroupOweCard(
    profileImageRes: Int,
    groupName: String,
    totalOwe: String,
    memberList: List<Member>,
    expanded: Boolean = false
) {
    val isExpanded = remember { mutableStateOf(expanded) }

    Card(
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            // Row: Group info with toggle button
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                // Group profile image
                Image(
                    painter = painterResource(id = profileImageRes),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                )

                Spacer(modifier = Modifier.width(8.dp))

                // Group name and member count
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = groupName,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = painterResource(id = profileImageRes),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(20.dp)
                                .clip(CircleShape)
                        )
                        Text(
                            text = "+23", // تعداد اعضای گروه
                            fontSize = 14.sp,
                            color = Color.Gray,
                            modifier = Modifier.padding(start = 4.dp)
                        )
                    }
                }

                // Total owe amount and details button
                Column(horizontalAlignment = Alignment.End) {
                    Text(
                        text = "Total owe $totalOwe",
                        fontSize = 14.sp,
                        color = Color(0xFF00AA00), // سبز
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Details",
                        fontSize = 14.sp,
                        color = Color.Gray,
                        modifier = Modifier.padding(top = 4.dp)
                    )
                }
            }

            // Expanded content
            if (isExpanded.value) {
                Column(modifier = Modifier.padding(top = 16.dp)) {
                    memberList.forEach { member ->
                        MemberOweItem(member = member)
                    }
                }
            }
        }
    }
}

@Composable
fun MemberOweItem(member: Member) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
    ) {
        // Member profile image
        Image(
            painter = painterResource(id = member.profileImageRes),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(36.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.width(8.dp))

        // Member name and owe status
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = member.name,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold
            )
        }

        // Owe amount
        Text(
            text = if (member.owesYou) "Owes you ${member.amount}" else "Owe ${member.name} ${member.amount}",
            fontSize = 14.sp,
            color = if (member.owesYou) Color(0xFF00AA00) else Color.Red, // سبز برای بستانکاری، قرمز برای بدهی
            fontWeight = FontWeight.Bold
        )
    }
}

// مدل داده اعضا
data class Member(
    val profileImageRes: Int,
    val name: String,
    val amount: String,
    val owesYou: Boolean
)

@Preview
@Composable
private fun GroupOweCardPreview() {
    GroupOweCard(
        profileImageRes = R.drawable.profile,
        groupName = "Group name",
        totalOwe = "$150.00",
        memberList = listOf(
            Member(
                profileImageRes = R.drawable.profile,
                name = "Farhad R.",
                amount = "$5",
                owesYou = true
            ),
            Member(
                profileImageRes = R.drawable.profile,
                name = "Farhad R.",
                amount = "$5",
                owesYou = true
            ),
            Member(
                profileImageRes = R.drawable.profile,
                name = "Reza Y.",
                amount = "$5",
                owesYou = false
            )
        )
    )
}

@Preview
@Composable
private fun ExpenseItemPreview() {
    ExpenseItem(
        item = fakeTransaction
    )
}