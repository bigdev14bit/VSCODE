print("-" * 90)
print("WELCOME TO YOUR PERSONAL PROBLEM LOGGER APP.")
print("-" * 90)
print()

PERSONS = []
isSolved = False

LIST_OF_PROBLEMS = f"""
"FINANCIAL"
"SPIRITUAL"
"EDUCATIONAL"
"BUSSINESS"
"TECHNICAL"
"""

menu = """
1. Enter New Problem.
2. View Problems For Each Persons.
3. View All Problems.
4. Solve A Problem.
5. Show Recounting Problem.
6. Exit.
"""

print(menu)
print()

while True:
    print()
    userInput = input("Enter Option: ")
    if userInput == "6":
        print()
        print("Exit Successfully.")
        break

    elif userInput == "1":
        first_name = input("Enter First Name: ")
        clean_name = first_name.strip().lower()

        problem_cat = input("Enter Problem Category: ")
        clean_prob_cat = problem_cat.strip().upper()

        problem = input("Enter Problem: ")
        clean_prob = problem.strip().lower()

        infos = {"first_name": clean_name,
                "problems": [{"problem_name": clean_prob, "category": clean_prob_cat, "solved": isSolved}]
               }
        
        PERSONS.append(infos)
        print()
        print(PERSONS)

    elif userInput == "2":
        print()
        print(f"Problems  For  A  Person.")
        print()

        if len(PERSONS) == 0:
            print("No People In The System.")
        else:
            the_person = input("Enter Persons Name: ")

            for person in PERSONS:
                if person["first_name"] == the_person:
                    print(f"Problem for {person["first_name"]}.")

                    if len(person["problems"]) == 0:
                        print(f"{person["first_name"]}  has no problem yet.")
                    else:
                        count = 1
                        for things in person["problems"]:
                            print(f"{count}. {things}")
                            count = count + 1

    elif userInput == "3":
        print()
        print("ALL   PROBLEMS.")
        print()

        if len(PERSONS) == 0:
            print("No People In The System.")
        else:
            for persons in PERSONS:
                print(persons["problems"])

    elif userInput == "4":
        print()
        print("Solve  A  Problem.")
        print()

        if len(PERSONS) == 0:
            print("No People In The System.")
        else:
            name = input("Enter Person's Name: ")

            for someone in PERSONS:
                if someone["first_name"] == name:

                    if len(someone["problems"]) == 0:
                        print(f"{name} has no problem to solve.")
                    else:
                        print(f"{name}  problem.")

                        count = 1
                        for prob in someone["problems"]:
                            print(prob["problems"])

                        problem_name = input("Enter Problem Name: ")

                        for another_prob in someone["problems"]:
                            if another_prob["problem_name"] == problem_name:
                                another_prob["solved"] = True
                                print(f"{problem_name} marked as solved.")
                            else:
                                print(f"{problem_name} not found.")

    else:
        print("Invalid Input.")
    
