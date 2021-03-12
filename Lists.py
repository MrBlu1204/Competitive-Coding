#Consider a list (list = []). You can perform the following commands:

#1. insert i e: Insert integer e at position i.
#2. print: Print the list.
#3. remove e: Delete the first occurrence of integer e.
#4. append e: Insert integer e at the end of the list.
#5. sort: Sort the list.
#6. pop: Pop the last element from the list.
#7. reverse: Reverse the list.
#Initialize your list and read in the value of  followed by  lines of commands where each command will be of the  types listed above. Iterate through each command in order and perform the corresponding operation on your list.
if __name__ == '__main__':
    N = int(input())
    cmd =[]
    result=[]
    
    for i in range(N):
        x=input().split()
        cmd.append(x)
        
    for j in range(len(cmd)):
        if cmd[j][0]=='insert':
            i=int(cmd[j][1])
            e=int(cmd[j][2])
            result.insert(i,e)
            
        elif cmd[j][0]=='print':
            print(result)
            
        elif cmd[j][0]=='remove':
            e = int(cmd[j][1])
            result.remove(e)
            
        elif cmd[j][0]=='append':
            e = int(cmd[j][1])
            result.append(e)
        elif cmd[j][0]=='sort':
            result.sort()
        elif cmd[j][0]=='pop':
            result.pop()
        elif cmd[j][0]=='reverse':
            result.reverse()
