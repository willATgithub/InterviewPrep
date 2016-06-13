

class LinkedListNode:

    def __init__(self, value):
        self.value = value
        self.next  = None

    def __repr__(self):
        return "%s , %s" % (self.value,self.next) 
        
def delete_node(node):
    if node.next:
        node.value = node.next.value
        node.next = node.next.next
    else:    
        raise Exception("Can't delete the last node!")

print    
a = LinkedListNode('A')
b = LinkedListNode('B')
c = LinkedListNode('C')
d = LinkedListNode('D')

a.next = b
b.next = c

print a
delete_node(b)
print a
c.next = d
print a
delete_node(a)
print a
delete_node(d)
print a