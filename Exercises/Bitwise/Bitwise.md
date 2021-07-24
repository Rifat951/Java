
# Bitwise AND/XOR

The bitwise AND & operator returns 1 if and only if both the operands are 1. Otherwise, it returns 0.

The following table demonstrates the working of the bitwise AND operator. Let a and b be two operands that can only take binary values i.e. 1 and 0.

a	b	a & b
0	0	0  --- false
0	1	0  --- false
1	0	0  --- false
1	1	1  --- true
Let's take a look at the bitwise AND operation of two integers 12 and 25.

12 = 00001100 (In Binary)
25 = 00011001 (In Binary)

// Bitwise AND Operation of 12 and 25
   00001100
 & 00011001
____________
   00001000 = 8 (In Decimal)
   
   
   
   
   
   
 # Bitwise XOR
 
   The bitwise XOR ^ operator returns 1 if and only if one of the operands is 1. However, if both the operands are 0 or if both are 1, then the result is 0.

The following truth table demonstrates the working of the bitwise XOR operator. Let a and b be two operands that can only take binary values i.e. 1 or 0.

a	b	a & b
0	0	0
0	1	1
1	0	1
1	1	0
Let's look at the bitwise XOR operation of two integers 12 and 25.

12 = 00001100 (In Binary)
25 = 00011001 (In Binary)

// Bitwise XOR Operation of 12 and 25
   00001100
 ^ 00011001
____________
   00010101 = 21 (In Decimal)
