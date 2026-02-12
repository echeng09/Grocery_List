# Elaine's Grocery List Deliverables
### 1. Additional Method Reflection
My additional method is printReceipt(). It prints a visual receipt of the items in the list with their respective prices and the total price displayed at the very bottom. This is useful for people using the program so it shows them what is in their list, each price, and the total all in one place. It also contributes to the grocery store feel as it reflects a receipt you would typically get at the grocery store! Here is the pseudocode:
- get map from getGroceryMap() method
- traverse through linked list
- for each value, get price and name from map
- print each item and its given price
- print summed total

### 2. Major Limitations
One limitation is that the user is expected to understand the index when adding or removing items from the list. An average person shopping for groceries won't understand how indices work in code. Therefore, a new system should be made so that the items are numbered or shown to the user as a numbered list, then add 1 to the index to get that number. This would benefit the program as it could be used by a wider audience (user-friendly) and be more practical for everyday use. It is important as it would improve the UI to be understandable and practical.

Other major issues are that users can add items that aren't listed in grocery list and all user inputs are case-sensitive.
