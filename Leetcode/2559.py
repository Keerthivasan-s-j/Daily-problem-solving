class Solution:
    def vowelStrings(self, words, queries):
        res = []
        vowels = set("aeiou")
        l = len(words)
        prefix = [0] * (l + 1)
        for i in range(l):
            word = words[i]
            prefix[i+1] = prefix[i] + (1 if word[0] in vowels and word[-1] in vowels else 0)
        for l_i,r_i in queries:
            res.append(prefix[r_i + 1] - prefix[l_i])
        return res