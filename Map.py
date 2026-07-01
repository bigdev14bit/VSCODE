state_regions = {"north_central": ["Benue", "Kogi", "Kwara", "Nassarawa", "Niger", "Plateau", "FCT(ABUJA)"],
                 "east": [""],
                 "north_west": ["Jigawa", "Kaduna", "Kano", "Katisna", "Kebbi", "Sokoto", "Zamfara"],
                 "south_east": ["Abia", "Anambra", "Ebonyi", "Enugu", "Imo"],
                 "south_south": ["Akwa_ibom", "Bayelsa", "Cross_river", "Delta", "Edo", ""],
                 "south_west": ["Ekiti", "Lagos_state", "Ogun_state", "Ondo_state", "Osun_state", "Oyo_state"]}

while True:
    userInput = input("Enter A State: ")
    clean_input = userInput.lower()

    if clean_input == "quit":
        print()
        print("Exit Successfully.")
        break

    for region, states in state_regions.items():

        for state in states:
            clean_state = state.lower()

            if userInput in clean_state:
                print()
                print(f"'{userInput}' belongs to '{clean_state}'")
            else:
                continue