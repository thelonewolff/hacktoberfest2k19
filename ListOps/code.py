'''
Task: Delete alternate elements of the given list, starting from index 0,
      print the list after each traversal.

Example: given list -> [1,2,3,4,5]
                o/p: [2, 4]
                     [4]
                     []

'''

nums = [3, 5, 2, 9, 101, 333, 4]

def fn(l) :
    for i in l:
        if l.index(i)%2==0:
            l[l.index(i)]=''
    for i in l:
        if i=='':
            del l[l.index(i)]
    print(l)
    if l != [] :
        fn(l)

fn(nums)