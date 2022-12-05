f = open("python/advent2022/data/one_sample.txt")
lines = f.read()

result = 0
current = 0

for line in lines:
  if line == "\n":
    result = max(current, result)
    current = 0
    continue

   current += int(line.strip())

print(current)