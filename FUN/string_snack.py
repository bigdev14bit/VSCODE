print("String Search Engine")
print()

WORD_STORAGE = []

sentence_input = input("Enter Some Sentence: ")
WORD_STORAGE.append([sentence_input])

print(WORD_STORAGE)
for things in WORD_STORAGE:
    print(things[0][2])

#word_input = input("Enter Word You Want To Search In Sentence: ")
#for word_input in sentence_input:
