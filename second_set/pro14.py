sentence = "Hello Python"
sentence = sentence.split()
pig_latin_words = ""
print(sentence)
for word in sentence:
    first_letter = word[0]
    rest_of_word = word[1:]
    new_word = rest_of_word + first_letter + "ay" + " "
    pig_latin_words += new_word
print(pig_latin_words)
