n = int(input())
n_list = list(map(int, input().split()))
target = int(input())
n_count = n_list.count(target)
print(n_count)