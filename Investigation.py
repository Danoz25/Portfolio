# ask for the input of what they allegery or disorder

print("Do you have an allegery to gluten, peanuts, lactose, or are you diabetic? Please tell me")
user_selection = input()

gluten_list = ["Quinoa", "Brown Rice", "Oats", "Bananas", "Apples", "Berrers", "ALL Vegetables", "Fresh Poultry", " Fresh Red Meat", "Fresh Seafood", "Milk", "Butter", "Cheese", "Yogurt", "Sour Cream", "100% Fruit juice", "Black coffee", "Tea", "Tamari", "Coconut Aminos"]

lactose_list = ["Milk", "Cheese", "Ice Cream", "Creamer", "Yogurt", "Sour Cream", "Butter", "Whey", "Cookies", "Pudding", "Whipped Cream"]

peanut_list = ["Almonds", "Cashews", "Chestnuts", "HazelNuts", "Macadamia Nuts", "Pistachios", "Pecans", "Walnuts", "Trail mix", "Grain Breads", "Specific Baked Goods", "Specific Candy", "Veggie Burgers", "Nut butter", "Nut oils", "Nut pastes", "", "",]

diabetic_list = ["Sugar", "White Bread", "Pasta", "Rice", "Fruit Yogurt", "Flavored Coffee", "Syrups", "Fruit Juice", "French Fries",]

if user_selection == "gluten":
    print("This is a list of foods that you can get at your local super market.")
    print(gluten_list)

if user_selection == "peanuts":
    print("This is a list of foods that you should stay away from!")
    print(peanut_list)

if user_selection == "lactose":
    print("This is a list of foods that you should stay away from!")
    print(lactose_list)

if user_selection == "diabetic":
    print("This is a list of foods that you should stay away from!")
    print(diabetic_list)

else:
    print("Pick a allegery: gluten, peanuts, lactose or are you diabetic.")
