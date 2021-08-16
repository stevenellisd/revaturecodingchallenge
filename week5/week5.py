def bucketize(string, n):
    result = []
    words = string.split()
    currentword = ""
    for i in range(len(words)):
        if len(words[i]) > n:
            return []
        if len(currentword+" "+words[i]) > n:
            if len(currentword) <= n:
                result.append(currentword)
            currentword = words[i]
        else:
            currentword = (currentword + " " + words[i]).strip()
    result.append(currentword)
    return result

print(bucketize("she sells sea shells by the sea", 10))
print(bucketize("the mouse jumped over the cheese", 7))
print(bucketize("fairy dust coated the air", 20))
print(bucketize("a b c d e", 2))
print(bucketize("potato", 3))