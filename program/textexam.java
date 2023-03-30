public cladef removeDuplicates(arr, n): 
    newarr = [] 
    for i in range(0, n): 
        if arr[i] not in newarr: 
            newarr.append(arr[i]) 
    return newarr 
  
# Driver Code 
n = int(input())
arr = list(map(int,input().split()))
ans = removeDuplicates(arr, n) 
for i in range(len(ans)): 
    print(ans[i], end = " ")